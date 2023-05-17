
/**
 * Write a description of class Evolution_of_trust here.
 *
 * @author (Hamish Kaufman)
 * @version (15/5/2023)
 */
import java.util.Scanner; //Allows for the use of scanners.
public class Evolution_of_trust
{

    private int x;


    public Evolution_of_trust()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cooperate or cheat"); 
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
