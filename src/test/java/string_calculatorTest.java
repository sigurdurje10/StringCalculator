/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class string_calculatorTest {
    @Test public void test_add_none() {
        string_calculator class_test = new string_calculator();
        assertEquals(class_test.add(""), 0);
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void test_add_one() {
        string_calculator class_test = new string_calculator();
        assertEquals(class_test.add("1"), 1);
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void test_add_two() {
        string_calculator class_test = new string_calculator();
        assertEquals(class_test.add("1,2"), 3);
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

}
