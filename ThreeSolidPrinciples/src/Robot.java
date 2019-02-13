// Robot follows the open close principle because the robot class can easily be changed and 
// different functions can be added in the future and the three principles main will not be
// changed, Robot also follows the the single responsibility because Robots only have the
// responsibility of working therefore following the single responsibility principle. 
// The Interface Segregation Principle does not apply to the Robot class because it is not an 
// interface
// Jacob Pangonas

package ThreeSolidPrinciples;

class Robot implements IWorkable
{
  Robot() {}
  
  public void work() {}
}
