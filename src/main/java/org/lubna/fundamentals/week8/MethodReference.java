package org.lubna.fundamentals.week8;

import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.function.ToDoubleBiFunction;

public class MethodReference {

    public static int generateRandom(int max){
        Random random = new Random();
        return random.nextInt(max);
    }

    public static void main(String[] args) {
        IntUnaryOperator randomNumber = (number)-> generateRandom(number);
        System.out.println(randomNumber.applyAsInt(100));

        IntUnaryOperator randomNumberMR = MethodReference::generateRandom;
        System.out.println(randomNumberMR.applyAsInt(1000));

        CalculatorMR calc = new CalculatorMR();
        ToDoubleBiFunction<Double,Double> additionLambda = (n1, n2)-> calc.addition(n1, n2);
        ToDoubleBiFunction<Double,Double> additionMR = calc::addition;
        System.out.println(additionLambda.applyAsDouble(23.5, 67.8));
        System.out.println(additionMR.applyAsDouble(23.5, 67.8));

        ToDoubleBiFunction<Double,Double> subtractionLambda = (n1, n2)-> calc.subtraction(n1, n2);
        ToDoubleBiFunction<Double,Double> subtractionMR = calc::subtraction;
        System.out.println(subtractionLambda.applyAsDouble(90.7, 45.1));

    }
}

class CalculatorMR{
    public double addition(double n1, double n2){
        return n1 + n2;
    }

    public double subtraction(double n1, double n2){
        return n1 - n2;
    }

}
