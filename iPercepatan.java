package belajar.modul_iii;

import java.util.Scanner;

public class iPercepatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Kecepatan Awal : ");
        double V0 = input.nextDouble();
        
        System.out.print("Masukkan Percepatan : ");
        double a = input.nextDouble();
        
        System.out.print("Masukkan Waktu : ");
        double t = input.nextDouble();
        
        double Vt, St;
        Vt = V0 + a * t;
        St = V0 * t + (1.0 / 2) * a * Math.pow(t, 2);
        
        System.out.println("Kecepatan dalam waktu " +t+ " adalah "+Vt);
        System.out.println("Jarak yang ditempuh dalam waktu " +t+ " adalah "+St);
        
        input.close();
    }
}
