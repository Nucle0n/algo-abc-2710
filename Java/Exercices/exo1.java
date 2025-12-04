/* EXO1 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 * 
 * 
*/



import java.util.Scanner;

    public class exo1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a , b , resultat;

            a = sc.nextInt();
            System.out.print("Entrez une valeur pour a");
            b = sc.nextInt();
            System.out.print("Entrez une valeur pour b");

            resultat = a + b;
            System.out.println("a + b = " + resultat);

            sc.close();

        }
    }