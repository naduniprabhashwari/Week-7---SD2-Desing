import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tute_07_JunitTest {

    @Test
    void addNumber() {
        int firstTest = 10;
        int secondTest = 20;

        int expectedOut = 20;
        tute_07_Junit testingClass = new tute_07_Junit();
        int realOut = testingClass.addNumber(firstTest,secondTest);
        assertEquals(expectedOut,realOut);
    }
}