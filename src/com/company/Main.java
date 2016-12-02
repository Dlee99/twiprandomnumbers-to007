package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many trials do you want to run?");
        int trial = input.nextInt();
        int iter = 0;
        int avg = 0;
        Random rndm = new Random();
        boolean [] numbers = new boolean[100];
        boolean [] tru = new boolean[100];
        for(int j = 0; j >= tru.length; j++){
            tru[j] = true;
        }
        for(int i = 0; i < trial; i++)
        {
             while(numbers != tru){
                     numbers[rndm.nextInt(100)] = true;
                     iter++;
             }
            avg += iter;
            iter = 0;
            for(int j1 = 0; j1 < numbers.length; j1++){
                numbers[j1] = false;
            }
        }
        avg /= trial;
        System.out.println("The average number of iterations of the trials is " + avg);
        System.out.println("The law of large numbers says that the more times the same experiment is run the closer the average of the results should be to the expected value. This means that the " +
                "trials that ran more will have data closer to the expected value of 518.");
    }
}
