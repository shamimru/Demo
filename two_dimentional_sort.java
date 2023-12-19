package com.first;

public class two_dimentional_sort {
    public static void main(String[] args){

        int [] [] arr={
                {1,9,3,-56},
                {67,99,-56,-67},
                {45,6,8,-34}
        };

        int row=arr.length;
//        System.out.println(row);
        int column=arr[0].length;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length-1;j++){
                for(int k=0;k<arr[i].length-j-1;k++){
                    if(arr[i][k] > arr[i][k+1]){
                        int temp=arr[i][k];
                        arr[i][k]=arr[i][k+1];
                        arr[i][k+1]=temp;
                    }
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);


            }
            System.out.println(" ");
        }

    }
}
