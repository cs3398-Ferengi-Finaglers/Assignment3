//Worker implements IWorker and follows the open close principle.  Worker also follows the 
//single responsibility principle because it the only reason it has to change is with functionality of 
//worker. 
//Leander Davis


package ThreeSolidPrinciples;


public class Worker extends BaseWorker implements IEat, ISick{
	public String work() {
		return "I am a worker. \n So you should pay me. \n";
	}

	public String eat() {
		return "This is a paid lunch, right?";
	}
	
	public String sick() {
		return "How many sick days do I have left?";
	}
}
