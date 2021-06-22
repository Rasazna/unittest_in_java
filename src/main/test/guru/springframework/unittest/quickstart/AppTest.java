package guru.springframework.unittest.quickstart;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testConcatAndConvert() {
        String ExpectedValue = "JUSTTRYING";
        App myapp = new App();
        String result = myapp.concatAndConvert("Just","Trying");
        assertEquals(ExpectedValue,result);
    }
}