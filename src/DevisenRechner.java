import java.util.Scanner;
public class DevisenRechner {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        final float EUR = 1.0f;
        final float USD = 1.3364f;
        final float CHF = 1.2131f;
        final float GBP = 0.8013f;

        System.out.println("Bitte geben Sie den Betrag in Euro ein: ");
        float euroInput;
        euroInput = scanner.nextFloat();
        System.out.println("Bitte geben Sie die gewünschte Währung ein: ");
        String currencyInput;
        currencyInput = scanner.next();
        if ((euroInput > 0) && (euroInput < 1000)) {
            switch (currencyInput) {
                case "USD":
                    ausgabe(euroInput, USD, currencyInput);
                    break;
                case "CHF":
                    ausgabe(euroInput, CHF, currencyInput);
                    break;
                case "GBP":
                    ausgabe(euroInput, GBP, currencyInput);
                    break;
                default:
                    System.out.println("Eingabefehler");
                    break;
            }
        }
        else {
            System.out.println("Eingabefehler");
            scanner.close();
        } scanner.close();
    }
    public static void ausgabe (float euroInput, float currency, String currencyInput) {
        float wertInAndererCurrency = euroInput * currency;
        System.out.println(wertInAndererCurrency + " " + currencyInput);
    }
}
