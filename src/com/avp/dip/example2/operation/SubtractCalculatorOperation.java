package com.avp.dip.example2.operation;

import com.avp.dip.example2.ICalculatorOperation;

public class SubtractCalculatorOperation implements ICalculatorOperation {
    @Override
    public double calculate(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }
}
