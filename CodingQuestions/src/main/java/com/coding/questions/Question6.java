package com.coding.questions;

import java.util.HashMap;
import java.util.Map;

//Two Sum -- hashmap
public class Question6 implements Question{

    int input[] = {2,3,4,1};

    public static void main(String[] args) {
        Question6 question6 = new Question6();
        //question6.BruteForceLogic();
        question6.OptimisedLogic();
    }

    @Override
    public void BruteForceLogic() {
        System.out.println("------------------- Brute Force Start ----------------------");
        int target = 5;
        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if(target == input[i]+ input[j]){
                    System.out.printf("Numbers Are %d and %d",input[i],input[j]);
                    System.out.println();
                }
            }
        }

        System.out.println("------------------- Brute Force Start ----------------------");
    }

    @Override
    public void OptimisedLogic() {
        System.out.println("------------------- Optimised Start ----------------------");
        Map<Integer,Integer> integerMap = new HashMap<>();
        int target = 5;
        for (int value:input){
            int complement = target -value;
            if(integerMap.containsKey(complement)){
                System.out.printf("Numbers Are %d and %d",value,complement);
                System.out.println();
            }
            integerMap.put(value,value);
        }
        System.out.println("------------------- Optimised Start ----------------------");
    }
}
