import Esercizio1.Esercizio1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
    Esercizio1 esercizio1 = new Esercizio1();
    esercizio1.riempiArrayConNumeriCasuali();

        if(esercizio1 != null)
        {System.out.println(esercizio1);}
        else{logger.warn("Il tuo Array sembra essere NULL");}

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 10");
        int primoNumeroInserito = scanner.nextInt();
        if (primoNumeroInserito == 0){
            logger.info("GIOCO FINITO");
            scanner.close();
        }else{
            System.out.println("Inserisci un numero da 0 a 9 per posizionare il nuovo numero");
            int secondoNumeroInserito = scanner.nextInt();
            esercizio1.inserisciNumeroInArray(primoNumeroInserito, secondoNumeroInserito);
            System.out.println(esercizio1);

        }


    }

}