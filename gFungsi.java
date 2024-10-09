package belajar.modul_iii;

import java.util.Scanner;

public class gFungsi {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai X : ");
        double x = input.nextDouble();
        
        double f;
        f = 5 + (6 * x) + (8 * Math.pow(x, 2)) + (9 * Math.pow(x, 3)) + (5 * Math.pow(x, 4)); 
        
        System.out.println("f(x) = 5 + 6x + 8x^2 + 9x^3 + 5x^4");
        System.out.println("Nilai X adalah "+x);
        System.out.println("f("+x+") = 5 + 6 " +x+ " + 8 " +x+ "^2 + 9 "+x+"^3 + 5 "+x+"^4"); 
        System.out.println("Hasilnya : " +f);
        
        input.close();
    }
}
