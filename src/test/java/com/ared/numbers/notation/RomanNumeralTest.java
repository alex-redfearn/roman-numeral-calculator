package com.ared.numbers.notation;

import static com.ared.numbers.notation.RomanNumeral.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

  @Test
  public void shouldReturnOne() {
    assertEquals(I.getNumericValue(), 1);
  }

  @Test
  public void shouldReturnFive() {
    assertEquals(V.getNumericValue(), 5);
  }

  @Test
  public void shouldReturnTen() {
    assertEquals(X.getNumericValue(), 10);
  }

  @Test
  public void shouldCalculateThatIVEqualsFour() {
    assertEquals(calculate(I, V), 4);
  }

  @Test
  public void shouldCalculateThatVIEqualsSix() {
    assertEquals(calculate(V, I), 6);
  }

  @Test
  public void shouldCalculateThatCDEqualsFourHundred() {
    assertEquals(calculate(C, D), 400);
  }

  @Test
  public void shouldCalculateThatVIXLEqualsFortySix() {
    assertEquals(calculate(V, I, X, L), 46);
  }

  @Test
  public void shouldCalculateThatDMEqualsFiveHundred() {
    assertEquals(calculate(D, M), 500);
  }
}
