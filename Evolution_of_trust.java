/**
 * Write a description of class Evolution_of_trust here.
 *
 * @author (Hamish Kaufman)
 * @version (24/7/2023)
 */
import java.io.*; 
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
    int choose_ai() {

        //String ;

        int num_of_ai = 2;
        int base_number = 1;
        //int choosing_ai = num_of_ai;
        //int choose_ai = (int)(Math.random() * choosing_ai) + base_number;
        int random_ai = (int)(Math.random() * num_of_ai) + base_number;

        System.out.println(random_ai);

        return random_ai;

    }
    public int Cooperate;
    public int Cooperate_or_cheat;
    public int ai_Cooperate_or_cheat;//To allow use of manually using the ai through human hands for testing.
    //private int ai_Cooperate;

    //public static void String (){
    //Scanner sc= new Scanner(System.in);  
    //System.out.print("String");
    //String str= sc.nextLine();
    //System.out.print("Excellent:"+str);
    ///}
    //public random_ai() {

    //    int num_of_ai = 2;
    //    int base_number = 1;
    //    int choosing_ai = num_of_ai;
    //    int choose_ai = (int)(Math.random() * choosing_ai) + base_number;

    //    return random_ai;
    //}
    

    public Evolution_of_trust(){
        boolean Game = true; //Let's the Main game while function work.
        boolean cooperate = false;
        boolean cheat = false;
        boolean ai_cooperate = false;
        boolean ai_cheat = false;

        boolean Kind_ai = false;
        //boolean Evil_ai = false;

        System.out.println(choose_ai()+" Value of choose_ai");
        
        if (choose_ai()==1){
            Kind_ai = true;
            //Evil_ai = false;
            

        }
        //else (choose_ai()==2){
            //Evil_ai = true;
        //    Kind_ai = false;
        //}

        
        //if (choose_ai=1());{
        //    evil_ai = false;
        //    Kind_ai = true;
        //    
        //}

        //boolean help = false;
        //int num_of_ai = 2;
        //int base_number = 1;
        //int Select_ai = num_of_ai;
        //int Select_ai = (int)(Math.random() * Select_ai) + base_number;
        //return (int)(Math.random() * Select_ai)+ base_number;
        //return int Select_ai;
        String history_cooperate;
        String history_cheat;
        history_cooperate="cooperate";
        history_cheat="cheat";

        //If all ai is turned on it uses the ai lowest in the code.
        int max = 10;//Max amount of rounds.
        int min = 1;//Lowest amount of rounds
        int range = max - min + 0; // Defines how high or low The number of rounds will be.
        int [] points = new int [2]; //Stores the points as a round goes on.
        points[0]=0;

        int [] ai_points = new int [2]; //Stores the points as a round goes on.
        ai_points[0]=0;

        String [] History = new String [10]; //Records the actions a player took.

        //System.out.println(History);
        //int points=-0;
        //int ai_points=-0;
        //System.out.println("Cooperate or cheat(Current 1 is cooperate and 2 to cheat");
        System.out.println("This is the prisoner's dilemna aganist a bot if you don't not know how to play prisoner's dilemna type 'cooperate' or 'cheat' aganist the ai");

        int round = (int)(Math.random() * range) + min;

        System.out.println(round+" rounds left.");//debug to tell amount of rounds.
        while (Game) {// So game can always be running.
            Scanner sc= new Scanner(System.in);
            System.out.println("round begin");
            //System.out.println("player_Cooperate_or_cheat");
            if (Kind_ai==true){
                //System.out.println("ai_cooperate");
                ai_cheat=false;
                //ai_cooperate=true;
            }
            if (Kind_ai==false){
                //ai_cooperate=false;
                ai_cheat=true;

            }
            String Cooperate_or_cheat = sc.next();
            
            //System.out.println("ai_Cooperate_or_cheat");
            //String ai_Cooperate_or_cheat = sc.next();
            System.out.println("Round end");

            switch (Cooperate_or_cheat) {

                case "c":
                    //Cooperate_or_cheat = sc.next();
                    System.out.println("Cooperate");
                    cheat=false;
                    cooperate=true;

                    break;

                case "C": //Lower case variant
                    System.out.println("Cheat");
                    cooperate=false;
                    cheat=true;
                    break;

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

            }
            

            //Scanner myScan = new Scanner(System.in);
            if (cooperate==true){

                History[round]="Cooperate";
                System.out.println("History of actions taken below ");
                for (int i = 1; i <= 9; i++) { 
                    System.out.print(History[i] + " "); 
                }

            }

            if (cooperate==false){

                History[round]="Cheat";
                System.out.print("History of actions taken below ");
                for (int i = 1; i <= 9; i++) { 
                    System.out.print(History[i] + " "); 
                }

            }
            
            System.out.println(" "); //Makes sure the history and your points line don't print on the same line. 

            //while (Kind_ai==true) {
            //    if (cooperate==true) {
            //       ai_cooperate = true;
            //   }
            //    if (cheat==true) {
            //        ai_cooperate=true;
            //
            //    }
            //}

            //switch (ai_Cooperate_or_cheat) {
            //    case "ai_cooperate":
            //        System.out.println("ai_Cooperate");
            //        ai_cheat=false;
            //        ai_cooperate=true;
            //        break;

            //   case "ai_Cooperate":
            //       System.out.println("ai_Cooperate");
            //       ai_cheat=false;
            //        ai_cooperate=true;

            //       break;

            //    case "ai_cheat": //Lower case variant
            //       System.out.println("ai_Cheat");
            //        ai_cooperate=false;
            //        ai_cheat=true;
            //        break;

            //    case "ai_Cheat": //If the person happens to press shift at the start of typing the word.
            //        System.out.println("ai_Cheat");
            //        ai_cooperate=false;
            //        ai_cheat=true;

            //    default:
            //System.out.println("Type ai_cheat or ai_cooperate to make the choice for the ai."); // Tells player how to play
            //}

            //points[0]++;
            //ai_points[0]++;

            if(cooperate&&ai_cheat==false){ //Both get even amount.
                points[0]+=1;
                ai_points[0]+=1;

                System.out.println(points[0]+" Your points");
                System.out.println(ai_points[0]+" Opponent's points.");
                cooperate=false; //resets back to false to avoid problems for if it were to stay true.
                //ai_cheat=false;
            }
            if(cheat&&ai_cheat==true){ //No one gains anything
                System.out.println(points[0]+" Your points");
                System.out.println(ai_points[0]+" Opponent's points.");
                //points[0]=0;
                //ai_points[0]=0;

                //cheat=false;
                //ai_cheat=false;
                //No one gains anything despite this code saying it will remove one.

            }
            if(cheat&&ai_cheat==false){ //Player gains more and ai loses 1 point.
                points[0]+=1;
                ai_points[0]-=2;

                System.out.println(points[0]+" Your points");
                System.out.println(ai_points[0]+" Opponent's points.");
                cheat=false; //resets back to false to avoid problems for if it were to stay true.
                ai_cooperate=false;

            }
            if(cooperate&&ai_cheat==true){ //Player loses 1 point and ai gains 3 points.
                points[0]-=2;
                ai_points[0]+=1;

                System.out.println(points[0]+" Your points");
                System.out.println(ai_points[0]+" Opponent's points.");
                cooperate=false; //resets back to false to avoid problems for if it were to stay true.
                ai_cheat=false;

            }
            round--;
            if (round==0){ //To end the game once it hits 0.
                Game=false;
            }
            if (Game==false){
                System.out.println("Game ends");//To indicate that the game has ended to the player so they don't get confused to why game isn't working.
            }

        }
    }
}
