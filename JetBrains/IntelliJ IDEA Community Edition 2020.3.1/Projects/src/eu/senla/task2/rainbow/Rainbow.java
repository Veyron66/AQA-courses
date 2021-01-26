package eu.senla.task2.rainbow;

import java.util.Scanner;
import java.util.*;
public class Rainbow {

   public void choice() {
       int i = 0;
       int numberColor = 0;
       int numberOfColor = 0;
       int numberOfColor2 = 0;
       String currentColor = null;
       Scanner input = new Scanner(System.in);
           System.out.println("Enter the number of colors (one or two)");
           numberColor = input.nextInt();

           if (numberColor == 1) {
               System.out.println("Enter number of from 1 to 7");
               numberOfColor = input.nextInt();}


           switch (numberOfColor) {
               case 1:
                   currentColor = "red";
                   break;
               case 2:
                   currentColor = "orange";
                   break;
               case 3:
                   currentColor = "yellow";
                   break;
               case 4:
                   currentColor = "green";
                   break;
               case 5:
                   currentColor = "blue";
                   break;
               case 6:
                   currentColor = "dark blue";
                   break;
               case 7:
                   currentColor = "purple";
           }


           if (numberColor == 2) {
               System.out.println("Enter number of from 12 to 17");
               numberOfColor2 = input.nextInt();
           }


           switch (numberOfColor2) {
               case 12:
                   currentColor = "red-orange";
                   break;
               case 13:
                   currentColor = "orange-yellow";
                   break;
               case 14:
                   currentColor = "yellow-green";
                   break;
               case 15:
                   currentColor = "green-blue";
               case 16:
                   currentColor = "blue-dark blue";
               case 17:
                   currentColor = "dark blue-purple";
           }

       if (numberColor > 2) {
                System.out.println("You entered a number greater than two. End of program");}
                System.out.print("Your color in rainbow:" + currentColor);

   }

                          }





