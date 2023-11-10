package com.rodez.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * The {@code FizzBuzzTest} class contains JUnit tests for the {@link FizzBuzz}
 * class. It verifies the correctness of the FizzBuzz algorithm by testing
 * various input scenarios.
 *
 * <p>This test class follows the standard JUnit testing conventions to ensure
 * the reliability and effectiveness of the FizzBuzz implementation.
 *
 * @author Fabien ESCOURBIAC
 * @version 1.0
 */
public class FizzBuzzTest {

  /**
   * Tests the {@link FizzBuzz#play(int)} method with a number that is not a
   * multiple of 3 or 5. The expected result is the same as the input number
   * converted to a String.
   */
  @Test
  public void testPlayWithRegularNumber() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("1", fizzBuzz.play(1));
    assertEquals("7", fizzBuzz.play(7));
    // Add more test cases as needed.
  }

  /**
   * Tests the {@link FizzBuzz#play(int)} method with a number that is a multiple
   * of 3. The expected result is "Fizz".
   */
  @Test
  public void testPlayWithMultipleOfThree() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Fizz", fizzBuzz.play(3));
    assertEquals("Fizz", fizzBuzz.play(9));
    // Add more test cases as needed.
  }

  /**
   * Tests the {@link FizzBuzz#play(int)} method with a number that is a multiple
   * of 5. The expected result is "Buzz".
   */
  @Test
  public void testPlayWithMultipleOfFive() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Buzz", fizzBuzz.play(5));
    assertEquals("Buzz", fizzBuzz.play(10));
    // Add more test cases as needed.
  }

  /**
   * Tests the {@link FizzBuzz#play(int)} method with a number that is a multiple
   * of both 3 and 5. The expected result is "FizzBuzz".
   */
  @Test
  public void testPlayWithMultipleOfThreeAndFive() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("FizzBuzz", fizzBuzz.play(15));
    assertEquals("FizzBuzz", fizzBuzz.play(30));
    // Add more test cases as needed.
  }

  // Add more test cases and methods to cover different scenarios.

}
