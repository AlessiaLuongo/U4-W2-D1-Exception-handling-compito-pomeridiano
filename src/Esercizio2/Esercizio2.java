package Esercizio2;

public class Esercizio2 {

   public int kmPercorsi;

    public Esercizio2() {
        kmPercorsi = 0;
    }

    public int quantiKmPercorsi(int chilometraggio, int litriDiBenzina) {
        return chilometraggio/litriDiBenzina;
    }

    @Override
    public String toString() {
        return "Esercizio2{" +
                "kmPercorsi=" + kmPercorsi +
                '}';
    }


}
