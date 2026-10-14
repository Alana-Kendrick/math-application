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

        // Question 3: Area of a circle
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is approximately " + area + ".");

        // Question 4: Square root
        double num = 5.0;
        double squareRoot = Math.sqrt(num);
        System.out.println("The square root of " + num + " is approximately " + squareRoot + ".");
    }
}
