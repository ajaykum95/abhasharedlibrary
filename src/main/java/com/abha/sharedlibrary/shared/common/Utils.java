package com.abha.sharedlibrary.shared.common;

import lombok.experimental.UtilityClass;

/**
 * Utility class containing helper methods.
 * This class is marked with {@code @UtilityClass}, which means:
 * - It cannot be instantiated.
 * - All methods must be static.
 * - The compiler will automatically make the constructor private.
 *
 */
@UtilityClass
public class Utils {

  /**
   * Prints a test message to the console.
   * This is a sample utility method.
   */
  public void test() {
    System.out.println("testing");
  }
}
