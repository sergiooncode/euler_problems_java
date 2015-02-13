import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class Problem7TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Problem7Test.class);
        
        System.out.println();
        System.out.println();
        System.out.println(); 
        
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            System.out.println();
        }
        
        if(result.wasSuccessful()) {
            System.out.println("All tests passed.");
            System.out.println();
        }
    }
}
