class NonAlphabeticCharacterException extends Exception {
    public NonAlphabeticCharacterException(String message) {
        super(message);
    }
}

// AlphabeticTotal class
class AlphabeticTotal {
    private int total;

    public AlphabeticTotal() {
        this.total = 0;
    }

    public void addCharacter(char ch) throws NonAlphabeticCharacterException {
        if (Character.isLetter(ch)) {
            total += Character.toLowerCase(ch) - 'a' + 1;
        } else {
            throw new NonAlphabeticCharacterException("Non-alphabetic character encountered: " + ch);
        }
    }

    public int getTotal() {
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            AlphabeticTotal alphabeticCounter = new AlphabeticTotal();
            alphabeticCounter.addCharacter('a');
            alphabeticCounter.addCharacter('b');
            alphabeticCounter.addCharacter('C'); // Throws an exception

            System.out.println("Total value of alphabetic characters: " + alphabeticCounter.getTotal());
        } catch (NonAlphabeticCharacterException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

