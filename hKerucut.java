package belajar.modul_iii;

import java.util.Scanner;

public class hKerucut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jari-jari Kerucut : ");
        double jariJari = input.nextDouble();
        
        System.out.print("Masukkan Tinggi Kerucut : ");
        double tinggi = input.nextDouble();
        
        double volume, luas;
        
        volume = (1.0 / 3) * Math.PI * Math.pow(jariJari, 2) * tinggi;
        luas = (Math.PI * Math.pow(jariJari, 2)) + (Math.PI * jariJari * tinggi);
        
        System.out.println("Volume Kerucut : "+volume);
        System.out.println("Luas Selimut kerucut : "+luas);
        
        input.close();
    }
}
