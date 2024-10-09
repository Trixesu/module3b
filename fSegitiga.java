package belajar.modul_iii;

import java.util.Scanner;

public class fSegitiga {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
                
        System.out.print("x1 : ");
        double x1 = input.nextDouble();
        
        System.out.print("y1 : ");
        double y1 = input.nextDouble();
        
        System.out.print("x2 : ");
        double x2 = input.nextDouble();
        
        System.out.print("y2 : ");
        double y2 = input.nextDouble();
        
        System.out.print("x3 : ");
        double x3 = input.nextDouble();
        
        System.out.print("y3 : ");
        double y3 = input.nextDouble();        
        
        System.out.println("");
        
        double jarakA, jarakB, jarakC;
        jarakA = Math.sqrt(Math.pow (x1-x2, 2) + Math.pow (y1-y2, 2));
        jarakB = Math.sqrt(Math.pow (x1-x3, 2) + Math.pow (y1-y3, 2));
        jarakC = Math.sqrt(Math.pow (x2-x3, 2) + Math.pow (y2-y3, 2));
        
        System.out.println("Titik A : "+x1+", "+y1);
        System.out.println("Titik B : "+x2+", "+y2);
        System.out.println("Titik C : "+x3+", "+y3);
        System.out.println("");
        System.out.println("Jarak titik A ke B : "+jarakA);
        System.out.println("Jarak titik A ke C : "+jarakB);
        System.out.println("Jarak titik B ke C : "+jarakC);
        
        System.out.println("");
        
        double keliling, s, luas;
        
        keliling = jarakA + jarakB + jarakC;
        s = keliling / 2;
        luas = Math.sqrt(s * ((s - jarakA) * (s - jarakB) * (s - jarakC)));
        
        System.out.println("Keliling Segitiga adalah : "+keliling);
        System.out.println("Setengah Keliling Segitiga adalah : "+s);
        System.out.println("Luas Segitiga adalah : "+luas);
        
        input.close();
    }
}