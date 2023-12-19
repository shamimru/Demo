package com.first;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args){

        Scanner sc=new Scanner((System.in));
        int input;
        do{
            System.out.println("Enter a number to see prime or not");
             input=sc.nextInt();
            int count=0;
            if(input <0 ){
                System.out.println("invalid input");
                continue;
            }else if(input == 1){
                System.out.println("it is not prime and not composite number");
               // break;
                continue;
            }else if(input > 1){
                for(int i=2;i<input;i++){
                    if(input % i==0){
                        count++;
                        break;
                    }
                }

            }
            if(count == 0){
                System.out.println("Prime");
            }else {
                System.out.println("Not Prime");
            }
            System.out.println("enter -1 to exit");
            input=sc.nextInt();
        }while(input !=-1);

    }
}
