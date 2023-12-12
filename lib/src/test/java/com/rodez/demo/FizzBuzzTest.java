package com.rodez.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The {@code FizzBuzzTest} class contains JUnit tests for the {@link FizzBuzz}
 * class. It verifies the correctness of the FizzBuzz algorithm by testing
 * various input scenarios.
 *
 * <p>This test class follows the standard JUnit testing conventions to ensure
 * the reliability and effectiveness of the FizzBuzz implementation.
 *
 * @author <gabin>
 * @version 1.0
 */
public class FizzBuzzTest {
    @Test
    public void FizzBuzz() {
        FizzBuzz buzz = new FizzBuzz();
        String test = buzz.play(3);
        assertEquals("Fizz",test);
    }
    @Test
    public void FizzBuzz2() {
        FizzBuzz buzz = new FizzBuzz();
        String test = buzz.play(5);
        assertEquals("Buzz",test);
    }
    @Test
    public void FizzBuzz3() {
        FizzBuzz buzz = new FizzBuzz();
        String test = buzz.play(15);
        assertEquals("FizzBuzz",test);
    }
}


