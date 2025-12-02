package message;

import java.util.Scanner;

public class message {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String VotreNom;

        System.out.println("Entrez votre nom : ");
        VotreNom = sc.nextLine();
        System.out.println("Bonjour, " + VotreNom + "!");

        sc.close();
}
    
}
