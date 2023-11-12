package com.rodez.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
   * 
   * @param numberToTest the number to test.
   */
  @ParameterizedTest
  @ValueSource(ints = {1, 7})
  public void testPlayWithRegularNumber(int numberToTest) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals(String.valueOf(numberToTest), fizzBuzz.play(numberToTest));
  }

  /**
   * Tests the {@link FizzBuzz#play(int)} method with a number that is a multiple
   * of 3. The expected result is "Fizz".
   * 
   * @param numberToTest the number to test.
   */
  @ParameterizedTest
  @ValueSource(ints = {3, 9})
  public void testPlayWithMultipleOfThree(int numberToTest) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Fizz", fizzBuzz.play(numberToTest));
  }

  /**
   * Tests the {@link FizzBuzz#play(int)} method with a number that is a multiple
   * of 5. The expected result is "Buzz".
   * 
   * @param numberToTest the number to test.
   */
  @ParameterizedTest
  @ValueSource(ints = {5, 10})
  public void testPlayWithMultipleOfFive(int numberToTest) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("Buzz", fizzBuzz.play(numberToTest));
  }

  /**
   * Tests the {@link FizzBuzz#play(int)} method with a number that is a multiple
   * of both 3 and 5. The expected result is "FizzBuzz".
   * 
   * @param numberToTest the number to test.
   */
  @ParameterizedTest
  @ValueSource(ints = {15, 30})
  public void testPlayWithMultipleOfThreeAndFive(int numberToTest) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertEquals("FizzBuzz", fizzBuzz.play(numberToTest));
  }
  
  /**
   * Tests the {@link FizzBuzz#play(int)} method with a number that is lower than 1.
   * The expected result is an IllegalArgumentException.
   * 
   * @param numberToTest the number to test.
   */
  @ParameterizedTest
  @ValueSource(ints = {-15, -1, 0})
  public void testPlayWithIncorrectNumbers(int numberToTest) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    assertThrows(IllegalArgumentException.class, () -> fizzBuzz.play(numberToTest));
  }
}
