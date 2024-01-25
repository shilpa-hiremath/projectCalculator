// Java Program to Perform Arithmetic Operations using Methods
import java.util.Scanner;

public class calculator {


     // To make sum of two numbers
     public static float Sum(float x, float y) {
        return x + y;
    }

    // To make subtraction of two numbers
    public static float Sub(float x, float y) {
        return x - y;
    }

    // To make multilication of two numbers
    public static float Mul(float x, float y) {
        return x * y;
    }

    // To make division of two numbers
    public static float Div(float x, float y) {
        return x / y;
    }

    // To make modulus of two numbers
    public static float Mod(float x, float y) {
        return x % y;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two positive numbers:");

        // Reading data using readLine
        float p = in.nextFloat();
        float q = in.nextFloat();

        System.out.println("\nSUM         " + p + " + " + q + " = " + Sum(p, q));
        System.out.println("DIFFERENCE  " + p + " - " + q + " = " + Sub(p, q));
        System.out.println("PRODUCT     " + p + " * " + q + " = " + Mul(p, q));
        System.out.println("QUOTIENT    " + p + " / " + q + " = " + Div(p, q));
        System.out.println("MODULUS     " + p + " % " + q + " = " + Mod(p, q));
    }

   
}