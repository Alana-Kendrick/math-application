package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // STEP 1
        // Question 1: Bob and Gary's salary comparison
        int bobSalary, garySalary, highestSalary;
        bobSalary = 55000;
        garySalary = 70000;
        highestSalary = Math.max(garySalary, bobSalary);
        System.out.println("The highest salary is $" + highestSalary + ".");

        // Question 2: Smallest of two variables
        int carPrice = 30000;
        int truckPrice = 40000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is $" + lowestPrice + ".");
    }
}
