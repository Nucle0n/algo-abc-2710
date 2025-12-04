package Exo_perso;

import java.util.Scanner;

public class Exo_yt2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrer le nom de l'étudiant
        System.out.print("Quel est votre nom ? ");
        String nom = sc.nextLine();

        // Demander 4 notes à l'utilisateur
        double note1, note2, note3, note4;
        System.out.print("Entrez la première note : ");
        note1 = sc.nextDouble();
        System.out.print("Entrez la deuxième note : ");
        note2 = sc.nextDouble();
        System.out.print("Entrez la troisième note : ");
        note3 = sc.nextDouble();
        System.out.print("Entrez la quatrième note : ");
        note4 = sc.nextDouble();

        // Calculer la moyenne
        double moyenne = (note1 + note2 + note3 + note4) / 4.0;

        // Déterminer la mention
        String mention = new String();
        if (moyenne > 18) {
        mention = " avec mention : Très Bien + félicitations du jury !";
        } else if (moyenne >= 16) {
        mention = " avec mention : Très Bien.";
        } else if (moyenne >= 14) {
        mention = " avec mention : Bien.";
        } else if (moyenne >= 12) {
        mention = " avec mention : Assez Bien.";
        } else {
        mention = "";
        }

        System.out.println("Bonjour " + nom + " !");
        System.out.println("Votre moyenne est de : " + moyenne);
        if (moyenne >= 10) {
            System.out.println("Félicitations, vous êtes admis" + mention);
        } else {
            System.out.println("Désolé, vous n'êtes pas admissible.");

        }

        sc.close();

    }
}
