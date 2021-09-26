package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class ex29 {

       public static void main(String[] Args){

              Scanner scanner = new Scanner(System.in);
              int loop = 0;
              int years;

              while(loop == 0){
                  System.out.print("What is the rate of return? ");
                  String rate = scanner.nextLine();

                  if (rate.equals("0")) {
                    System.out.println("Sorry. That's not a valid input. ");
                    }

                  else if (rate.matches("[^0-9]+")) {
                      System.out.println("Sorry. That's not a valid input. ");
                  }

                  else if (rate.matches("[0-9]+")) {
                       loop = 1;

                       int Rate = Integer.parseInt(rate);

                       years = 72/Rate;
                       System.out.print("It will take " + years + " years to double your initial investment.");

                  }

              }

       }



}
