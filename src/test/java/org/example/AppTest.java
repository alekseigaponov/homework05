package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private int zeroNumber;

    @Test
    public void checkTwoPositiveValuesEquals(){

        Calculator calculator = new Calculator();

        assertEquals( 4 , calculator.calculateSumOfTwoIntegerValues(2, 2));
        //assertEquals( 3 , 3);
    }
    @Test
    public void checkTwoNegativeValuesEquals(){

        Calculator calculator = new Calculator();

        assertEquals( -4 , calculator.calculateSumOfTwoIntegerValues(-2, -2));
    }

    @Test
    public void checkTwoValuesNotEquals(){
        assertNotEquals( 3 , 4);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( 3 == 3 );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( 4 < 2 );
    }

    // №1. Check for adding zero to a positive number
    @Test
    public void testAdditionZeroToPositiveNumber (){

        CalculatorTest calculatorTest = new CalculatorTest();

        assertEquals(5,calculatorTest.addZeroToPositiveNumber(0,5));

    }

    //№2. Check for adding a positive and a negative number
    @Test
    public void testAdditionPositiveAndNegativeNumbers (){

        CalculatorTest calculatorTest = new CalculatorTest();

        assertEquals(2,calculatorTest.addPositiveAndNegativeNumber(5,-3));
    }

    //№3. Check for adding positive numbers
    @Test
    public void testAdditionOfPositiveNumbers (){

        CalculatorTest calculatorTest = new CalculatorTest();

        assertEquals(8,calculatorTest.addPositiveNumbers(4,4));
    }

    //№4. Check for adding negative numbers
    @Test
    public void testAdditionOfNegativeNumbers (){
        int num1 = -2;
        int num2 = -2;
        int result = num1 + num2;

        CalculatorTest calculatorTest = new CalculatorTest();

        assertEquals(-4,result);

    }

    //№5. Check for subtracting positive numbers
    @Test
    public void testSubtractingOfPositiveNumbers (){

        CalculatorTest calculatorTest = new CalculatorTest();

        assertEquals(3, calculatorTest.subtractPositiveNumbers(10,7));

    }

    //№6. Check for subtracting negative numbers
    @Test
    public void testSubtractingOfNegativeNumbers (){

        CalculatorTest calculatorTest = new CalculatorTest();

        assertEquals(-5, calculatorTest.subtractNegativeNumbers(-10,-5));

    }

    //№7. Check for subtracting a positive number from a negative number
    @Test
    public void testSubtractingPositiveNumberFromNegativeNumber () {

        CalculatorTest calculatorTest = new CalculatorTest();

        int result = calculatorTest.subtractingPositiveFromNegativeNumber(-12, -4);
        assertEquals(-8, result);

    }

    //№8. Check for subtracting zero from a positive number
    @Test
    public void testSubtractingZeroFromPositiveNumber () {

        CalculatorTest calculatorTest = new CalculatorTest();

        int zero = 0;
        int positiveNumber = 10;
        int result = positiveNumber - zero;
        assertEquals(positiveNumber, result);

    }

    //№9.  Check if the first argument is greater than second
    @Test
    public void testIfFirstArgumentIsGreaterThanSecond (){

        CalculatorTest calculatorTest = new CalculatorTest();

        assertTrue(calculatorTest.firstGreaterThanSecond(5, 3));

    }

    //№10. Check if the second argument it greater than first
    @Test
    public void testIfTheSecondArgumentIsGreaterThanFirst (){

        CalculatorTest calculatorTest = new CalculatorTest();

        assertTrue(calculatorTest.secondGreaterThanFirst(3, 9));
    }

    //№11. Check if the first and the second arguments are equal
    @Test
    public void testIfTheFirstAndSecondArgumentsAreEqual (){

        CalculatorTest calculatorTest = new CalculatorTest();

        assertTrue(calculatorTest.firstEqualToSecond(3, 3));
    }

}
