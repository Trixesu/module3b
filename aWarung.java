package belajar.modul_iii;

import java.util.Scanner;

public class aWarung {
    public static void main(String[] args) {
        
        int hargaMakan, hargaLauk, hargaMinum, totalHarga;
        
        hargaMakan = 8000;
        hargaLauk  = 3000;
        hargaMinum = 2000;
        
        System.out.println("Harga Makan = "+hargaMakan);
        System.out.println("Harga Lauk  = "+hargaLauk);
        System.out.println("Harga Minum = "+hargaMinum);
        System.out.println("----------------------------");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Makan    : ");
        int jumlahMakan = input.nextInt();
        
        System.out.print("Masukkan Jumlah Lauk     : ");
        int jumlahLauk = input.nextInt();
        
        System.out.print("Masukkan Jumlah Minum    : ");
        int jumlahMinum = input.nextInt(); 
        
        totalHarga = (hargaMakan * jumlahMakan) + (hargaLauk * jumlahLauk) + (hargaMinum * jumlahMinum);
        
        System.out.println("Total harga yang dibayar : "+totalHarga);
        
        input.close();
    }
}