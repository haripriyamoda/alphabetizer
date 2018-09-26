package com.haripri;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlphabetSortTest {
  @Test
  public void testEmptyStringInputWithMap() {
    String sortedOutput = AlphabetSort.sortUsingMaps("");
    assertEquals("", sortedOutput);
  }

  @Test
  public void testNullInputWithMap() {
    String sortedOutput = AlphabetSort.sortUsingMaps(null);
    assertEquals("", sortedOutput);
  }

  @Test
  public void testOnlySpecialCharsAndNumbersWithMap() {
    String sortedOutput = AlphabetSort.sortUsingMaps("1234*(^%(");
    assertEquals("", sortedOutput);
  }
  @Test
  public void testOnlyLowerCaseAlphabetsWithMap() {
    String sortedOutput = AlphabetSort.sortUsingMaps("asdfasdasdfaadfad");
    assertEquals("aaaaaadddddfffsss", sortedOutput);
  }
  @Test
  public void testOnlyUpperCaseAlphabetsWithMap() {
    String sortedOutput = AlphabetSort.sortUsingMaps("ASDALKADJFAKEDHFAJSF");
    assertEquals("AAAAADDDEFFFHJJKKLSS", sortedOutput);
  }
  @Test
  public void testOnlyAlphabetsWithMap() {
    String sortedOutput = AlphabetSort.sortUsingMaps("asdfasdfasdfASDALKADJFAKEDHFAJSF");
    assertEquals("aaaAAAAAdddDDDEfffFFFHJJKKLsssSS", sortedOutput);
  }
  @Test
  public void testAllWithMap() {
    String sortedOutput = AlphabetSort.sortUsingMaps("asdfasdfasdfASD^*&^&ALKADJFAKEDHFAJSF(&((");
    assertEquals("aaaAAAAAdddDDDEfffFFFHJJKKLsssSS", sortedOutput);
  }


}
