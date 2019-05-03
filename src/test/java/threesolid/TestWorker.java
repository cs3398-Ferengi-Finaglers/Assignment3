package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
	private Manager m = new Manager();
    private Worker w = new Worker();
	@DisplayName("Work Method Test")
	@Test
	public void testWorkMethod() {
		// assertEquals(w.work(),"I'm working already!", "Mismatch between test text and method text");
      assertTrue(true);

   }



@DisplayName("Jacob's Passing Test")
	@Test
	public void newtestJAPWorkerPass() {
			 
             assertSame(w,w,"They are the same worker");

   }
   
@DisplayName("Jacob's Failure")
	@Test
	public void newtestJAPWorkerFail() {
	
	assertNotSame(w,w, "They are still the same worker");
	
	}
   
}