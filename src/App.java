import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Richiamo lo scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Creiamo il nostro piatto");

        // Chiedo le informazioni che mi servono
        System.out.println("Qual'è il nome del piatto?");
        String nome = sc.nextLine();

        System.out.println("Una breve descrizione");
        String descrizione = sc.nextLine();

        System.out.println("Qual'è il prezzo?");
        double prezzo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Il piatto è disponibile?");
        boolean disponibile = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Che tipologia è?");
        String tipologia = sc.nextLine();

        System.out.println("Allergeni");
        String allergeni = sc.nextLine();

        System.out.println("Una foto");
        String foto = sc.nextLine();

        System.out.println("Quante calorie ha ogni 100g?");
        int calorie = sc.nextInt();
        sc.nextLine();

        System.out.println("Che tipo di variazioni ci sono?");
        String variazioni = sc.nextLine();

        System.out.println("-----------------------------------------");

        System.out.println("Ecco il risultato:");

        System.out.println("Il piatto si chiama " + nome);
        System.out.println("è descritto come " + descrizione);
        System.out.println("Costa " + prezzo + "Euro");
        System.out.println("è disponibile:" + disponibile);
        System.out.println("Appartiene alla tipologia" + tipologia);
        System.out.println("A questi allergeni: " + allergeni);
        System.out.println("La foto: " + foto);
        System.out.println("Ha " + calorie + "Kcal");
        System.out.println("Ha queste variazioni: " + variazioni);

    }
}
