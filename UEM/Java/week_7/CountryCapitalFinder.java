public class CountryCapitalFinder {
    private static final String[][] countryCapitalPairs = {
        {"Afghanistan", "Kabul"},
        {"Albania", "Tirana"},
        {"Algeria", "Algiers"},
        // Add more country-capital pairs as needed
    };

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CountryCapitalFinder <country>");
            return;
        }

        String country = args[0];
        try {
            String capital = findCapital(country);
            System.out.println("Capital of " + country + ": " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println("NoMatchFoundException: " + e.getMessage());
        }
    }

    public static String findCapital(String country) throws NoMatchFoundException {
        for (String[] pair : countryCapitalPairs) {
            if (pair[0].equalsIgnoreCase(country)) {
                return pair[1];
            }
        }
        throw new NoMatchFoundException("No capital found for the country: " + country);
    }
}

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}
