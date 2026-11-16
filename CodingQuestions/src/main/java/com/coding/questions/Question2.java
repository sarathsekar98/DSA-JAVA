package com.coding.questions;

import java.util.HashSet;

// Find duplicate elements in an array  - HashSet
public class Question2 implements Question{

    int[] input = {1, 2, 3, 4, 2, 5, 3};

    public static void main(String[] args) {
      Question2 question2 = new Question2();
      //question2.BruteForceLogic();
        question2.OptimisedLogic();
    }

    @Override
    public void BruteForceLogic() {
        System.out.println("------------------- Brute Force Start ----------------------");
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(input[i]==input[j]){
                    System.out.println("Duplicate Elements Are : "+input[i]);
                }
            }
        }
        System.out.println("------------------- Brute Force Start ----------------------");
    }

    @Override
    public void OptimisedLogic() {
        System.out.println("------------------- Optimised Start ----------------------");
        HashSet<Integer> hashSet = new HashSet<>();
        for (int value : input){
            if(!hashSet.add(value)){
                System.out.println("Duplicate Elements Are : "+value);
            }
        }

        System.out.println("------------------- Optimised Start ----------------------");
    }
}
