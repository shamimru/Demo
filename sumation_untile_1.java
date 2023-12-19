package com.first;

import java.util.Scanner;

public class sumation_untile_1 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int sum=0,i,input;



        do{
            System.out.println("Enter a number");
            input=sc.nextInt();



            sum+=input;



            System.out.println("enter -1 to exit the code");
            input=sc.nextInt();


        }while(input !=-1);
        System.out.println("The summation is = "+sum);
    }

}
