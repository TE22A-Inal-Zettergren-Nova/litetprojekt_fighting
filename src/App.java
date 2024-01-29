import java.util.Scanner;
import java.util.Random;

public class App {

            
public static void main(String[] args) throws Exception {

        Scanner tb = new Scanner(System.in);
        System.out.println("Meny \n 1. Starta \n 2. Avsluta");
        int startval = tb.nextInt();

        while (startval!=3) {
            if (startval==1)
            {
                System.out.println("Spelet startar...");
                break;
            }

            else if(startval==2)
            {
                System.out.println("Spelet avslutas...");
                System.exit(0);
                break;
            }

            else{
                System.out.println("Detta val finns inte");
                main(args);
                break;
            }
        }
        
        //chansen för träff//
        Random rand = new Random(); 
        //attack 2//
        int chansA2 = 5;
        int träffA2 = rand.nextInt(chansA2);
        //attack 3//
        int chansA3 = 2;
        int träffA3 = rand.nextInt(chansA3);
        //attack 4//
        int chansA4 = 5;
        int träffA4 = rand.nextInt(chansA4);
        //attack 5//
        int chansA5 = 20;
        int träffA5 = rand.nextInt(chansA5);

        int motståndareHP = 100;
        int spelareHP = 100;
 
        System.out.println("Info om attacker: \n Poke: 100% chans för träff, 5 DMG\n Punch: 80% chans för träff, 15 DMG\n Kick: 50% chans för träff, 25 DMG\n Stab: 20% chans för träff, 50 DMG\n Sword slash: 5% chans för träff, 100 DMG\n");
 
            System.out.println("Välj din attack: \n 1. Poke \n 2. Punch \n 3. Kick \n 4. Stab \n 5. Sword slash\n");
            int val = tb.nextInt(); 

            switch (val) {
                case 1:
                    System.out.println("Du gjorde 5 skada");
                    System.out.println("Motståndaren har nu: " + (motståndareHP= motståndareHP -5) + "HP");
                    break;
                case 2:
                    if (träffA2 == 2) {
                        System.out.println("Du missade \nMotståndaren har fortfarande: " + motståndareHP +"HP");
                    }
                    else{
                        System.out.println("Du gjorde 15 skada \nMotståndaren har nu: " + (motståndareHP=motståndareHP - 15) + "HP");
               
                     }
                    break;
                case 3:
                    if (träffA3 == 1) {
                        System.out.println("Du missade \nMotståndaren har fortfarande: " + motståndareHP +"HP");
                    }   
                    else{
                        System.out.println("Du gjorde 25 skada \nMotståndaren har nu: " + (motståndareHP=motståndareHP- 25) + "HP");
                    } 
                    break;
                case 4:
                    if (träffA4 == 1) {
                        System.out.println("Du missade \nMotståndaren har fortfarande: " + motståndareHP +"HP");
                    }
                    else{
                        System.out.println("Du gjorde 50 skada \nMotståndaren har nu: " + (motståndareHP=motståndareHP - 50) + "HP");
                    }
                    break;
                case 5:
                    if (träffA5 == 20) {
                        System.out.println("Du gjorde 100 skada \nMotståndaren har nu: " + (motståndareHP=motståndareHP - 100) + "HP");
                    }
                    else{
                        System.out.println("Du missade \nMotståndaren har fortfarande: " + motståndareHP +"HP");
                    } 
                    break;
                default:
                    System.out.println("Detta val finns inte välj något av ovanstående");
                    break;
                
             
         }
        }
    }

    

