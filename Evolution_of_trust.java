
/**
 * Write a description of class Evolution_of_trust here.
 *
 * @author (Hamish Kaufman)
 * @version (15/5/2023)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;  
import java.util.Scanner; //Allows for the use of scanners.
import javafx.application.Preloader.StateChangeNotification;

import java.lang.Math; //Allows for the use of random math.

class Random_math {

}
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
        
        // Defines how high or low The number of rounds will be.
        int max = 10;//Max amount of rounds.
        int min = 1;//Lowest amount of rounds
        int range = max - min + 1;
        int [] score = new int [20]; //Stores the score as a round goes on with each value in an array being the score for that round.
        score[0]=0;
        score[1]=0;
        score[2]=0;
        int points=0;
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
                    break;
                case "cheat":
                    System.out.println("Cheat");

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
            if(cooperate==true){
                points=+4;
                
                System.out.println("Very epic score"+ points);
                
                

            }
            //switch (x){
            //   case 1:System.out.println(s1);
            ///       break;
            //   case 2:System.out.println(s2);
            //       break;
            //    default :System.out.println(s3);
            //        //break;
            //}

        }
        //static (Always_cheats){//An ai that always cheats in response to your actions.

    }
}