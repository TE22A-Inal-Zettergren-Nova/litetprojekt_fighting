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
        
          
        }
    }

    

