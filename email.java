package com.first;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
    public static void main(String[] args){
        int input_2;
        String input;
        do{
            System.out.println("Enter Your Email");

            Scanner sc=new Scanner(System.in);

             input=sc.nextLine();

            String pattern="^[a-z]+\\@[a-z]+\\.[a-z]{2,3}$";

            Pattern p=Pattern.compile(pattern);
            Matcher m=p.matcher(input);
            if(m.matches()){
                System.out.println("Your email is valid");
            }else {
                System.out.println("Your Email is Invalid");
            }

            System.out.println("Enter -1 to Exit");
            input_2=sc.nextInt();
        }while (input_2 !=-1);

    }
}
