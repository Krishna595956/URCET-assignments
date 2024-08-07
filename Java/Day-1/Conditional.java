// check whether the number is greater than 10 or not.if so check if it is divisible by 3 or not.

import Java.Oops.String1;

class Conditional{
    public static void main(String1 args[]){
        int num=15;
        if(num>10){
            System.out.println("The number is greater than 10");
           if(num%3==0){
            System.out.println("The number is divisible by 3");
           }
           else{
            System.out.println("The number is not divisible by 3");
           }
        }
        else{
            System.out.println("The number is not greater than 10");
        }
    }
}