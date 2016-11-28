package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many trials do you want to run?");
        int trial = input.nextInt();
        int iter = 0;
        int avg = 0;
        boolean [] numbers = new boolean[100];
        boolean [] tru = new boolean[100];
        for(int j = 0; j < tru.length; j++){
            tru[j] = true;
        }
        for(int i = 0; i > trial; i++)
        {
             while(numbers != tru) {
                /*random
                numbers[x] = true;
                iter++;
                */
            }
            avg += iter;
        }
        avg /= trial;
        System.out.println("The average number of iterations of the trials is " + avg);
        System.out.println("The law of large numbers says that the more times the same experiment is run the closer the average of the results should be to the expected value. This means that the " +
                "trials that ran more will have data closer to the expected value of 518");
    }
}
