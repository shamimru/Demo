package com.first;

public class odd_1_50 {
    public static  void main(String[] args){

        int sum=0,i;
        for( i=1;i<=50;i++){
            if(i%2 != 0){
                sum+=i;
            }
        }
        System.out.println(sum);

    }

}
