import java.util.Scanner;
import java.util.Random;

   
public class App {

    //public variabler//
    public static int motståndareHP=100;
    public static int spelareHP=100;

    public static String RESET = "\u001B[0m";
    public static String RED = "\u001B[31m";
    public static String GREEN = "\u001B[32m";
    public static String BLUE = "\u001B[34m";
    public static String YELLOW = "\u001B[33m";
    public static String CYAN = "\u001B[36m";
    public static String PURPLE = "\u001B[35m";

    static void HP_reset(){
        motståndareHP=100;
        spelareHP=100;
    }

    //metod för när spelaren attackerar//
    static void spelareAttack(){
        Scanner tb = new Scanner(System.in);

        //attack 2//
        int träffA2 = (int)((Math.random() * 5)+1);
        //attack 3//
        int träffA3 = (int)((Math.random() * 2)+1);
        //attack 4//
        int träffA4 = (int)((Math.random() * 5)+1);
        //attack 5//
        int träffA5 = (int)((Math.random() * 20)+1);
  
 
        System.out.println(GREEN+"\nVälj din attack: \n 1. Poke \n 2. Punch \n 3. Kick \n 4. Stab \n 5. Sword slash\n"+RESET);
        int val = tb.nextInt(); 

            switch (val) {
                case 1:
                    System.out.println(RED+"Du träffa motståndaren och gjorde 5 skada"+RESET);
                    System.out.println(PURPLE+"Motståndaren har nu: " + (motståndareHP= motståndareHP -5) + "HP\n");
                    break;
                case 2:
                    if (träffA2 == 2) {
                        System.out.println(PURPLE+"Du missade \nMotståndaren har fortfarande: " + motståndareHP +"HP\n"+RESET);
                    }
                    else{
                        System.out.println(RED+"Du träffa motståndaren och  gjorde 15 skada"+RESET);
                        System.out.println(PURPLE+"Motståndaren har nu: " + (motståndareHP=motståndareHP - 15) + "HP\n"+RESET);
                     }
                    break;
                case 3:
                    if (träffA3 == 1) {
                        System.out.println(PURPLE+"Du missade \nMotståndaren har fortfarande: " + motståndareHP +"HP\n"+RESET);
                    }   
                    else{
                        System.out.println(RED+"Du träffa motståndaren och  gjorde 25 skada"+RESET);
                        System.out.println(PURPLE+"Motståndaren har nu: " + (motståndareHP=motståndareHP - 25) + "HP\n"+RESET);

                    } 
                    break;
                case 4:
                    if (träffA4 == 1) {
                        System.out.println(RED+"Du träffa motståndaren och  gjorde 50 skada "+RESET);
                        System.out.println(PURPLE+"Motståndaren har nu: " + (motståndareHP=motståndareHP - 50) + "HP\n"+RESET);
                    }
                    else{
                        System.out.println(PURPLE+"Du missade \nMotståndaren har fortfarande: " + motståndareHP +"HP\n"+RESET);
                    }
                    break;
                case 5:
                    if (träffA5 == 20) {
                        System.out.println(RED+"Du träffa motståndaren och gjorde 100 skada"+RESET);
                        System.out.println(PURPLE+"Motståndaren har nu: " + (motståndareHP=motståndareHP - 100) + "HP\n"+RESET);

                    }
                    else{
                        System.out.println(PURPLE+"Du missade \nMotståndaren har fortfarande: " + motståndareHP +"HP\n"+RESET);
                    } 
                    break;
                default:
                    System.out.println(GREEN+"Detta val finns inte välj något av ovanstående\n"+RESET);
                    break;
                }
            }
    
    //metod för när datorn attackerar//
    static void motståndareAttack(){

        //attack 2//
        int träffA2 = (int)((Math.random() * 5)+1);
        //attack 3//
        int träffA3 = (int)((Math.random() * 2)+1);
        //attack 4//
        int träffA4 = (int)((Math.random() * 5)+1);
        //attack 5//
        int träffA5 = (int)((Math.random() * 20)+1);

 
        int motståndareVAL = (int)(Math.random() * 4);


            switch (motståndareVAL) {
                case 0:
                    System.out.println(RED+"Du blev träffad, motståndaren gjorde 5 skada"+RESET);
                    System.out.println(CYAN+"Du har nu: " + (spelareHP= spelareHP -5) + "HP"+RESET);
                    break;
                case 1:
                    if (träffA2 == 2) {
                        System.out.println(CYAN+"Motståndaren missade \nDu har fortfarande: " + spelareHP +"HP"+RESET);
                    }
                    else{
                        System.out.println(RED+"Du blev träffad, motståndaren gjorde 15 skada"+RESET);
                        System.out.println(CYAN+"Du har nu: " + (spelareHP=spelareHP - 15) + "HP"+RESET);
                     }
                    break;
                case 2:
                    if (träffA3 == 1) {
                        System.out.println(CYAN+"Motståndaren missade \nDu har fortfarande: " + spelareHP +"HP"+RESET);
                    }   
                    else{
                        System.out.println(RED+"Du blev träffad, motståndaren gjorde 25 skada"+RESET);
                        System.out.println(CYAN+"Du har nu: " + (spelareHP=spelareHP - 25) + "HP"+RESET);

                    } 
                    break;
                case 3:
                    if (träffA4 == 1) {
                        System.out.println(RED+"Du blev träffad, motståndaren gjorde 50 skada"+RESET);
                        System.out.println(CYAN+"Du har nu: " + (spelareHP=spelareHP - 50) + "HP"+RESET);
                    }
                    else{
                        System.out.println(CYAN+"Motståndaren missade \nDu har fortfarande: " + spelareHP +"HP"+RESET);
                    }
                    break;
                case 4:
                    if (träffA5 == 20) {
                        System.out.println(RED+"Du blev träffad, motståndaren gjorde 100 skada"+RESET);
                        System.out.println(CYAN+"Du har nu: " + (spelareHP=spelareHP - 100) + "HP"+RESET);

                    }
                    else{
                        System.out.println(CYAN+"Motståndaren missade \nDu har fortfarande: " + spelareHP +"HP"+RESET);
                    } 
                    break;
                }
            }

    static void fem_HP_spelare(){
            
        Scanner tb = new Scanner(System.in);
        System.out.println(PURPLE+"Du har jävligt lågt HP, det är stor chans att du förlorar(sämst)"+RESET);
        System.out.println(PURPLE+"Vad väljer du: \n 1. Hela dig med 25HP \n 2. Gör 30DMG på din motståndare"+RESET);
        int HPval = tb.nextInt();

        if (HPval==1) {
            System.out.println(YELLOW+"Du hela dig med 25HP \n Du har nu: "+ (spelareHP=spelareHP+25)+"HP"+RESET);
        }
        else if (HPval==2) {
            System.out.println(RED+"Du gjorde 30DMG \n Din motståndare har nu: "+(motståndareHP=motståndareHP-30)+"HP"+RESET);
        }
        else{
            System.out.println(GREEN+"Detta val finns inte, försök igen"+RESET);
            fem_HP_spelare();
        }

    }
    
    static void fem_HP_motståndare(){
        double HPval=Math.floor(Math.random() * 1);

        if (HPval==0) {
            System.out.println(YELLOW+"Motståndaren hela sig med 25HP \nMotståndaren har nu: "+ (motståndareHP=motståndareHP+25)+"HP"+RESET);
        }
        else if (HPval==1) {
            System.out.println(RED+"Motståndaren gjorde 30DMG \nDu har nu: "+(spelareHP=spelareHP-30)+"HP"+RESET);
        }

    
    }
    
public static void main(String[] args) throws Exception {

        //start meny//
        Scanner tb = new Scanner(System.in);
        System.out.println(BLUE+"Meny \n 1. Starta \n 2. Avsluta"+RESET);
        int startval = tb.nextInt();

            while (startval!=3) {
                if (startval==1)
                {
                    System.out.println("Spelet startar...");
                    Thread.sleep(2000);
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

            Random rand = new Random(); 
            int motståndareTal = rand.nextInt(10); 
            System.out.println(BLUE+"Ni ska nu avgöra vem som ska börja"+RESET);
            System.out.println(BLUE+"Välj ett tal mellan 1-10"+RESET);
            int spelareTal = tb.nextInt();
            System.out.println(BLUE+"Du väljer: "+spelareTal+RESET);
            System.out.println(BLUE+"Motståndaren väljer: "+motståndareTal+RESET);
            Thread.sleep(1000);
        
            if (spelareTal>=motståndareTal) {
                System.out.println(PURPLE+"Ditt tal är större du börjar"+RESET);
                System.out.println(YELLOW+"\nInfo om attacker: \n Poke: 100% chans för träff, 5 DMG\n Punch: 80% chans för träff, 15 DMG\n Kick: 50% chans för träff, 25 DMG\n Stab: 20% chans för träff, 50 DMG\n Sword slash: 5% chans för träff, 100 DMG\n"+RESET); 
                Thread.sleep(2000);

                while ((spelareHP >=0) && (motståndareHP >=0)){
                    Thread.sleep(1500);
                    spelareAttack();
                    if(motståndareHP<=0){break;}
                    else if (motståndareHP<=5 && motståndareHP>0) {fem_HP_motståndare();}
                    Thread.sleep(1500);
                    motståndareAttack();
                    if (spelareHP<=5 && spelareHP>0) {fem_HP_spelare();}
                    }
                }
            
            else{

                while ((spelareHP >=0) && (motståndareHP >=0)){
                    Thread.sleep(2000);
                    motståndareAttack();
                    if(spelareHP<=0){break;}
                    else if (spelareHP<=5 && spelareHP>0) {fem_HP_spelare();}
                    Thread.sleep(1500);
                    spelareAttack();
                    if (motståndareHP<=5 && motståndareHP>0) {fem_HP_motståndare();}
                    }

                }

            if (spelareHP <0) {
                System.out.println(RED+"Rackarns, motståndaren vann... :("+RESET);

                }

            else{
                System.out.println(GREEN+"Yippe, du vann!"+RESET);

            }

            System.out.println("Vill du spela igen? (ja/nej)");
            String svar = tb.nextLine(); //denna gör så att spelaren hinner svara// Finns säkert bättre sätt men det här funkar bra//
            String startaOM = tb.nextLine();


            if (startaOM.equalsIgnoreCase("ja")) {
                System.out.println("Spelet startar om...");
                Thread.sleep(1000);
                HP_reset();
                main(args);
            }

            else if (startaOM.equalsIgnoreCase("nej")) {
                System.out.println("Spelet avslutas...");
                Thread.sleep(1000);
                System.exit(0);
            }

            else{
                System.out.println("Du valde ingen av dom idiot, jag bestämmer o du får ta o köra spelet igen");
                Thread.sleep(1000);
                main(args);
            }
        }
    }
             
         
    
    

    

