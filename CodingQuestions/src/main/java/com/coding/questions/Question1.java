package com.coding.questions;

import java.util.Arrays;

// Find the second-largest element - Single pass
//
public class Question1 implements Question{

    int[] input = {1,12,4,5,6,7,8};

    public static void main(String[] args) {
        Question1 question1 = new Question1();
       // question1.BruteForceLogic();
        question1.OptimisedLogic();
    }

    @Override
    public void BruteForceLogic() {

        System.out.println("------------------- Brute Force Start ----------------------");
        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if(input[i]<input[j]){
                    int temp = input[j];
                    input[j] = input[i];
                    input[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(input));
        System.out.println("second largest element : "+input[1]);

        System.out.println("------------------- Brute Force Start ----------------------");
    }

    @Override
    public void OptimisedLogic() {
        System.out.println("------------------- Optimised Start ----------------------");

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MAX_VALUE;

        for (int j : input) {
            if (firstMax < j) {
                int temp = firstMax;
                firstMax = j;
                secondMax = temp;
            } else if (secondMax < j) {
                secondMax = j;
            }
        }

        System.out.println("FirstMax : "+firstMax);
        System.out.println("SecondMax : "+secondMax);

        System.out.println("------------------- Optimised Start ----------------------");
    }
}
