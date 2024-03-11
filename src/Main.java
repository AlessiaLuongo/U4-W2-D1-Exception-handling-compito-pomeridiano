import Esercizio1.Esercizio1;
import Esercizio2.Esercizio2;
import exceptions.NumberLessThenZero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

//ESERCIZIO 1

/*  Esercizio1 esercizio1 = new Esercizio1();
    esercizio1.riempiArrayConNumeriCasuali();

        if(esercizio1 != null)
        {System.out.println(esercizio1);}
        else{logger.warn("Il tuo Array sembra essere NULL");}


        System.out.println("Inserisci un numero da 1 a 10");
        int primoNumeroInserito = scanner.nextInt();
        if (primoNumeroInserito == 0){
            logger.info("GIOCO FINITO");
            scanner.close();
        }else{
            System.out.println("Inserisci un numero da 1 a 5 per posizionare il nuovo numero");
            int secondoNumeroInserito = scanner.nextInt();
            esercizio1.inserisciNumeroInArray(primoNumeroInserito, secondoNumeroInserito);
            System.out.println(esercizio1);

        }
*/

//ESERCIZIO 2
        Esercizio2 esercizio2 = new Esercizio2();
        try {
            System.out.println("Inserisci i km percorsi:");
            int chilometraggio = scanner.nextInt();

            if (chilometraggio < 0) {
                throw new IllegalArgumentException("Il chilometraggio non può essere inferiore a 0");
            }

            System.out.println("Inserisci i litri di benzina:");
            int litriDiBenzina = scanner.nextInt();

            esercizio2.kmPercorsi = esercizio2.quantiKmPercorsi(chilometraggio, litriDiBenzina);
            System.out.println(esercizio2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}