package com.ared.numbers.notation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

  @Test
  public void shouldReturnOne() {
    assertEquals(RomanNumeral.I.getNumericValue(), 1);
  }

  @Test
  public void shouldReturnFive() {
    assertEquals(RomanNumeral.V.getNumericValue(), 5);
  }

  @Test
  public void shouldReturnTen() {
    assertEquals(RomanNumeral.X.getNumericValue(), 10);
  }

}
