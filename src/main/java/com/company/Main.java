package com.company;

import com.company.Adder;
import com.company.Calculator;
import com.company.Subtractor;

public class Main {

    public static void main(String[] args) {
        double a = 2.0;
        double b = 5.0;

        Calculator calculator = new Calculator(new Adder());
        calculator.calc(a, b);

        calculator = new Calculator(new Subtractor());
        calculator.calc(a, b);

        calculator = new Calculator(new division());
        calculator.calc(a, b);

        calculator = new Calculator(new multiplication());
        calculator.calc(a, b);


    }
}
