package Esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    int[] arrayDiCinqueInteri = new int[5];
    Random randomNumber = new Random();

    public void riempiArrayConNumeriCasuali() {
        for (int i = 0; i < arrayDiCinqueInteri.length; i++) {
            arrayDiCinqueInteri[i] = randomNumber.nextInt(10) + 1;
        }
    }

    public void inserisciNumeroInArray(int primoNumero, int secondoNumero) {
        if (secondoNumero >= 0 && secondoNumero < arrayDiCinqueInteri.length) {
            arrayDiCinqueInteri[secondoNumero] = primoNumero;
        }
    }

    @Override
    public String toString() {
        return "Esercizio1{" +
                "arrayDiCinqueInteri=" + Arrays.toString(arrayDiCinqueInteri) +
                '}';
    }

}
