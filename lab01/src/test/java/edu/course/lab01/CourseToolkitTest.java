package edu.course.lab01;

import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);

        assertTrue(result);
    }
    @Test
    void returnsFalsePrime(){
        boolean result = CourseToolkit.isPrime(3);
        assertFalse(result);
    }
    @Test
    void returnsTruePrime(){
        boolean result = CourseToolkit.isPrime(2);
        assertTrue(result);
    }
    @Test
    void returnsFalsePrime_1(){
        boolean result = CourseToolkit.isPrime(-1);
        assertFalse(result);
    }
    @Test
    void returnsTruePrime_1(){
        boolean result = CourseToolkit.isPrime(121);
        assertTrue(result);
    }
    @Test
    void returntruepolidrom(){
        boolean result = CourseToolkit.isPalindrome("поп");
        assertTrue(result);
    }
    @Test
    void returnTruePalindrome_test_1(){
        boolean result = CourseToolkit.isPalindrome("п о п");
        assertTrue(result);
    }
    @Test
    void returnFalsePalindrome_test_2(){
        boolean result = CourseToolkit.isPalindrome("игра");
        assertFalse(result);
    }
    @Test
    void returnaverage(){
        double result = CourseToolkit.average(new int[]{10,20,30,40});
        assertEquals(result,25);
    }
    @Test
    void returnaveragemin(){
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(new int[]{}));
    }
    @Test
    void returnaveragenull(){
        double result = CourseToolkit.average(new int[]{-100,-200,-30,-30});
        assertEquals(result,-90);
    }
    @Test
    void returnmax(){
        double result = CourseToolkit.max(new int[]{10,20,3,500});
        assertEquals(result,500);
    }
    @Test
    void returnmin(){
        double result = CourseToolkit.min(new int[]{10,20,30,-1});
        assertEquals(result,-1);
    }
}