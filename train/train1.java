package train;

import java.util.Scanner;

public class train1
{
    public static void main(String[] args) {
        float a , b , c ;
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Entrez a : ") ;
        a = sc.nextFloat() ; 
        System.out.print("Entrez b : ") ;
        b = sc.nextFloat() ;
        System.out.print("Entrez c : ") ;
        c = sc.nextFloat() ;
        float result = (a * b) / c ;
        System.out.println("Le résultat est : " + result);
        sc.close();
                
    }
}