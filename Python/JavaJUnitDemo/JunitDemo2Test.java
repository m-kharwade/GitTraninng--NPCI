package JavaJUnitDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitDemo2Test {

    @Test
    void lengthOfStringOfTwoNumbers() {

        JunitDemo2 junitDemo2=new JunitDemo2();

        assertTrue(junitDemo2.lengthOfStringOfTwoNumbers("Notebook","Facebook"));
        assertFalse(junitDemo2.lengthOfStringOfTwoNumbers("Google","Facebook"));
    }
}