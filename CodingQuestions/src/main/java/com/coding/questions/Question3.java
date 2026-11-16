package com.coding.questions;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question3 implements Question{
    // Remove duplicates from a sorted array - Two pointers

    int input[] = {1,2,3,4,5,6,1,2,3,4};

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        //question3.OptimisedLogic();
        question3.BruteForceLogic();
    }

    @Override
    public void BruteForceLogic() {
        System.out.println("------------------- Brute Force Start ----------------------");
        Map<Integer,Integer> countList = new HashMap<>();
        for (int j : input) {
            countList.merge(j, 1, Integer::sum);
        }
        countList.forEach((key,value)->{
            System.out.println("Unique Elements Are: "+key);
        });
        System.out.println("------------------- Brute Force Start ----------------------");
    }

    @Override
    public void OptimisedLogic() {
        System.out.println("------------------- Optimised Start ----------------------");
        Arrays.sort(input);
        int prev = 0;
        for (int val: input){
            if(prev!=val){
                prev =val;
                System.out.println("Unique Elements Are : "+val);
            }
        }
        System.out.println("------------------- Optimised Start ----------------------");
    }
}
