package ThreeSolidPrinciples;


public class TempWorker extends BaseWorker implements IEat, ISick{
	
	public String work()
	{
		return "Work method from the TempWorker class\n";
	}
	public String eat()
	{
		 return "IEat method from the TempWorker class\n";
	}
	public String sick()
	{
		return "ISick method from the TempWorker class\n";
	}
	
}
