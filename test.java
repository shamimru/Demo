import java.util.Scanner;

public class test {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);



//        for(int i=0;i<=6;i++){
//
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println(" ");
//        }
//        1
//        12
//        123
//        1234
//        12345
//        123456


//        for(int i=6;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print(" ");
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//*******
//******
//*****
//****
//***
//**
//*


//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//*****
//*****
//*****
//*****
//*****

//        for(int i=0;i<=5;i++){
//
//            for(int k=0;k<=5-i;k++){
//                System.out.print(" ");
//            }
//            for (int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//     *
//    **
//   ***
//  ****
// *****

//
//        for(int i=0;i<6;i++){
//            for(int j=5;j>i;j--){
//                System.out.print(" ");
//            }
//            for(int k=0;k<i;k++){
//                System.out.print("*");
//            }
//
//            System.out.println(" ");
//        }
//     *
//   **
//  ***
// ****
//*****


//       for(int i=0;i<6;i++){
//           for(int j=5;j>=i;j--){
//               System.out.print(" ");
//           }
//           for(int j=0;j<i;j++){
//               System.out.print("A");
//           }
//           for(int j=0;j<i;j++){
//               System.out.print("A");
//           }
//           System.out.println(" ");
//          }
//          AA
//         AAAA
//        AAAAAA
//       AAAAAAAA
//      AAAAAAAAAA





//        System.out.println("Enter s string");
//        String input=sc.nextLine();
//        int low=0,high=input.length()-1;
//        boolean isPalindrom=true;
//        while(low < high){
//            if(input.charAt(low) != input.charAt(high)){
//                isPalindrom=false;
//                break;
//            }
//            low++;
//            high--;
//
//        }
//
//        if(isPalindrom){
//            System.out.println("Palindrom");
//        }else {
//            System.out.println("Not palinDRom");
//        }

//-------------------------------------

//        int n1,n2;
//        System.out.println("Enter n1");
//        n1=sc.nextInt();
//        System.out.println("Enter n2");
//        n2=sc.nextInt();
//
//        int gcd=1;
//        int k=2;
//        while(k <= n1 &&  k <= n2){
//            if(n1 % k ==0 && n2 % k == 0){
//                gcd=k;
//
//            }
//            k++;
//
//        }
//        System.out.println("Your gcd of "+ n1 +" and "+ n2 + " is "+gcd);


//        int i=0;
//        while (i<5){
//            for(int j=i;j>1;j--){
//                System.out.println(j+" ");
//                System.out.println("****");
//
//            }
//            i++;
//        }

//        for(int i=0;i<100;i++){
//            for(int j=0;j<100;j++){
//                for(int k=0;k<100;k++){
//                    System.out.println(i+ " "+ j+" "+k);
//                }
//            }
//        }
//        int  sum=0,j=0,i=0;
//
//        for( i=0;i<10;i++){
//            sum+=1;
//        }
//        if(i<j){
//            System.out.println(i);
//        }else{
//            System.out.println(j);
//        }
//
//        while ((j <10)){
//            j++;
//        }
//
//        do{
//            j++;
//        }while (j<10);
//        int n1=(int) (Math.random() * 10);
//        int n2=(int) (Math.random() * 10);
//
//        System.out.println("What is "+n1 +" + "+ n2+" ?");
//        System.out.println("Enter Your Number");
//        int input=sc.nextInt();
//        while(n1+n2 != input){
//            System.out.println("your answer is wrong");
//            System.out.println("Enter Your Number");
//             input=sc.nextInt();
//        }
//        System.out.println("You got the Lottery");
//        System.out.println("Enter name1");
//        String name1=sc.nextLine();
//        System.out.println("Enter name1");
//
//        String name2=sc.nextLine();
//
//        if(name1.contains(name2)){
//            System.out.println("contain "+ name2);
//        }



//        for(int i=0; i<100;i++){
//            System.out.println((char) i+" "+i);
//        }
//        System.out.println('1'+1);
//        System.out.println();
//
//        System.out.println("1"+1);

//        System.out.println("Enter your Year");
////        int input =sc.nextInt();
//        boolean isLeap=false;
//        if((input % 4 == 0  & input % 100 != 0 )|| (input % 400 ==0)){
//            isLeap=true;
//        }

//        if(isLeap){
//            System.out.println("Its leap year");
//        }else{
//            System.out.println("its not leap year");
//        }
    }
}
