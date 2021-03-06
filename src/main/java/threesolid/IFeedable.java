// IFeedable follows the Interface segregation principle because it is only the interface.
// It also follows the single responsibility principle by only having the eat method
// Jordan Severinsons

package threesolid;

abstract interface IFeedable
{
  public abstract String eat();
}
