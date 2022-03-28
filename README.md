# roman-numeral-calculator

## Description
Performs addition and subtraction of roman numerals.

## Rules
Roman numerals are written in additive and subtractive notation.

**Additive notation** means that the individual values in a Roman numeral are added together to get the total value. In the case of VIII you add up the values for V and three I's. V is 5 and I is 1, so 5+1+1+1 = 8.

**Subtractive notation** means that value of the Roman numeral is found by taking the last character value and subtracting the value of the character that comes just before it. In the case of XC you subtract the value of X from the value of C. X is 10 and C is 100, so 100-10 = 90.

## Usage
``` java
import com.ared.numbers.notation.RomanNumeral;

public class Application {
  System.out.println(RomanNumeral.calculate(RomanNumeral.V, RomanNumeral.I, RomanNumeral.X, RomanNumeral.L));
  // outputs 46
}
```
