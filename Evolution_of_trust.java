
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

import java.lang.Math; //Allows for the use of random math.


public class Evolution_of_trust
{

    public int x;
    public int a;
    public int Cooperate;
    public int Cooperate_or_cheat;

    //public static void String (){
    //Scanner sc= new Scanner(System.in);   
    //System.out.print("String");
    //String str= sc.nextLine();
    //System.out.print("Excellent:"+str);
    ///}

    public Evolution_of_trust()
    {
        boolean Main_Game = true; //Let's the Main+game while function work. 

        boolean cooperate = false;
        boolean cheat = false;
        boolean ai_cooperate = false;
        boolean ai_cheat = false;

        // Defines how high or low The number of rounds will be.
        int max = 10;//Max amount of rounds.
        int min = 1;//Lowest amount of rounds
        int range = max - min + 1;
        int [] score = new int [20]; //Stores the score as a round goes on with each value in an array being the score for that round.
        score[0]=0;
        score[1]=0;
        score[2]=0;
        int points=0;
        int ai_points=0;
        //System.out.println("Cooperate or cheat(Current 1 is cooperate and 2 to cheat"); 
        //public int
        System.out.println("Cooperate or Cheat");

        int round = (int)(Math.random() * range) + min;

        // Output is different everytime this code is executed.
        System.out.println(round);

        while (Main_Game) {// So game can always be running.
            Scanner sc= new Scanner(System.in); 
            String Cooperate_or_cheat = sc.next();

            switch (Cooperate_or_cheat) {
                case "cooperate":
                    System.out.println("Cooperate");
                    cooperate=true;
                    cheat=false;
                    break;

                case "Cooperate":
                    System.out.println("Cooperate");
                    cooperate=true;
                    cheat=false;
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

                default:
                    System.out.println("In this game you'll be up against an ai with a certain strategy it's your job to gain more points then them.");
                    System.out.println("Type cheat or cooperate to choose"); // Tells player how to play 

                    //Scanner sc= new Scanner(System.in);   
                    //System.out.print("String");
                    //String str= sc.nextLine();
                    //System.out.print(str);

                    //Scanner keyboard = new Scanner(System.in);

                    // x=keyboard.nextInt();
                    //Scanner inputStream = new Scanner(System.in);
                    //String s1,s2,s3,Cooperate,Cheat;
                    //s1="Cooperate";
                    //s2="Cheat";
                    //s3="Random";
                    //Cooperate="Cooperate";
                    //Cheat="Cheat";
            }
            points++;
            ai_points++;
            if(cooperate==true){
                points+=2;

                System.out.println(points);
            }
            if(cheat==true){
                points+=3;
                ai_points-=1;

            }
            if(ai_cooperate==true){
                ai_points+=2; 

            }
            if(ai_cheat==true){
                points+=3;

            }

        }
        //switch (x){
        //   case 1:System.out.println(s1);
        ///       break;
        //   case 2:System.out.println(s2);
        //       break;
        //    default :System.out.println(s3);
        //        //break;
        //}
        
        {
            if(cheat==true){

            }

        }
    }

}
