package com.first;

import java.util.Scanner;

public class odd_even {
    public  static void main(String [] args){

        Scanner sc=new Scanner(System.in);



        int input;
        do{
             System.out.println("Enter a number to see odd or Even");
             input=sc.nextInt();

            if(input % 2 ==0){
                System.out.println(input+"  is Even number");
            }else {
                System.out.println(input+ " is Odd Number");
            }
            System.out.println("Enter 1 to exit");
            input =sc.nextInt();
        }while (input != 1);

    }

}
