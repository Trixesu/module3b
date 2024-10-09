package belajar.modul_iii;

import java.util.Scanner;

public class jFungsiDitribusi {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        
        System.out.print("x = ");
        double x = input.nextDouble();
        
        System.out.print("u = ");
        double u = input.nextDouble();
        
        System.out.print("o = ");
        double o = input.nextDouble();
        
        double a, b, c, fx;
        
        a = 1 / (o * Math.sqrt(2 * Math.PI));
        b = -0.5;
        c = (x-u) / o;
        fx = a * Math.pow(Math.E, (b *Math.pow(c, 2)));
        
        System.out.println("f(x) : "+fx);
        
        input.close();
    }
}
