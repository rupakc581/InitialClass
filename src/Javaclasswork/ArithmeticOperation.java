/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Javaclasswork;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ArithmeticOperation {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first num");
        int a=input.nextInt();
        System.out.println("Enter second num");
        int b=input.nextInt();
        System.out.println("1 for add");
        System.out.println("2 for sub");
        System.out.println("3 for mul");
        System.out.println("4 for div");
        System.out.println("5 for finding maximum num");
        System.out.println("6 for finding minimum num");
        System.out.println("7 for exit");
        System.out.println("Enter your choice");
        int num=input.nextInt();
        int total=0;
        switch (num){
            case 1:
                total=a+b;
                break;
            case 2:
                total=a-b;
                break;
                case 3:
                total=a*b;
                break;
                    case 4:
                total=a/b;
                break;
                        
                    case 5:     
             if (a>b){
             System.out.println("a is greater than b");
             }
             else{
                 System.out.println("a is not greater than b");
             }
                    break;
                          case 6:     
             if (a<b){
             System.out.println("a is smaller than b");
             }
             else{
                 System.out.println("a is not smaller than b");
             }
                    break;
                   case 7:
                System.exit(0);
                break;
            
        }
        
        System.out.println("total is"+total);
    }
        
    
}
