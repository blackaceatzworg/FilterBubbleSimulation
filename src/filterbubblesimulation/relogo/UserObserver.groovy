package filterbubblesimulation.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import filterbubblesimulation.ReLogoObserver;

class UserObserver extends ReLogoObserver{
	@Setup
	def setup(){
		clearAll()
		setDefaultShape(Consumer,"person")
		createConsumers(numConsumers){
			setxy(randomXcor(),randomYcor())
		}
		setDefaultShape(Producer,"alien")
		createProducers(numProducers){
			setxy(randomXcor(),randomYcor())
			size = 2
		}
		
		
	}
	
	@Go
	def go(){
		ask(producers()){
			step()
		}
		ask(consumers()){
			step()
		}
		
	}

	def averageWillToRead(){
		def sum = 0;
		def N = 0;
		for(consumer in consumers() ){
			sum = sum + consumer.willToRead
			N = N + 1
		}
		return(sum/N)
	}
	
	/**
	 * Add observer methods here. For example:

		@Setup
		def setup(){
			clearAll()
			createTurtles(10){
				forward(random(10))
			}
		}
		
	 *
	 * or
	 * 	
	
		@Go
		def go(){
			ask(turtles()){
				left(random(90))
				right(random(90))
				forward(random(10))
			}
		}

	 */

}