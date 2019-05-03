// The Manager class follows the open close principle because the Manager class can easily be 
// changed and have new functions added in the future, thus it is open to expansion, but doesn’t 
// require having its previous functions be modified to do so, thus it is closed to modification. The 
// single responsibility principle is also followed as the class provides functions that only serve to 
// manage workers, thus geared for managers only.
// Karen Proft

package ThreeSolidPrinciples;


public class Manager {
	IWorker worker;

	public void Manager() {

	}
        
	public void setWorker(IWorker w) {
		worker = w;
	}

	public String manage() {
		return worker.work();
	}
}
