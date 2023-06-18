
/**
 * Write a description of class Evolution_of_trust here.
 *
 * @author (Hamish Kaufman)
 * @version (15/5/2023)
 */
import java.util.*;  
import java.util.Scanner; //Allows for the use of scanners.

import java.lang.Math; //Allows for the use of random math.

class Random_math {

}
public class Evolution_of_trust
{

    public int x;
    public int a;
    public int Cooperate;

    //public static void String (){
    //Scanner sc= new Scanner(System.in);   
    //System.out.print("String");
    //String str= sc.nextLine();
    //System.out.print("Excellent:"+str);
    ///}

    public Evolution_of_trust()
    {
        // Defines how high or low The number of rounds will be.
        int max = 10;//Max amount of rounds.
        int min = 1;//Lowest amount of rounds
        int range = max - min + 1;
        boolean Main_Game = true;
        boolean cooperate = true;
        //public int
        for (int i = 0; i < 1; i++) {// generate random numbers within 1 to 10
            int rand = (int)(Math.random() * range) + min;

            // Output is different everytime this code is executed.
            System.out.println(rand);
        }
        

        Scanner sc= new Scanner(System.in);   
        System.out.print("String");
        String str= sc.nextLine();
        System.out.print("Excellent:"+str);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cooperate or cheat(Current 1 is cooperate and 2 to cheat"); 
        int x=keyboard.nextInt();
        Scanner inputStream = new Scanner(System.in);
        String s1,s2,s3;
        s1="Cooperate";
        s2="Cheat";
        s3="Random";

        int [] score = new int [20]; //Stores the score as a round goes on with each value in an array being the score for that round.
        score[0]=0;
        score[1]=0;
        score[2]=0;

        if(cooperate){
            System.out.println("It's working");

        }

            switch (x){
                case 1:System.out.println(s1);
                    break;
                case 2:System.out.println(s2);
                    break;
                case 4:System.out.println("Can't choose?");
                    break;
                default :System.out.println(s3);
                    //break;
            }
            //if (
                while (Main_Game) {


        }
    }
}
