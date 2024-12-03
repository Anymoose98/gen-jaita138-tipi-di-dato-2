import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws Exception {

        // Richiamo lo scanner
        Scanner sc = new Scanner(System.in);

        // Chiedo informazioni
        System.out.println("Creiamo il nostro cliente ideale");

        System.out.println("Come si chiama?");
        String nome = sc.nextLine();

        System.out.println("Qual'è il cognome?");
        String cognome = sc.nextLine();

        // Data di nascita
        System.out.println("Quando è nato? (Formato:dd/MM/yyyy)");
        String input = sc.nextLine();
        // Converte la stringa in LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascita = LocalDate.parse(input, formatter);

        
        System.out.println("Numero telefono?");
        String nTelefono = sc.nextLine();

        
        System.out.println("Qualche nota?");
        String note = sc.nextLine();

        
        System.out.println("La sua email qual'è?");
        String email = sc.nextLine();

        
        System.out.println("Password?");
        String password = sc.nextLine();

        
        System.out.println("Username?");
        String username = sc.nextLine();

        
        // Data e orario di iscrizione
        System.out.println("Quando si è iscritto? (Formato: dd/MM/yyyy HH:mm)");
        String inputDataIscrizione = sc.nextLine();
        // Converto in data + orario
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataIscrizione = LocalDateTime.parse(inputDataIscrizione, dateTimeFormatter);

        System.out.println("--------------------------------------------");

        // Espongo i risultati
        System.out.println("Si chiama " + nome + cognome);
        System.out.println("è nato il " + dataNascita);
        System.out.println("Il suo numero è: " + nTelefono);
        System.out.println("Sappiamo di lui: " + note);
        System.out.println("La sua email è: " + email);
        System.out.println("La sua password è: " + password);
        System.out.println("Il suo username è: " + username);
        System.out.println("Si è iscritto il " + dataIscrizione);
    }
}
