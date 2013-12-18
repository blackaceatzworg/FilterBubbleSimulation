package filterbubblesimulation.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.Plural;
import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import filterbubblesimulation.ReLogoTurtle;


class News {
	
	def X = randomFloat(1)
	def Y = randomFloat(1)
}

class Producer extends ReLogoTurtle {
	/**
	 *
	 * This value is used to automatically generate agent identifiers.
	 * @field serialVersionUID
	 *
	 */
	private static final long serialVersionUID = 1L

	/**
	 *
	 * This value is used to automatically generate agent identifiers.
	 * @field agentIDCounter
	 *
	 */
	protected static long agentIDCounter = 1

	/**
	 *
	 * This value is the agent's identifier.
	 * @field agentID
	 *
	 */
	protected String agentID = "Producer " + (agentIDCounter++)

	
	def numberOfNews = 20
	def news_collection = []
	def user_collection = [:]
	def step(){
		/* in every step, produce and profile information for each user */
		def i = 0
		while(i < numberOfNews)
		{
			//News news = new News()
			//self.news_collection.collect(news)
			news_collection[i] = [randomFloat(1), randomFloat(1) ]
			i = i + 1
		}
		
	}
	
	def euclideanDistance(vectorA,vectorB){
		def i = 0
		def distance = 0
		for(A in vectorA){
			distance = distance + ( (vectorA[i] - vectorB[i]) * (vectorA[i] - vectorB[i]) )
			i = i + 1
		}
		return sqrt(distance)
	}
	/*
	 * Serve information: list of news ordered by euclidean distance from news parameters and "estimated" user preferences
	 * 
	 * */
	def handleUserRequest(id){
		
		def user_profile = this.user_collection[id]
		def profiled_news = this.news_collection.sort({ this.euclideanDistance([it[0], user_profile["x"] ], [ it[1], user_profile["y"] ] )  })   //  user_profile.sort( {  } ) 
		return(profiled_news)
	}
	
	def recordID(id){
		if(!this.user_collection[id]){ // If user doesn't have a profile yet, add user to the list and ...
			this.user_collection[id] = [ "N": 1, "x" : randomFloat(1) , "y" : randomFloat(1)] // ... average user preferences. Assume random at first.
		}
	}
	/*
	 * Recalculate user's preferences - receive new data and compute mean preferences of the user
	 * */
	def recalculatePreferences(userID, x, y){
		this.user_collection[userID]["N"] += 1
		this.user_collection[userID]["x"] = ( this.user_collection[userID]["x"] * ((this.user_collection[userID]["N"] - 1 ) / this.user_collection[userID]["N"] ) ) + (x * ( 1 / this.user_collection[userID]["N"] ) )
		this.user_collection[userID]["x"] = ( this.user_collection[userID]["y"] * ((this.user_collection[userID]["N"] - 1 ) / this.user_collection[userID]["N"] ) ) + (y * ( 1 / this.user_collection[userID]["N"] ) )
	}
}
