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
             assertEquals(w.work(),"I am a worker. \n So you should pay me. \n", "Mismatch between test text and method text");

   }
   
   @DisplayName("Karen's Worker Pass")
	@Test
	public void newtestKCPWorkerPass() {
			 
             assertNull(m.worker, "Manager was incorrectly assigned a worker to start");

   }
   
   @DisplayName("Karen's Worker Fail")
	@Test
	public void newtestKCPWorkerFail() {
             m.setWorker(w);
			 assertTrue(m.worker == null, "Manager should not have been assigned a worker");

   }

}