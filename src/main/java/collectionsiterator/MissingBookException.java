package collectionsiterator;

public class MissingBookException extends RuntimeException {
    public MissingBookException(String message) {
        super(message);
    }
}


//Mindhárom metódus saját MissingBookException-t (RuntimeException) dob,
//ha a regisztrációs számnak megfelelő könyv nem található,
//vagy adott szerzővel nem található könyv.

