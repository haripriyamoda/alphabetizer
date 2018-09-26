package com.haripri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * This is the main method which collects input into a string and
 * sorts it alphabetically.
 * @author haripri
 */

public class AlphabetSort {
  public static void main(final String[] args)  {
    String s = null;
    final Scanner in = new Scanner(System.in);
    do {
      System.out.println("Please enter the words you want to sort or hit return key to exit");
      s = in.nextLine();
      if (!s.isEmpty()) {
        System.out.println(sortUsingMaps(s));
      }
    } while (!s.isEmpty());
  }

  /**
   *  Method collects input into a map with chars as keys and the count as values.
   *  It is then fetched and printed in sorted order.
   * @param input to be sorted
   * @return String sorted alphabetically
   */
  public static String sortUsingMaps(final String input) {
    if (input == null) {
      return "";
    }
    //during sort if numerical ignore
    //treat capital or small as same but output whats been given
    final Map<Character, Integer> characterIntegerTreeMap = new HashMap<>();
    for (char c : input.toCharArray()) {
      if (Character.isAlphabetic(c)) {
        characterIntegerTreeMap.put(Character.valueOf(c),
            characterIntegerTreeMap.getOrDefault(Character.valueOf(c), 0) + 1);
      }
    }

    final StringBuilder sb = new StringBuilder();
    for (Character c = 'a'; c <= 'z'; c++) {
      for (int x = 0; x < characterIntegerTreeMap.getOrDefault(c, 0); x++) {
        sb.append(c);
      }
      for (int x = 0; x < characterIntegerTreeMap.getOrDefault(Character.toUpperCase(c), 0); x++) {
        sb.append(Character.toUpperCase(c));
      }
    }
    return sb.toString();
  }
}

