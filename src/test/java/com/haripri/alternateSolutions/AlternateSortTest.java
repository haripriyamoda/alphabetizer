package com.haripri.alternateSolutions;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AlternateSortTest {

  @Test
  public void testEmptyStringInputWithArrays() {
    String sortedOutput = AlternateSort.sortUsingArrays("");
    assertEquals("", sortedOutput);
  }

  @Test
  public void testNullInputWithArrays() {
    String sortedOutput = AlternateSort.sortUsingArrays(null);
    assertEquals("", sortedOutput);
  }

  @Test
  public void testOnlySpecialCharsAndNumbersWithArrays() {
    String sortedOutput = AlternateSort.sortUsingArrays("1234*(^%(");
    assertEquals("", sortedOutput);
  }
  @Test
  public void testOnlyLowerCaseAlphabetsWithArrays() {
    String sortedOutput = AlternateSort.sortUsingArrays("asdfasdasdfaadfad");
    assertEquals("aaaaaadddddfffsss", sortedOutput);
  }
  @Test
  public void testOnlyUpperCaseAlphabetsWithArrays() {
    String sortedOutput = AlternateSort.sortUsingArrays("ASDALKADJFAKEDHFAJSF");
    assertEquals("AAAAADDDEFFFHJJKKLSS", sortedOutput);
  }
  @Test
  public void testOnlyAlphabetsWithArrays() {
    String sortedOutput = AlternateSort.sortUsingArrays("asdfasdfasdfASDALKADJFAKEDHFAJSF");
    assertEquals("aaaAAAAAdddDDDEfffFFFHJJKKLsssSS", sortedOutput);
  }
  @Test
  public void testAllWithArrays() {
    String sortedOutput = AlternateSort.sortUsingArrays("asdfasdfasdfASD^*&^&ALKADJFAKEDHFAJSF(&((");
    assertEquals("aaaAAAAAdddDDDEfffFFFHJJKKLsssSS", sortedOutput);
  }


}
