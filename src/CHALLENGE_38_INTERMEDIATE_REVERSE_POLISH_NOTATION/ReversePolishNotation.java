/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHALLENGE_38_INTERMEDIATE_REVERSE_POLISH_NOTATION;



import java.util.Arrays;
import java.util.Stack;
import java.util.function.*;

public class ReversePolishNotation {

    public static Double calc(String input) {
        Stack<Double> numbers = new Stack<>();
        Arrays.asList(input.split(" ")).stream().forEach(number -> {
            switch(number) {
                case "+":
                    calcSign(numbers, (n1, n2) -> n2 + n1);
                    break;
                case "-":
                    calcSign(numbers, (n1, n2) -> n2 - n1);
                    break;
                case "*":
                    calcSign(numbers, (n1, n2) -> n2 * n1);
                    break;
                case "/":
                    calcSign(numbers, (n1, n2) -> n2 / n1);
                    break;
                default:
                    numbers.push(Double.parseDouble(number));
            }
        });
        return numbers.pop();
    }

    protected static Stack<Double> calcSign(Stack<Double> numbers, BiFunction<Double, Double, Double> operation) {
        numbers.push(operation.apply(numbers.pop(), numbers.pop()));
        return numbers;
    }
    public static void main (String[]args)
    {
        
    }

}