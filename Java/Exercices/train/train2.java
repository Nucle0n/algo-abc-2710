package train;

import java.util.Scanner;  

public class train2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean a, b, c;
        boolean result;

        System.out.print("Entrez la valeur de a (true/false) : ");    
        a = sc.nextBoolean();
        System.out.print("Entrez la valeur de b (true/false) : ");
        b = sc.nextBoolean();
        System.out.print("Entrez la valeur de c (true/false) : ");
        c = sc.nextBoolean();
        result = a || b && !c;

        System.out.println("Etat en sortie = " + result);
        
        sc.close();
    }
    }

