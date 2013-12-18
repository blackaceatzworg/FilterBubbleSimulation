package filterbubblesimulation;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoTurtle extends BaseTurtle{

	/**
	 * Makes a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> hatchUserTurtles(int number, Closure closure) {
		AgentSet<filterbubblesimulation.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof filterbubblesimulation.relogo.UserTurtle){
				result.add((filterbubblesimulation.relogo.UserTurtle)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserTurtle")
	public AgentSet<filterbubblesimulation.relogo.UserTurtle> hatchUserTurtles(int number) {
		return hatchUserTurtles(number,null);
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
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
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
	 * Makes a number of new producers and then executes a set of commands on the
	 * created producers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created producers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> hatchProducers(int number, Closure closure) {
		AgentSet<filterbubblesimulation.relogo.Producer> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"Producer");
		for (Turtle t : createResult){
			if (t instanceof filterbubblesimulation.relogo.Producer){
				result.add((filterbubblesimulation.relogo.Producer)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new producers and then executes a set of commands on the
	 * created producers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created producers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Producer")
	public AgentSet<filterbubblesimulation.relogo.Producer> hatchProducers(int number) {
		return hatchProducers(number,null);
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
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
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
	 * Makes a number of new consumers and then executes a set of commands on the
	 * created consumers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created consumers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> hatchConsumers(int number, Closure closure) {
		AgentSet<filterbubblesimulation.relogo.Consumer> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"Consumer");
		for (Turtle t : createResult){
			if (t instanceof filterbubblesimulation.relogo.Consumer){
				result.add((filterbubblesimulation.relogo.Consumer)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new consumers and then executes a set of commands on the
	 * created consumers.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created consumers
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Consumer")
	public AgentSet<filterbubblesimulation.relogo.Consumer> hatchConsumers(int number) {
		return hatchConsumers(number,null);
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
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
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
	 * Makes a directed userLink from a turtle to the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public filterbubblesimulation.relogo.UserLink createUserLinkFrom(Turtle t, Closure closure){
		filterbubblesimulation.relogo.UserLink link = (filterbubblesimulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public filterbubblesimulation.relogo.UserLink createUserLinkFrom(Turtle t){
			return createUserLinkFrom(t,null);
	}

	/**
	 * Makes directed userLinks from a collection to the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet<filterbubblesimulation.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a, Closure closure){
		AgentSet<filterbubblesimulation.relogo.UserLink> links = new AgentSet<filterbubblesimulation.relogo.UserLink>();
		for(Turtle t : a){
			links.add((filterbubblesimulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this));
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks from a collection to the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet<filterbubblesimulation.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a){
		return createUserLinksFrom(a,null);
	}

	/**
	 * Makes a directed userLink to a turtle from the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public filterbubblesimulation.relogo.UserLink createUserLinkTo(Turtle t, Closure closure){
		filterbubblesimulation.relogo.UserLink link = (filterbubblesimulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,t);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public filterbubblesimulation.relogo.UserLink createUserLinkTo(Turtle t){
			return createUserLinkTo(t,null);
	}

	/**
	 * Makes directed userLinks to a collection from the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet<filterbubblesimulation.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a, Closure closure){
		AgentSet<filterbubblesimulation.relogo.UserLink> links = new AgentSet<filterbubblesimulation.relogo.UserLink>();
		for(Object t : a){
			if (t instanceof Turtle){
				links.add((filterbubblesimulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,(Turtle)t));
			}
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks to a collection from the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet<filterbubblesimulation.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a){
		return createUserLinksTo(a,null);
	}

	/**
	 * Queries if there is a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink from
	 *         turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public boolean inUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(t, this);
	}

	/**
	 * Returns the agentset with directed userLinks to the caller.
	 * 
	 * @return agentset with directed userLinks to the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet inUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getPredecessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink from turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public filterbubblesimulation.relogo.UserLink inUserLinkFrom(Turtle t){
		return (filterbubblesimulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(t,this);
	}

	/**
	 * Returns an agentset of directed userLinks from other turtles to the caller.
	 * 
	 * @return agentset of directed userLinks from other turtles to the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet<filterbubblesimulation.relogo.UserLink> myInUserLinks(){
		AgentSet<filterbubblesimulation.relogo.UserLink> result = new AgentSet<filterbubblesimulation.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getInEdges(this)){
			if (o instanceof filterbubblesimulation.relogo.UserLink){
				result.add((filterbubblesimulation.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Returns an agentset of directed userLinks to other turtles from the caller.
	 * 
	 * @return agentset of directed userLinks to other turtles from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet<filterbubblesimulation.relogo.UserLink> myOutUserLinks(){
		AgentSet<filterbubblesimulation.relogo.UserLink> result = new AgentSet<filterbubblesimulation.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getOutEdges(this)){
			if (o instanceof filterbubblesimulation.relogo.UserLink){
				result.add((filterbubblesimulation.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Queries if there is a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink to
	 *         turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public boolean outUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(this, t);
	}

	/**
	 * Returns the agentset with directed userLinks from the caller.
	 * 
	 * @return agentset with directed userLinks from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet outUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getSuccessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink to turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public filterbubblesimulation.relogo.UserLink outUserLinkTo(Turtle t){
		return (filterbubblesimulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(this, t);
	}

	/**
	 * Reports true if there is a userLink connecting t and the caller.
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public boolean userLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isAdjacent(this, t);
	}

	/**
	 * Returns the agentset of all turtles found at the other end of
	 * userLinks connected to the calling turtle.
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet userLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getAdjacent(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns an agentset of the caller's userLinks.
	 * 
	 * @return agentset of the caller's userLinks
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.UserLink")
	public AgentSet<filterbubblesimulation.relogo.UserLink> myUserLinks(){
		AgentSet<filterbubblesimulation.relogo.UserLink> result = new AgentSet<filterbubblesimulation.relogo.UserLink>();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getEdges(this)){
			if (o instanceof filterbubblesimulation.relogo.UserLink){
				result.add((filterbubblesimulation.relogo.UserLink)o);
			}
		}
		return result;
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
	 * Makes a directed information from a turtle to the caller then executes a set of
	 * commands on the created information.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created information
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public filterbubblesimulation.relogo.Information createInformationFrom(Turtle t, Closure closure){
		filterbubblesimulation.relogo.Information link = (filterbubblesimulation.relogo.Information)this.getMyObserver().getNetwork("Information").addEdge(t,this);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed information from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created information
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public filterbubblesimulation.relogo.Information createInformationFrom(Turtle t){
			return createInformationFrom(t,null);
	}

	/**
	 * Makes directed informations from a collection to the caller then executes a set
	 * of commands on the created informations.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created informations
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet<filterbubblesimulation.relogo.Information> createInformationsFrom(Collection<? extends Turtle> a, Closure closure){
		AgentSet<filterbubblesimulation.relogo.Information> links = new AgentSet<filterbubblesimulation.relogo.Information>();
		for(Turtle t : a){
			links.add((filterbubblesimulation.relogo.Information)this.getMyObserver().getNetwork("Information").addEdge(t,this));
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed informations from a collection to the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created informations
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet<filterbubblesimulation.relogo.Information> createInformationsFrom(Collection<? extends Turtle> a){
		return createInformationsFrom(a,null);
	}

	/**
	 * Makes a directed information to a turtle from the caller then executes a set of
	 * commands on the created information.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created information
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public filterbubblesimulation.relogo.Information createInformationTo(Turtle t, Closure closure){
		filterbubblesimulation.relogo.Information link = (filterbubblesimulation.relogo.Information)this.getMyObserver().getNetwork("Information").addEdge(this,t);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed information to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created information
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public filterbubblesimulation.relogo.Information createInformationTo(Turtle t){
			return createInformationTo(t,null);
	}

	/**
	 * Makes directed informations to a collection from the caller then executes a set
	 * of commands on the created informations.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created informations
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet<filterbubblesimulation.relogo.Information> createInformationsTo(Collection<? extends Turtle> a, Closure closure){
		AgentSet<filterbubblesimulation.relogo.Information> links = new AgentSet<filterbubblesimulation.relogo.Information>();
		for(Object t : a){
			if (t instanceof Turtle){
				links.add((filterbubblesimulation.relogo.Information)this.getMyObserver().getNetwork("Information").addEdge(this,(Turtle)t));
			}
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed informations to a collection from the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created informations
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet<filterbubblesimulation.relogo.Information> createInformationsTo(Collection<? extends Turtle> a){
		return createInformationsTo(a,null);
	}

	/**
	 * Queries if there is a directed information from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed information from
	 *         turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public boolean inInformationNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Information").isPredecessor(t, this);
	}

	/**
	 * Returns the agentset with directed informations to the caller.
	 * 
	 * @return agentset with directed informations to the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet inInformationNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Information").getPredecessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed information from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed information from turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public filterbubblesimulation.relogo.Information inInformationFrom(Turtle t){
		return (filterbubblesimulation.relogo.Information)this.getMyObserver().getNetwork("Information").getEdge(t,this);
	}

	/**
	 * Returns an agentset of directed informations from other turtles to the caller.
	 * 
	 * @return agentset of directed informations from other turtles to the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet<filterbubblesimulation.relogo.Information> myInInformations(){
		AgentSet<filterbubblesimulation.relogo.Information> result = new AgentSet<filterbubblesimulation.relogo.Information>();
		for(Object o :  this.getMyObserver().getNetwork("Information").getInEdges(this)){
			if (o instanceof filterbubblesimulation.relogo.Information){
				result.add((filterbubblesimulation.relogo.Information) o);
			}
		}
		return result;
	}

	/**
	 * Returns an agentset of directed informations to other turtles from the caller.
	 * 
	 * @return agentset of directed informations to other turtles from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet<filterbubblesimulation.relogo.Information> myOutInformations(){
		AgentSet<filterbubblesimulation.relogo.Information> result = new AgentSet<filterbubblesimulation.relogo.Information>();
		for(Object o :  this.getMyObserver().getNetwork("Information").getOutEdges(this)){
			if (o instanceof filterbubblesimulation.relogo.Information){
				result.add((filterbubblesimulation.relogo.Information) o);
			}
		}
		return result;
	}

	/**
	 * Queries if there is a directed information to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed information to
	 *         turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public boolean outInformationNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Information").isPredecessor(this, t);
	}

	/**
	 * Returns the agentset with directed informations from the caller.
	 * 
	 * @return agentset with directed informations from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet outInformationNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Information").getSuccessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed information to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed information to turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public filterbubblesimulation.relogo.Information outInformationTo(Turtle t){
		return (filterbubblesimulation.relogo.Information)this.getMyObserver().getNetwork("Information").getEdge(this, t);
	}

	/**
	 * Reports true if there is a information connecting t and the caller.
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public boolean informationNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Information").isAdjacent(this, t);
	}

	/**
	 * Returns the agentset of all turtles found at the other end of
	 * informations connected to the calling turtle.
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet informationNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Information").getAdjacent(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns an agentset of the caller's informations.
	 * 
	 * @return agentset of the caller's informations
	 */
	@ReLogoBuilderGeneratedFor("filterbubblesimulation.relogo.Information")
	public AgentSet<filterbubblesimulation.relogo.Information> myInformations(){
		AgentSet<filterbubblesimulation.relogo.Information> result = new AgentSet<filterbubblesimulation.relogo.Information>();
		for(Object o : this.getMyObserver().getNetwork("Information").getEdges(this)){
			if (o instanceof filterbubblesimulation.relogo.Information){
				result.add((filterbubblesimulation.relogo.Information)o);
			}
		}
		return result;
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