package htw.berlin.prog2.ha1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Retro calculator")
class CalculatorTest {

    @Test
    @DisplayName("should display result after adding two positive multi-digit numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "40";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after getting the square root of two")
    void testSquareRoot() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressUnaryOperationKey("√");

        String expected = "1.41421356";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("")

    void testMult(){
        Calculator calc = new Calculator();
        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("x");
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected ="4";
        String actual = calc.readScreen();

        assertEquals(expected,actual);

    }
    @Test
    @DisplayName("Should display result after divide a number by zero")
    void testPressEqualsKey(){
        Calculator calc = new Calculator();
        calc.pressDigitKey(9);
        calc.pressBinaryOperationKey("/");
        calc.pressDigitKey(0);
        calc.pressEqualsKey();
        calc.readScreen();
        String expected = "Error";
        String actual = calc.readScreen();
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Should display only one dot instead of two. Only one after the first number")
    void testPressDotKey(){
        Calculator calc = new Calculator();
        calc.pressDigitKey(3);
        calc.pressDotKey();
        calc.pressDigitKey(5);
        calc.pressDotKey();
        calc.readScreen();
        String expected = "3.5";
        String actual = calc.readScreen();
        assertEquals(expected, actual);
    }
}

