package com.rodez.demo;

/**
 * Class containing utils math methods.
 *
 * @author Fabien ESCOURBIAC
 */
public class MathUtils {

  /**
   * Evaluate if a number is divisible by another.
   *
   * @param dividend the number to divide.
   * @param divider  the number that divide.
   * @return true if the dividend is divisible by the divider (quotient of the
   *         division is 0).
   */
  public static boolean isDivisibleBy(int dividend, int divider) {
    if (divider == 0) {
      throw new IllegalArgumentException("Dividing by 0 is forbidden.");
    }
    return dividend % divider == 0;
  }
}
