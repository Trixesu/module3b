package belajar.modul_iii;

import java.util.Scanner;

public class cRerataSD {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nilai Tugas 1 : ");
        int nilaiTugas1 = input.nextInt();
        
        System.out.print("Nilai Tugas 2 : ");
        int nilaiTugas2 = input.nextInt();
        
        System.out.print("Nilai Tugas 3 : ");
        int nilaiTugas3 = input.nextInt();
        
        int ratarata = (nilaiTugas1 + nilaiTugas2 + nilaiTugas3) / 3;
        
        System.out.println("-------------------");
        System.out.println("Nilai Rata-Rata : "+ratarata); 
        
        input.close();  
    }
}
