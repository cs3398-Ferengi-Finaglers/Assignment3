package ThreeSolidPrinciples;


public class TempWorker extends BaseWorker implements IEat, ISick{
	
	public void work()
	{
		System.out.format("Work method from the TempWorker class\n");
	}
	public void IEat()
	{
		System.out.format("IEat method from the TempWorker class\n");
	}
	public void ISick()
	{
		System.out.format("ISick method from the TempWorker class\n");
	}
	
}
