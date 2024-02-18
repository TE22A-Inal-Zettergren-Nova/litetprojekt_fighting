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
    

    //metod för när spelaren attackerar//
    static void spelareAttack(){
        Scanner tb = new Scanner(System.in);
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
 
        System.out.println(CYAN+"Välj din attack: \n 1. Poke \n 2. Punch \n 3. Kick \n 4. Stab \n 5. Sword slash\n"+CYAN);
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
    
    //metod för när datorn attackerar//
    static void motståndareAttack(){

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
 
        int motståndareVAL = rand.nextInt(4);

            switch (motståndareVAL) {
                case 0:
                    System.out.println("Motståndaren gjorde 5 skada");
                    System.out.println("Du har nu: " + (spelareHP= spelareHP -5) + "HP");
                    break;
                case 1:
                    if (träffA2 == 2) {
                        System.out.println("Motståndaren missade \nDu har fortfarande: " + spelareHP +"HP");
                    }
                    else{
                        System.out.println("Motståndaren gjorde 15 skada \nDu har nu: " + (spelareHP=spelareHP - 15) + "HP");
                     }
                    break;
                case 2:
                    if (träffA3 == 1) {
                        System.out.println("Motståndaren missade \nDu har fortfarande: " + spelareHP +"HP");
                    }   
                    else{
                        System.out.println("Motståndaren gjorde 25 skada \nDu har nu: " + (spelareHP=spelareHP- 25) + "HP");
                    } 
                    break;
                case 3:
                    if (träffA4 == 1) {
                        System.out.println("Motståndaren missade \nDu har fortfarande: " + spelareHP +"HP");
                    }
                    else{
                        System.out.println("Motståndaren gjorde 50 skada \nDu har nu: " + (spelareHP=spelareHP - 50) + "HP");
                    }
                    break;
                case 4:
                    if (träffA5 == 20) {
                        System.out.println("Motståndaren gjorde 100 skada \nDu har nu: " + (spelareHP=spelareHP - 100) + "HP");
                    }
                    else{
                        System.out.println("Motståndaren missade \nDu har fortfarande: " + spelareHP +"HP");
                    } 
                    break;
                }
            }

    static void fem_HP_spelare(){
            
        Scanner tb = new Scanner(System.in);
        System.out.println("Du har jävligt lågt HP, det är stor chans att du förlorar(sämst)");
        System.out.println("Vad väljer du: \n 1. Hela dig med 25HP \n 2. Gör 30DMG på din motståndare");
        int HPval = tb.nextInt();

        if (HPval==1) {
            System.out.println("Du hela dig med 25HP \n Du har nu: "+ (spelareHP=spelareHP+25)+"HP");
        }
        else if (HPval==2) {
            System.out.println("Du gjorde 30DMG \n Din motståndare har nu: "+(motståndareHP=motståndareHP-30)+"HP");
        }
        else{
            System.out.println("Detta val finns inte, försök igen");
            fem_HP_spelare();
        }

    }
    
    static void fem_HP_motståndare(){
        double HPval=Math.floor(Math.random() * 1);

        if (HPval==0) {
            System.out.println("Motståndaren hela sig med 25HP \nMotståndaren har nu: "+ (motståndareHP=motståndareHP+25)+"HP");
        }
        else if (HPval==1) {
            System.out.println("Motståndaren gjorde 30DMG \nDu har nu: "+(spelareHP=spelareHP-30)+"HP");
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
            System.out.println(GREEN+"Ni ska nu avgöra vem som ska BÖRJA"+RESET);
            System.out.println(GREEN+"Välj ett tal mellan 1-10"+RESET);
            int spelareTal = tb.nextInt();
            System.out.println(GREEN+"Du väljer: "+spelareTal+RESET);
            System.out.println(GREEN+"Motståndaren väljer: "+motståndareTal+RESET);
        
            if (spelareTal>=motståndareTal) {
                System.out.println("Ditt tal är större du börjar");
                Thread.sleep(2500);
                System.out.println(YELLOW+"\nInfo om attacker: \n Poke: 100% chans för träff, 5 DMG\n Punch: 80% chans för träff, 15 DMG\n Kick: 50% chans för träff, 25 DMG\n Stab: 20% chans för träff, 50 DMG\n Sword slash: 5% chans för träff, 100 DMG\n"+RESET); 
            
            
                while ((spelareHP >=0) && (motståndareHP >=0)){
                    Thread.sleep(2000);
                    spelareAttack();
                    if(motståndareHP<=0){break;}
                    else if (motståndareHP<=5 && motståndareHP>0) {fem_HP_motståndare();}
                    motståndareAttack();
                    if (spelareHP<=5 && spelareHP>0) {fem_HP_spelare();}
                    }}
            
  
            else{
                

                }

                if (spelareHP <0) {
                    System.out.println(RED+"Rackarns, motståndaren vann... :("+RESET);

                    }

                else{
                    System.out.println(GREEN+"Yippe, du vann!"+RESET);

                }


                    
                }
            }
             
         
    
    

    

