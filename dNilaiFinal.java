package belajar.modul_iii;

import java.util.Scanner;

public class dNilaiFinal {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Ujian Sisipan 1      : ");
        double ujianSisipan1 = input.nextDouble();
        
        System.out.print("Masukkan Nilai Ujian Sisipan 2      : ");
        double ujianSisipan2 = input.nextDouble();
        
        System.out.print("Masukkan Nilai Ujian Akhir Semester : ");
        double ujianAkhirSemester = input.nextDouble();
        
        double nilaifinal = (0.3 * ujianSisipan1) + (0.3 * ujianSisipan2) + (0.49 * ujianAkhirSemester);
        
        System.out.println("Nilai Final adalah : "+nilaifinal);
        
        input.close();
    }
}
