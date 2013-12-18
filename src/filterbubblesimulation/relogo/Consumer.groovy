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

class Consumer extends ReLogoTurtle {
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
	protected String agentID = "Consumer " + (agentIDCounter++)

	
	def X = randomFloat(1)
	def Y = randomFloat(1)
	def producersRanking = [:]
	def knowledge = [0,0,0,0,0]
	int willToRead = 30
	def disinterest_threshold = globalThreshold
	def step(){
		for(producer in producers() ){
			producersRanking[producer.agentID] = 1 
		}
		/* 1st version: with every tick, consume some (1) information from every producer. Every information falls into one of M=5 categories, so improve knowledge of that category by 1 */
		this.consumeInformation()
	}
	
	def euclideanDistance(vectorA,vectorB){
		def i = 0
		def distance = 0
		for(A in vectorA){
			distance = distance + ( (vectorA[i] - vectorB[i]) * (vectorA[i] - vectorB[i]) ) // !! TOFIX FIX BUG : vectors of length 0 accepted
			i = i + 1
		}
		return sqrt(distance)
	}
	
	def consumeInformation(){
		this.willToRead = globalWillToRead /* For the time being, willingness to read is constant for every Consumer*/
		
		//while( this.willToRead > 0 ){ /* TOFIX. CAUTION -> Infinite loop possible. Try to avoid it*/
		
		for(producerID in producersRanking.sort{a, b -> a.value <=> b.value}.reverse()){
			//def source = oneOf(producers()) // Consumer chooses producers by random - should have own list of Producer id's and sort it according to "relevance" of results
			//def maxVal =  producersRanking.max{ it.value }.value
			//
			def source = producers.findAll{ it.agentID == producerID } 
			
			source.recordID(this.agentID)	// send agentID to producer - once chosen, producer can record user's data (agentID) to start profiling information 
			def information_served = source.handleUserRequest(this.agentID) // receive profiled information from producer
			
			for(int i = 0; i < information_served.size();i++){
				this.willToRead -= 1 // To model "reviewing headlines" - this should also consume "willingness to read"
				def distance = this.euclideanDistance( [information_served[i][0], this.X], [information_served[i][1],this.Y])
				if( distance < this.disinterest_threshold   )
				/* if euclidean distance between information's X and Y and consumer's X and Y is below THRESHOLD (e.i. 0,5) consume */
				{
					// TODO modify users knowledge
					source.recalculatePreferences(this.agentID,information_served[i][0], information_served[i][1])// send info to the producer that user has consumed information with value of X and Y
					this.willToRead -= (2.828427 * distance) + 1// will to read decreases as information has been consumed proportionally to distance of information from user preferences
					/* However, willingness to read can increase (a little) if agent consumes something very close to his/hers preferences*/
					/* A larger discussion on whether people actually tend to consume information that is closer to their preferences. That is all very well, but
					 * the metaphor of information as "normal good" is problematic. Behavior on the "market" of information is at best a little different from "normal" one.
					 * In the worst case scenario, we need completely different model of agents  */
					producersRanking[producerID] += 1 // if agent read news that satisfied his/hers preferences, increment this value in the consumer's producers ranking
					if(this.willToRead <= 0){
						break
					}
				}
				else{
					this.willToRead -= 1
					if(this.willToRead <= 0){
						break
					}
				}
			}
		}
		
	}
	
	def modifyKnowledge(){
		
	}
	
}
