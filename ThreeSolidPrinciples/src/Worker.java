//Worker implements IWorker and follows the open close principle.  Worker also follows the 
//single responsibility principle because it the only reason it has to change is with functionality of 
//worker. 
//Leander Davis


package ThreeSolidPrinciples;


public class Worker implements IWorker{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in launch break
	}
}
