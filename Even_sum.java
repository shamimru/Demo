package com.first;

public class Even_sum {
    public static void main(String[] args){
        int sum=0,i;
        for(i=1;i<=20;i++){
            if(i %2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
