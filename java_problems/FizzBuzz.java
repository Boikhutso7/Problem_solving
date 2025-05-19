package java_problems;

import java.util.Random;

public class FizzBuzz{

    public  static void fizzbuzz(){

        Random random = new Random();
        int number = random.nextInt(100) + 1; // random numbers to 100

        if(number% 3 == 0 && number%5 == 0 ){
            System.out.println("FizzBuzz");
        }
        else if (number % 3 == 0){
            System.out.println("Fizz");
        }
        else if (number % 5 == 0){
            System.out.println("BUZZ");
        }
        else{
            System.out.println(number);
        }
    
    }

    public static void main(String[] args){
        fizzbuzz();
    }
}


