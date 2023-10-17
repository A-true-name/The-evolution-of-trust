/**
 * Write a description of class Evolution_of_trust here.
 *
 * @author (Hamish Kaufman)
 * @version (24/7/2023)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;  
import java.util.Scanner; //Allows for the use of scanners.
import javafx.application.Preloader.StateChangeNotification;
import java.util.Random; //Use of commands for random picking things.
import java.lang.Math; //Allows for the use of random math.

public class Evolution_of_trust
{

    public int x;
    public int a;
    //public int Cooperate;
    public int Cooperate_or_cheat;
    public int ai_Cooperate_or_cheat;//To allow use of manually using the ai through human hands for testing.
    //private int ai_Cooperate;

    //public static void String (){
    //Scanner sc= new Scanner(System.in);  
    //System.out.print("String");
    //String str= sc.nextLine();
    //System.out.print("Excellent:"+str);
    ///}

    public Evolution_of_trust()
    {
        boolean Game = true; //Let's the Main game while function work.

        boolean cooperate = false;
        boolean cheat = false;
        boolean ai_cooperate = false;
        boolean ai_cheat = false;
        boolean Kind_ai = true;

        //boolean help = false;

        // Defines how high or low The number of rounds will be.

        int max = 10;//Max amount of rounds.
        int min = 1;//Lowest amount of rounds
        int range = max - min + 0;
        int [] score = new int [20]; //Stores the score as a round goes on with each value in an array being the score for that round.
        //score[0]=0;
        //score[1]=0;
        //score[2]=0;
        int points=0;
        int ai_points=0;
        //System.out.println("Cooperate or cheat(Current 1 is cooperate and 2 to cheat");
        //public int
        System.out.println("This is the prisoner's dilemna aganist a bot if you don't not know how to play prisoner's dilemna type help");

        int round = (int)(Math.random() * range) + min;

        // Output is different everytime this code is executed.
        System.out.println(round+" rounds");

        while (Game) {// So game can always be running.
            Scanner sc= new Scanner(System.in);
            System.out.println("player_Cooperate_or_cheat");
            String Cooperate_or_cheat = sc.next();
            System.out.println("ai_Cooperate_or_cheat");
            String ai_Cooperate_or_cheat = sc.next();
            

            switch (Cooperate_or_cheat) {
                case "cooperate":
                    //Cooperate_or_cheat = sc.next();
                    System.out.println("Cooperate");
                    cheat=false;
                    cooperate=true;

                    break;

                case "Cooperate":
                    System.out.println("Cooperate");
                    cheat=false;
                    cooperate=true;

                    break;

                case "cheat": //Lower case variant
                    System.out.println("Cheat");
                    cooperate=false;
                    cheat=true;
                    break;

                case "Cheat": //If the person happens to press shift at the start of typing the word.
                    System.out.println("Cheat");
                    cooperate=false;
                    cheat=true;
                    break;

                case "Help":
                    System.out.println("Prisoner's dilemna is a game where you either cheat or cooperate.");
                    System.out.println("And Evolution of trust Choosing to cooperate and trust the other person that'll also cooperate or you can sabotage them and cheat.");
                    //help=true;
                    break;

                case "help":
                    System.out.println("Prisoner's dilemna is a game where you either cheat or cooperate.");
                    System.out.println("And Evolution of trust Choosing to cooperate and trust the other person that'll also cooperate or you can sabotage them and cheat.");
                    //help=true;
                    break;

                default:
                    //System.out.println("In this game you'll be up against an ai with a certain strategy it's your job to gain more points then them.");
                    //System.out.println("Type cheat or cooperate to choose"); // Tells player how to play

            }// End of switch
            while (Kind_ai==true) {
                if (cooperate==true) {
                    ai_cooperate = true;
                }
                if (cheat==true) {
                    ai_cooperate=true;

                }
            }
            

            switch (ai_Cooperate_or_cheat) {
                case "ai_cooperate":
                    System.out.println("ai_Cooperate");
                    ai_cheat=false;
                    ai_cooperate=true;
                    break;

                case "ai_Cooperate":
                    System.out.println("ai_Cooperate");
                    ai_cheat=false;
                    ai_cooperate=true;

                    break;

                case "ai_cheat": //Lower case variant
                    System.out.println("ai_Cheat");
                    ai_cooperate=false;
                    ai_cheat=true;
                    break;

                case "ai_Cheat": //If the person happens to press shift at the start of typing the word.
                    System.out.println("ai_Cheat");
                    ai_cooperate=false;
                    ai_cheat=true;

                default:
                    //System.out.println("Type ai_cheat or ai_cooperate to make the choice for the ai."); // Tells player how to play
            }
            points++;
            ai_points++;

            if(cooperate&&ai_cooperate==true){ //Both get even amount.
                points+=2;
                ai_points+=2;

                System.out.println(points+" Your points");
                System.out.println(ai_points+" Opponent's points.");
                cooperate=false;
                ai_cooperate=false;
            }
            if(cheat&&ai_cheat==true){ //No one gains anything
                System.out.println(points+" Your points");
                System.out.println(ai_points+" Opponent's points.");

            }
            if(cheat&&ai_cooperate==true){ //Player gains more and ai loses 1 point.
                points+=3;
                ai_points-=1;

                System.out.println(points+" Your points");
                System.out.println(ai_points+" Opponent's points.");
                cheat=false;
                ai_cooperate=false;

            }
            if(cooperate&&ai_cheat==true){ //Player loses 1 point and ai gains 3 points.
                points-=1;
                ai_points+=3;

                System.out.println(points+" Your points");
                System.out.println(ai_points+" Opponent's points.");
                cooperate=false;
                ai_cheat=false;

            }

        }
    }
}

