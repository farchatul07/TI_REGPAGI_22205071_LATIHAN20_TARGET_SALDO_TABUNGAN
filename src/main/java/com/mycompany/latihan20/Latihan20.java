/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan20;
import java.util.Scanner;
/**
 *
 * @author user
 Nama: Farchatul Hudayah
 Nim: 22205071
 Prodi: Teknik Informatika
 */
public class Latihan20 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input saldo awal, bunga per bulan, dan saldo target
        System.out.print("Saldo awal: Rp. ");
        double saldoAwal = input.nextDouble();
        System.out.print("Bunga/bulan (%): ");
        double bungaPerBulan = input.nextDouble() / 100; // Konversi persentase ke desimal
        System.out.print("Saldo target: Rp. ");
        double saldoTarget = input.nextDouble();


        int bulan = 0;

        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * bungaPerBulan;
            bulan++;
        }

        System.out.println("Dalam " + bulan + " bulan, saldo Anda akan mencapai atau melebihi Rp. " + saldoTarget);
        }
    }
