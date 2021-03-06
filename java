// This Java application requests user input by prompting the user to enter their weight, height, and then calculates their BMI. 

import java.util.Scanner;

public class BMI {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        
        //Prompt user to enter weight in lbs
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        //Prompt user to enter inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        //Calculate Body Mass Index (BMI)
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms /
                (heightInMeters * heightInMeters);
        
        //Display output
        System.out.println("BMI is " + bmi);
        
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese"); 
            
            }   
            
            }
