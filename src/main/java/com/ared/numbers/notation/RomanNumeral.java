package com.ared.numbers.notation;

public enum RomanNumeral {
  I(1),
  V(5),
  X(10),
  L(50),
  C(100),
  D(500),
  M(1000);

  private final int numericValue;

  RomanNumeral(int numericValue) {
    this.numericValue = numericValue;
  }

  public int getNumericValue() {
    return this.numericValue;
  }

  public static int calculate(RomanNumeral... numerals) {
    int total = 0;
    int operand = 0;
    for (RomanNumeral numeral : numerals) {
      if (operand == 0) {
        operand = numeral.numericValue;
      } else {
        total += calculate(operand, numeral.numericValue);
        operand = 0;
      }
    }
    return total;
  }

  private static int calculate(int firstNumeral, int secondNumeral) {
    if (firstNumeral >= secondNumeral) {
      return firstNumeral + secondNumeral;
    } else {
      return secondNumeral - firstNumeral;
    }
  }
}
