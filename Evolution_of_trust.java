
/**
 * Write a description of class Evolution_of_trust here.
 *
 * @author (Hamish Kaufman)
 * @version (15/5/2023)
 */
import java.util.Scanner; //Allows for the use of scanners.

import java.lang.Math;

class Random_math {


}

public class Evolution_of_trust
{

    private int x;
    public static void main(String Random_math[])
    {
        // Defines how high or low it can go.
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 10; i++) {// generate random numbers within 1 to 10
            int rand = (int)(Math.random() * range) + min;

            // Output is different everytime this code is executed.
            System.out.println(rand);
        }
    }
    public Evolution_of_trust()
    {
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


        switch (x){
            case 1:System.out.println(s1);
                break;
            case 2:System.out.println(s2);
                break;
            case 4:System.out.println("Can't choose?");
            default :System.out.println(s3);
                //break;
        }
        //if (

    }
}
