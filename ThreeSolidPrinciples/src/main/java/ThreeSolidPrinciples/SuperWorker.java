// Super Worker follows the single responsibility principle because it implements the Iworker
//interface, it only has the methods that a super worker object needs. Therefore it follows the
//principle. Super Worker also follows the open close principle because super worker has no 
//effect on the existing source code, but still can be modified and methods cans till be added in 
//the future if the super worker needs to do more. The Interface segregation Principle does not 
//apply to the Super Worker because it is not an interface.
//Jacob Pangonas

package ThreeSolidPrinciples;


public class SuperWorker extends BaseWorker implements IEat, ISick{
	
	public String work()
	{
		return "Work method from the SuperWorker class\n";
	}
	public String eat()
	{
		return "IEat method from the SuperWorker class\n";
	}
	public String sick()
	{
		return "ISick method from the SuperWorker class\n";
	}
	
	
}
