package test;

import com.company.App;
import com.company.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestApp {

    @Test
    public void testAddition() {
    App myApp = new App();

    // Two numbers added together must be equal to the sum
    assertEquals(myApp.addition(1,1),2);
    // Zero added with zero must equal zero
    assertEquals(myApp.addition(0,0), 0);
    // 5 and 5 should not be 9 million
    assertNotEquals(myApp.addition(5,5), 9000000);
    // Testing with negative values
    assertEquals(myApp.addition(-1,-1),-2);
    }

    @Test
    public void testSubtration() {
        App myApp = new App();

        // Two number subtracted from each other, with highest number first
        // must equal the correct sum.
        assertEquals(myApp.subtraction(9,1),8);
        // Two number subtracted from each other, with the lowser number first
        // must equal the correct positve sum.
        assertEquals(myApp.subtraction(1,9),8);
        // Result should not be 90.
        assertNotEquals(myApp.subtraction(2,2),90);
        // Testing with negative values
        assertEquals(myApp.subtraction(-1,-1),0);
    }

    @Test
    public void testMultiplication() {
        App myApp = new App();

        // Two positive number multiplied togehter must equal correct sum
        assertEquals(myApp.multiplication(5,5), 25);
        // Two zeros multiplied should give a sum of 0
        assertEquals(myApp.multiplication(0,0),0);
        // 1 mulitplied by 5 should not equal 90
        assertNotEquals(myApp.multiplication(1,5),90);
        // Testing negative values
        assertEquals(myApp.multiplication(-5,-5),25);
    }

    @Test
    public void testStudentSayHi() {
        // This is two diffrent objects, they should not be the same
        Student myStudent = new Student("mikkel",23,"purple");
        assertNotSame(new Student("mikkel",23, "purple"),myStudent);
        myStudent.sayHi();
    }


}
