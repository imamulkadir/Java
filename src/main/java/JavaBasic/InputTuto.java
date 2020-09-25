/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;
import java.util.Scanner;

/**
 *
 * @author imamu
 */
public class InputTuto {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scr.nextInt();
        System.out.println("Enter second number: ");
        int b = scr.nextInt();
        
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
        
        System.out.println("Result of Addition: "+add);
        System.out.println("Result of Subtraction: "+sub);
        System.out.println("Result of Multiplication: "+mul);
        System.out.println("Result of Dividation: "+div);
        System.out.println("Result of Remainder: "+rem);
    }
}
