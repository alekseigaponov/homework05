package org.example;

public class CalculatorTest {

    public int addZeroToPositiveNumber (int zero, int positiveNumber) {

        return zero + positiveNumber;
    }

    public int addPositiveAndNegativeNumber (int positiveNumber, int negativeNumber){

        return positiveNumber + negativeNumber;
    }

    public int addPositiveNumbers (int positiveNumber, int positiveNumber1){

        return positiveNumber + positiveNumber1;
    }

    public int subtractPositiveNumbers (int positiveNumber, int positiveNumber1){

        return positiveNumber - positiveNumber1;
    }

    public int subtractNegativeNumbers (int negativeNumber, int negativeNumber1){

        return negativeNumber - negativeNumber1;
    }

    public int subtractingPositiveFromNegativeNumber (int negativeNumber, int positiveNumber1){

        return negativeNumber - positiveNumber1;
    }

    public boolean firstGreaterThanSecond (int firstArgument, int secondArgument){

        return firstArgument > secondArgument;
    }

    public boolean secondGreaterThanFirst (int firstArgument, int secondArgument){

        return firstArgument < secondArgument;
    }

    public boolean firstEqualToSecond (int firstArgument, int secondArgument){

        return firstArgument == secondArgument;
    }

}
