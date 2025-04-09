package com.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestRecursion {
   @Test
    public void testBunnyEars() {
        assertEquals(2, RecursionChallenge.bunnyEars(1));
        assertEquals(4, RecursionChallenge.bunnyEars(2));
        assertEquals(6, RecursionChallenge.bunnyEars(3));
        assertEquals(10, RecursionChallenge.bunnyEars(5));
    }

    @Test
    public void testFactorial() {
        assertEquals(1, RecursionChallenge.factorial(1));
        assertEquals(2, RecursionChallenge.factorial(2));
        assertEquals(6, RecursionChallenge.factorial(3));
        assertEquals(120, RecursionChallenge.factorial(5));
    }

    @Test
    public void testSumNumbers() {
        assertEquals(1, RecursionChallenge.sumNumbers(1));
        assertEquals(3, RecursionChallenge.sumNumbers(2));
        assertEquals(6, RecursionChallenge.sumNumbers(3));
        assertEquals(15, RecursionChallenge.sumNumbers(5));
    }

    @Test
    public void testCountDown() {
        assertEquals("Blast Off!", RecursionChallenge.countDown(0));
    }

    @Test
    public void testPower() {
        assertEquals(2, RecursionChallenge.power(2, 1));
        assertEquals(8, RecursionChallenge.power(2, 3));
        assertEquals(25, RecursionChallenge.power(5, 2));
        assertEquals(1, RecursionChallenge.power(1, 100));
    }

    @Test
    public void testFib() {
        assertEquals(0, RecursionChallenge.fib(0));
        assertEquals(1, RecursionChallenge.fib(1));
        assertEquals(1, RecursionChallenge.fib(2));
        assertEquals(5, RecursionChallenge.fib(5));
        assertEquals(55, RecursionChallenge.fib(10));
    }

    @Test
    public void testCountX() {
        assertEquals(0, RecursionChallenge.countX(""));
        assertEquals(1, RecursionChallenge.countX("x"));
        assertEquals(0, RecursionChallenge.countX("y"));
        assertEquals(2, RecursionChallenge.countX("axbxc"));
        assertEquals(4, RecursionChallenge.countX("xxhixx"));
    }

    @Test
    public void testChangePi() {
        assertEquals("3.14",  RecursionChallenge.changePi("pi"));
        assertEquals("x3.14x",  RecursionChallenge.changePi("xpix"));
        assertEquals("3.14p3.14", RecursionChallenge.changePi("pippi"));
        assertEquals("3.143.14", RecursionChallenge.changePi("pipi"));
        assertEquals("x",  RecursionChallenge.changePi("x"));
        assertEquals("O3.14",  RecursionChallenge.changePi("Opi"));
        assertEquals("xx3.14t3.14",  RecursionChallenge.changePi("xxpitpi"));
        assertEquals("3.143.143.14", RecursionChallenge.changePi("pipipi"));
        assertEquals("xxxpx3.14", RecursionChallenge.changePi("xxxpxpi"));
    }

    @Test
    public void testReverse() {
        assertEquals("", RecursionChallenge.reverse(""));
        assertEquals("a", RecursionChallenge.reverse("a"));
        assertEquals("ba", RecursionChallenge.reverse("ab"));
        assertEquals("cba", RecursionChallenge.reverse("abc"));
        assertEquals("edcba", RecursionChallenge.reverse("abcde"));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(RecursionChallenge.isPalindrome(""));
        assertTrue(RecursionChallenge.isPalindrome("a"));
        assertTrue(RecursionChallenge.isPalindrome("racecar"));
        assertTrue(RecursionChallenge.isPalindrome("madam"));
        assertFalse(RecursionChallenge.isPalindrome("hello"));
        assertFalse(RecursionChallenge.isPalindrome("ab"));
       assertFalse(RecursionChallenge.isPalindrome("tforestt")); //first and last are the same but not a palindrome
    }
}
