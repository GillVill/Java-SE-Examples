package com.sametdemirel.koleksiyonlar;

import java.util.ArrayDeque;
import java.util.Deque;

    /*1
    +5
    -2
    +3
    */

public class CalculatorStack {

    public int evaluate(final String input){
        final Deque<String> stack = new ArrayDeque<>();
        String[] tokens = input.split(" ");

        for(String token: tokens){
            stack.add(token);
        }

        while(stack.size() > 1){
            final int left = Integer.valueOf(stack.pop());
            final String operator = stack.pop();
            final int right = Integer.valueOf(stack.pop());

            int result = 0;
            switch (operator){
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
            }
            stack.push(String.valueOf(result));
        }
        return Integer.valueOf(stack.pop());
    }
}
