// The IWorker class follows the open close principle because the IWorker class can easily be 
// changed and have new functions added in the future, thus it is open to expansion, but doesn’t 
// require having its previous functions be modified to do so, thus it is closed to modification. It 
// also follows the interface segregation principle because rather than being an interface packed 
// with alot of functions and purposes, making it a more general interface, it follows a specific 
// purpose, defining the actions a worker can take, and is also separated from the other 
// interfaces in the package. The single responsibility principle is also followed as the class 
// provides functions that only serve to help the worker class.
// Karen Proft

package ThreeSolidPrinciples;


public interface IWorker {
	public void work();
	//public void eat();
} 
