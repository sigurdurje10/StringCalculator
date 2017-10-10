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

    @Test public void test_add_multiple() {
        string_calculator class_test = new string_calculator();
        assertEquals(class_test.add("1,2,3,4,5"), 15);
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void test_add_two_new() {
        string_calculator class_test = new string_calculator();
        assertEquals(class_test.add("1\n2"), 3);
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void test_add_multiple_new() {
        string_calculator class_test = new string_calculator();
        assertEquals(class_test.add("1\n2,3\n4,5"), 15);
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_negative() {
    	string_calculator class_test = new string_calculator();
    	class_test.add("-1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_negative_2() {
    	string_calculator class_test = new string_calculator();
    	class_test.add("-1,2,-3");
    }

    @Test public void test_add_over_1000() {
        string_calculator class_test = new string_calculator();
        assertEquals(class_test.add("1001\n2,3\n1000"), 1005);
        //assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

}
