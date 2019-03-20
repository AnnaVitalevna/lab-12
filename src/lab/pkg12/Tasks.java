package lab.pkg12;

import static java.lang.Math.sqrt;
import java.util.Arrays;

public class Tasks {
    public void lambda1() {
        System.out.println("Task 1:");
        
        Task1 ex = () -> "   Example of a simple lambda expression";
        System.out.println(ex.print());
    }

    public void lambda2() {
        System.out.println("\nTask 2:");
        System.out.println("    Example lambda expression with parameter");
        
        Task2 root = (n) -> (int) sqrt(n);
        System.out.println("    Root of a number 4761 is " + root.func(4761));
        System.out.println("    Root of a number 53361 is " + root.func(53361));
    }

    public void lambda3() {
        System.out.println("\nTask 3:");
        System.out.println("    Example lambda expressions with two parameters");
        
        Task3 positiveNumber = (a, b) -> a * b >= 0;
        if (!positiveNumber.test(368, -1287))
            System.out.println("    The product of numbers 368 and -1287 is a negative number");
        if (positiveNumber.test(-647, -345))
            System.out.println("    The product of numbers -647 and -345 is a positive number"); 
    }

    public void lambda4() {
        System.out.println("\nTask 4:");
        System.out.println("    Example block lambda expression");
        
        Task4 average;
        average = (n) -> {
            int prod = 1;
            for (int num: n) {
                prod *= num;
            }
            return sqrt(prod);
        };
        int[] Arr1 = {2, -4, 8, 4, 7, -7};
        int[] Arr2 = {-4, 10, -25, 30, 9, 27, 9};
        System.out.println("    Geometric average of the array " + Arrays.toString(Arr1)+ " is " + average.func(Arr1));
        System.out.println("    Geometric average of the array " + Arrays.toString(Arr2)+ " is " + average.func(Arr2));
    }

}
