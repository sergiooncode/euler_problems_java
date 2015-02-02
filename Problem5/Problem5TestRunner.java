import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class Problem5TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Problem5Test.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if(result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
