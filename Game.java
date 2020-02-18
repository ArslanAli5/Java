/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char flage='Y';
        while (flage=='Y')
        {
        Scanner input = new Scanner(System.in);
        int randomNum=(int)(Math.random() * (90-65+ 1) +65);
        System.out.println("Number:"+randomNum);
        char comparec = (char) randomNum;
        for ( int i=4;i>=0;i--)
        {
            System.out.print("Enter the Guessing Character:");
            char inputc = input.next().charAt(0);
            if (inputc==comparec)
            {
                
                System.out.println("Conradualtions! You have Won");
            }
            else if (inputc<comparec)
            {
                System.out.println("Your guess is Below");
            }
            else if (inputc>comparec)
            {
                System.out.println("Your guess is Above");
            }
            System.out.printf("You hava %d turns\n",i);
           
        }
        System.out.println("The Character is: "+comparec);
        System.out.println("You Lose the Game");
        System.out.println("Do you want to paly again?\nPress 0 to exit the game");
        flage = input.next().charAt(0);
        }
       
       
    }
   
}
