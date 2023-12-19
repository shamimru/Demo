package com.first;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int factorial=1,i,input;
        System.out.println("Enter a number to see Factorial");
        input=sc.nextInt();


        if(input <0){
            System.out.println("Invalid input");

        }else if(input == 0 | input==1){
            System.out.println("The Factorail is = "+factorial);
        }else if(input >1){
            for(i=1;i<=input;i++){
                factorial*=i;
            }
            System.out.println("The Factorial is = "+factorial);

        }

    }
}
