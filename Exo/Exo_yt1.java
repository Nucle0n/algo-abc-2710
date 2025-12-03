package Exo;

import java.util.Scanner;

public class Exo_yt1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

    // Demande à l'utilisateur d'entrer son nom et lui affiche un message de bienvenue
        System.out.print("Quel est votre nom ? ");
        String nom = sc.nextLine();
        System.out.println("Bonjour " + nom + " !");

    // Convertisseur Km vers Miles
        System.out.print("Entrez une distance en kilomètres : ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilomètres équivalent à " + miles + " miles.");

    // Convertisseur Celsius vers Fahrenheit
        System.out.print("Entrez une température en degrés Celsius : ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");

    // Convertisseur Kg vers Livres
        System.out.print("Entrez un poids en kilogrammes : ");
        double kg = sc.nextDouble();
        double livres = kg * 2.20462;
        System.out.println(kg + " kilogrammes équivalent à " + livres + " livres.");
        
        sc.close(); 
        
    }
    
}
