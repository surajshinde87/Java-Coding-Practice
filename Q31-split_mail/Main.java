import java.util.stream.Collectors;

// split the mail to words and numbers and domain name 

public class Main {
    public static void main(String[] args) {
        String email = "surajshinde8767@gmail.com";

      
        String[] parts = email.split("@");
   
        String username = parts[0];
        String domain = parts[1]; 

     
        String letters = username.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isLetter)
                .map(String::valueOf)
                .collect(Collectors.joining());

        String numbers = username.chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isDigit)
                .map(String::valueOf)
                .collect(Collectors.joining());

    
         String[] domainParts = domain.split("\\.");
        String domainName = domainParts[0]; 
        String extension = domainParts.length > 1 ? domainParts[1] : ""; 

        System.out.println("Original Email: " + email);
        System.out.println("Username: " + username);
        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Domain Name: " + domainName);
        System.out.println("Extension: " + extension);
    }
}
