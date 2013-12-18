package filterbubblesimulation;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.ast.Diffusible;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoPatch extends BasePatch{

	/**
	 * Sprouts (makes) a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> sproutUserTurtles(int number, Closure closure) {
		AgentSet<filterbubblesimulation.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof filterbubblesimulation.relogo.UserTurtle){
				result.add((filterbubblesimulation.relogo.UserTurtle)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> sproutUserTurtles(int number) {
		return sproutUserTurtles(number,null);
	}

	/**
	 * Returns an agentset of userTurtles from the patch of the caller.
	 * 
	 * @return agentset of userTurtles from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> userTurtlesHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<filterbubblesimulation.relogo.UserTurtle> result = new AgentSet<filterbubblesimulation.relogo.UserTurtle>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof filterbubblesimulation.relogo.UserTurtle)
			result.add((filterbubblesimulation.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of userTurtles on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of userTurtles at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> userTurtlesAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<filterbubblesimulation.relogo.UserTurtle> result = new AgentSet<filterbubblesimulation.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof filterbubblesimulation.relogo.UserTurtle)
			result.add((filterbubblesimulation.relogo.UserTurtle)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<filterbubblesimulation.relogo.UserTurtle>();
		}
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<filterbubblesimulation.relogo.UserTurtle> result = new AgentSet<filterbubblesimulation.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"userTurtle")){
			if (t instanceof filterbubblesimulation.relogo.UserTurtle)
			result.add((filterbubblesimulation.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<filterbubblesimulation.relogo.UserTurtle> result = new AgentSet<filterbubblesimulation.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"userTurtle")){
			if (tt instanceof filterbubblesimulation.relogo.UserTurtle)
			result.add((filterbubblesimulation.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<filterbubblesimulation.relogo.UserTurtle>();
		}

		Set<filterbubblesimulation.relogo.UserTurtle> total = new HashSet<filterbubblesimulation.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<filterbubblesimulation.relogo.UserTurtle>(total);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof filterbubblesimulation.relogo.UserTurtle);
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> userTurtles(){
		AgentSet<filterbubblesimulation.relogo.UserTurtle> a = new AgentSet<filterbubblesimulation.relogo.UserTurtle>();
		for (Object e : this.getMyObserver().getContext().getObjects(filterbubblesimulation.relogo.UserTurtle.class)) {
			if (e instanceof filterbubblesimulation.relogo.UserTurtle){
				a.add((filterbubblesimulation.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public filterbubblesimulation.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof filterbubblesimulation.relogo.UserTurtle)
			return (filterbubblesimulation.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Sprouts (makes) a number of new producers and then executes a set of commands on the
	 * created producers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created producers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> sproutProducers(int number, Closure closure) {
		AgentSet<filterbubblesimulation.relogo.Producer> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Producer");
		for (Turtle t : createResult){
			if (t instanceof filterbubblesimulation.relogo.Producer){
				result.add((filterbubblesimulation.relogo.Producer)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new producers and then executes a set of commands on the
	 * created producers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created producers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> sproutProducers(int number) {
		return sproutProducers(number,null);
	}

	/**
	 * Returns an agentset of producers from the patch of the caller.
	 * 
	 * @return agentset of producers from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> producersHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<filterbubblesimulation.relogo.Producer> result = new AgentSet<filterbubblesimulation.relogo.Producer>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"producer")){
			if (t instanceof filterbubblesimulation.relogo.Producer)
			result.add((filterbubblesimulation.relogo.Producer)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of producers on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of producers at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> producersAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<filterbubblesimulation.relogo.Producer> result = new AgentSet<filterbubblesimulation.relogo.Producer>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"producer")){
			if (t instanceof filterbubblesimulation.relogo.Producer)
			result.add((filterbubblesimulation.relogo.Producer)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<filterbubblesimulation.relogo.Producer>();
		}
	}

	/**
	 * Returns an agentset of producers on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of producers on patch p
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> producersOn(Patch p){
		AgentSet<filterbubblesimulation.relogo.Producer> result = new AgentSet<filterbubblesimulation.relogo.Producer>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"producer")){
			if (t instanceof filterbubblesimulation.relogo.Producer)
			result.add((filterbubblesimulation.relogo.Producer)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of producers on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of producers on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> producersOn(Turtle t){
		AgentSet<filterbubblesimulation.relogo.Producer> result = new AgentSet<filterbubblesimulation.relogo.Producer>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"producer")){
			if (tt instanceof filterbubblesimulation.relogo.Producer)
			result.add((filterbubblesimulation.relogo.Producer)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of producers on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of producers on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> producersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<filterbubblesimulation.relogo.Producer>();
		}

		Set<filterbubblesimulation.relogo.Producer> total = new HashSet<filterbubblesimulation.relogo.Producer>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(producersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(producersOn(p));
				}
			}
		}
		return new AgentSet<filterbubblesimulation.relogo.Producer>(total);
	}

	/**
	 * Queries if object is a producer.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a producer
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public boolean isProducerQ(Object o){
		return (o instanceof filterbubblesimulation.relogo.Producer);
	}

	/**
	 * Returns an agentset containing all producers.
	 * 
	 * @return agentset of all producers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> producers(){
		AgentSet<filterbubblesimulation.relogo.Producer> a = new AgentSet<filterbubblesimulation.relogo.Producer>();
		for (Object e : this.getMyObserver().getContext().getObjects(filterbubblesimulation.relogo.Producer.class)) {
			if (e instanceof filterbubblesimulation.relogo.Producer){
				a.add((filterbubblesimulation.relogo.Producer)e);
			}
		}
		return a;
	}

	/**
	 * Returns the producer with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public filterbubblesimulation.relogo.Producer producer(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof filterbubblesimulation.relogo.Producer)
			return (filterbubblesimulation.relogo.Producer) turtle;
		return null;
	}

	/**
	 * Sprouts (makes) a number of new consumers and then executes a set of commands on the
	 * created consumers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created consumers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> sproutConsumers(int number, Closure closure) {
		AgentSet<filterbubblesimulation.relogo.Consumer> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.sprout(number,closure,"Consumer");
		for (Turtle t : createResult){
			if (t instanceof filterbubblesimulation.relogo.Consumer){
				result.add((filterbubblesimulation.relogo.Consumer)t);
			}
		} 
		return result;
	}

	/**
	 * Sprouts (makes) a number of new consumers and then executes a set of commands on the
	 * created consumers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created consumers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> sproutConsumers(int number) {
		return sproutConsumers(number,null);
	}

	/**
	 * Returns an agentset of consumers from the patch of the caller.
	 * 
	 * @return agentset of consumers from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> consumersHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<filterbubblesimulation.relogo.Consumer> result = new AgentSet<filterbubblesimulation.relogo.Consumer>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"consumer")){
			if (t instanceof filterbubblesimulation.relogo.Consumer)
			result.add((filterbubblesimulation.relogo.Consumer)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of consumers on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of consumers at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> consumersAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getGridLocationAsNdPoint(),displacement,getMyObserver());
		AgentSet<filterbubblesimulation.relogo.Consumer> result = new AgentSet<filterbubblesimulation.relogo.Consumer>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"consumer")){
			if (t instanceof filterbubblesimulation.relogo.Consumer)
			result.add((filterbubblesimulation.relogo.Consumer)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<filterbubblesimulation.relogo.Consumer>();
		}
	}

	/**
	 * Returns an agentset of consumers on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of consumers on patch p
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> consumersOn(Patch p){
		AgentSet<filterbubblesimulation.relogo.Consumer> result = new AgentSet<filterbubblesimulation.relogo.Consumer>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"consumer")){
			if (t instanceof filterbubblesimulation.relogo.Consumer)
			result.add((filterbubblesimulation.relogo.Consumer)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of consumers on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of consumers on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> consumersOn(Turtle t){
		AgentSet<filterbubblesimulation.relogo.Consumer> result = new AgentSet<filterbubblesimulation.relogo.Consumer>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"consumer")){
			if (tt instanceof filterbubblesimulation.relogo.Consumer)
			result.add((filterbubblesimulation.relogo.Consumer)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of consumers on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of consumers on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> consumersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<filterbubblesimulation.relogo.Consumer>();
		}

		Set<filterbubblesimulation.relogo.Consumer> total = new HashSet<filterbubblesimulation.relogo.Consumer>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(consumersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(consumersOn(p));
				}
			}
		}
		return new AgentSet<filterbubblesimulation.relogo.Consumer>(total);
	}

	/**
	 * Queries if object is a consumer.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a consumer
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public boolean isConsumerQ(Object o){
		return (o instanceof filterbubblesimulation.relogo.Consumer);
	}

	/**
	 * Returns an agentset containing all consumers.
	 * 
	 * @return agentset of all consumers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> consumers(){
		AgentSet<filterbubblesimulation.relogo.Consumer> a = new AgentSet<filterbubblesimulation.relogo.Consumer>();
		for (Object e : this.getMyObserver().getContext().getObjects(filterbubblesimulation.relogo.Consumer.class)) {
			if (e instanceof filterbubblesimulation.relogo.Consumer){
				a.add((filterbubblesimulation.relogo.Consumer)e);
			}
		}
		return a;
	}

	/**
	 * Returns the consumer with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public filterbubblesimulation.relogo.Consumer consumer(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof filterbubblesimulation.relogo.Consumer)
			return (filterbubblesimulation.relogo.Consumer) turtle;
		return null;
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof filterbubblesimulation.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet<filterbubblesimulation.relogo.UserLink> userLinks(){
		AgentSet<filterbubblesimulation.relogo.UserLink> a = new AgentSet<filterbubblesimulation.relogo.UserLink>();
		for (Object e : this.getMyObserver().getContext().getObjects(filterbubblesimulation.relogo.UserLink.class)) {
			if (e instanceof filterbubblesimulation.relogo.UserLink){
				a.add((filterbubblesimulation.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public filterbubblesimulation.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (filterbubblesimulation.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public filterbubblesimulation.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Queries if object is a information.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a information
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public boolean isInformationQ(Object o){
		return (o instanceof filterbubblesimulation.relogo.Information);
	}

	/**
	 * Returns an agentset containing all informations.
	 * 
	 * @return agentset of all informations
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet<filterbubblesimulation.relogo.Information> informations(){
		AgentSet<filterbubblesimulation.relogo.Information> a = new AgentSet<filterbubblesimulation.relogo.Information>();
		for (Object e : this.getMyObserver().getContext().getObjects(filterbubblesimulation.relogo.Information.class)) {
			if (e instanceof filterbubblesimulation.relogo.Information){
				a.add((filterbubblesimulation.relogo.Information)e);
			}
		}
		return a;
	}

	/**
	 * Returns the information between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return information between two turtles
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public filterbubblesimulation.relogo.Information information(Number oneEnd, Number otherEnd) {
		return (filterbubblesimulation.relogo.Information)(this.getMyObserver().getNetwork("Information").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the information between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return information between two turtles
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public filterbubblesimulation.relogo.Information information(Turtle oneEnd, Turtle otherEnd) {
		return information(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable numConsumers.
	 *
	 * @return the value of the global variable numConsumers
	 */
	@ReLogoBuilderGeneratedFor("global: numConsumers")
	public Object getNumConsumers(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numConsumers");
	}

	/**
	 * Sets the value of the global variable numConsumers.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numConsumers")
	public void setNumConsumers(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numConsumers",value);
	}

	/**
	 * Returns the value of the global variable numProducers.
	 *
	 * @return the value of the global variable numProducers
	 */
	@ReLogoBuilderGeneratedFor("global: numProducers")
	public Object getNumProducers(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numProducers");
	}

	/**
	 * Sets the value of the global variable numProducers.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numProducers")
	public void setNumProducers(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numProducers",value);
	}

	/**
	 * Returns the value of the global variable globalThreshold.
	 *
	 * @return the value of the global variable globalThreshold
	 */
	@ReLogoBuilderGeneratedFor("global: globalThreshold")
	public Object getGlobalThreshold(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("globalThreshold");
	}

	/**
	 * Sets the value of the global variable globalThreshold.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: globalThreshold")
	public void setGlobalThreshold(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("globalThreshold",value);
	}

	/**
	 * Returns the value of the global variable globalWillToRead.
	 *
	 * @return the value of the global variable globalWillToRead
	 */
	@ReLogoBuilderGeneratedFor("global: globalWillToRead")
	public Object getGlobalWillToRead(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("globalWillToRead");
	}

	/**
	 * Sets the value of the global variable globalWillToRead.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: globalWillToRead")
	public void setGlobalWillToRead(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("globalWillToRead",value);
	}


}