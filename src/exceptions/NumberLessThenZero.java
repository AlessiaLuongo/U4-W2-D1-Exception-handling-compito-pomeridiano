package exceptions;

public class NumberLessThenZero extends RuntimeException {
        public NumberLessThenZero(int wrongNumber){
            super("Il numero " + wrongNumber + " è ZERO");
        }
}
