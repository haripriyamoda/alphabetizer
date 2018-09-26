package com.haripri.alternateSolutions;

/**
 * This class provides an alternate way to sort the input string
 * @author haripri
 */
public class AlternateSort {

  /**
   *  Method collects input into an upper case and lower case arrays
   *  with chars as keys and the count as values.
   *  It is then fetched and printed in sorted order.
   * @param input to be sorted
   * @return String sorted alphabetically
   */
  public static String sortUsingArrays(final String input) {
    if (input == null || input.isEmpty()) {
      return "";
    }
    final int[] lowerCaseArray = new int[26];
    final int[] upperCaseArray = new int[26];
    input.chars()
        .forEach(c -> {
          if (Character.isLowerCase(c)) {
            lowerCaseArray[c - 'a']++;
          } else if (Character.isUpperCase(c)) {
            upperCaseArray[c - 'A']++;
          }
        });

    final StringBuilder sb = new StringBuilder();

    for (int i = 0; i < lowerCaseArray.length; i++) {
      for (int z = 0; z < lowerCaseArray[i]; z++) {
        sb.append((char) (i + 'a'));
      }
      for (int z = 0; z < upperCaseArray[i]; z++) {
        sb.append((char) (i + 'A'));
      }
    }
    return sb.toString();
  }
}
