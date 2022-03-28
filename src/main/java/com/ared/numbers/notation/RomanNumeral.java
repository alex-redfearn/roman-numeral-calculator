package com.ared.numbers.notation;

public enum RomanNumeral {
  I(1),
  V(5),
  X(10);

  private final int numericValue;

  RomanNumeral(int numericValue) {
    this.numericValue = numericValue;
  }

  public int getNumericValue() {
    return this.numericValue;
  }
}
