//Worker implements IWorker and follows the open close principle.  Worker also follows the 
//single responsibility principle because it the only reason it has to change is with functionality of 
//worker. 
//Leander Davis


package ThreeSolidPrinciples;


public class Worker extends BaseWorker implements IEat, ISick{
	public void work() {
		System.out.println("I am a worker. \n So you should pay me. \n");
	}

	public void eat() {
		System.out.println("This is a paid lunch, right?");
	}
	
	public void sick() {
		System.out.println("How many sick days do I have left?");
	}
}
