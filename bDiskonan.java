package belajar.modul_iii;

import java.util.Scanner;

public class bDiskonan {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Harga Barang  : ");
        double hargaBarang = input.nextDouble();
        
        System.out.print("Jumlah Barang : ");
        double jumlahBarang = input.nextDouble();
        
        double hargaSebelumDiskon = hargaBarang * jumlahBarang;
        double discount = hargaSebelumDiskon * 0.2;
        double hargaSetelahDiskon = hargaSebelumDiskon - discount;
        
        System.out.println("----------------------------");
        System.out.println("Harga Sebelum Discount : "+hargaSebelumDiskon);
        System.out.println("Discount 20%           : "+discount);
        System.out.println("Harga Setelah Discount : "+hargaSetelahDiskon);
        
        input.close();
    }
}