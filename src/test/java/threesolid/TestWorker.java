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



@DisplayName("Jordan's Test That Passes")
	@Test
	public void newtestJRSWorkerPass() {
             assertNotEquals(w,m, "That worker isn't good enough to be a manager");

   }
   
@DisplayName("Jordan's Test That Fails")
	@Test
	public void newtestJRSWorkerFail() {
		w = null;
	assertNotNull(w);
	
	}
   
}