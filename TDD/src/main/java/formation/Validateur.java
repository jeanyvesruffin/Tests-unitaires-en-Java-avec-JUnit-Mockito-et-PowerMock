package formation;

public class Validateur {

    public void validerAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("l age ne peut pas etre negatif");
        }

    }

}
