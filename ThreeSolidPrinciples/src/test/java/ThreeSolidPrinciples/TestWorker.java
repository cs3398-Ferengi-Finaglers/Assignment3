package ThreeSolidPrinciples;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class TestWorker {
 private Worker w = new Worker();
 private Manager m = new Manager();

 @Test
 @DisplayName("Pass Test")
 public void newtestAPWorkerPass(){
  m.setWorker(w);
  assertEquals(w.work(), m.manage());
 }

 //@Test
 //@DisplayName("Fail Test")
 //public void newtestAPWorkerFail(){
 // assertNull(w);
 //}
}