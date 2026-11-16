package com.coding.questions;

// Find the number that appears once - xor
public class Question5 implements Question{

    int input[] = {1,2,3,1,2};
    public static void main(String[] args) {
        Question5 question5 = new Question5();
        question5.OptimisedLogic();
    }

    @Override
    public void BruteForceLogic() {
        System.out.println("------------------- Brute Force Start ----------------------");
        System.out.println("------------------- Brute Force Start ----------------------");
    }

    @Override
    public void OptimisedLogic() {
        System.out.println("------------------- Optimised Start ----------------------");
        int result = 0;
        for (int val :input){
            result = result ^ val;
        }

        System.out.println("appearance one number is : "+result);

        System.out.println("------------------- Optimised Start ----------------------");
    }
}
