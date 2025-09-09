/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistem_manajemen_daftar_pulau_di_indonesia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> pulau = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            
            // Data awal
            pulau.add("Sumatra");
            pulau.add("Jawa");
            pulau.add("Kalimantan");
            pulau.add("Sulawesi");
            pulau.add("Papua");
            
            do {
                System.out.println("\n===== MENU DAFTAR PULAU INDONESIA =====");
                System.out.println("1. Tambah Pulau");
                System.out.println("2. Lihat Daftar Pulau");
                System.out.println("3. Ubah Nama Pulau");
                System.out.println("4. Hapus Pulau");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();
                input.nextLine(); // buang enter
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan nama pulau: ");
                        String tambah = input.nextLine();
                        pulau.add(tambah);
                        System.out.println("Pulau berhasil ditambahkan!");
                    }
                    
                    case 2 -> {
                        if (pulau.isEmpty()) {
                            System.out.println("Belum ada data pulau.");
                        } else {
                            System.out.println("\nDaftar Pulau di Indonesia:");
                            for (int i = 0; i < pulau.size(); i++) {
                                System.out.println((i+1) + ". " + pulau.get(i));
                            }
                        }
                    }
                    
                    case 3 -> {
                        if (pulau.isEmpty()) {
                            System.out.println("Belum ada data untuk diubah.");
                        } else {
                            System.out.println("Pilih nomor pulau yang ingin diubah:");
                            for (int i = 0; i < pulau.size(); i++) {
                                System.out.println((i+1) + ". " + pulau.get(i));
                            }
                            System.out.print("Nomor: ");
                            int ubahIndex = input.nextInt() - 1;
                            input.nextLine();
                            if (ubahIndex >= 0 && ubahIndex < pulau.size()) {
                                System.out.print("Masukkan nama baru: ");
                                String baru = input.nextLine();
                                pulau.set(ubahIndex, baru);
                                System.out.println("Pulau berhasil diubah!");
                            } else {
                                System.out.println("Nomor tidak valid!");
                            }
                        }
                    }
                    
                    case 4 -> {
                        if (pulau.isEmpty()) {
                            System.out.println("Belum ada data untuk dihapus.");
                        } else {
                            System.out.println("Pilih nomor pulau yang ingin dihapus:");
                            for (int i = 0; i < pulau.size(); i++) {
                                System.out.println((i+1) + ". " + pulau.get(i));
                            }
                            System.out.print("Nomor: ");
                            int hapusIndex = input.nextInt() - 1;
                            input.nextLine();
                            if (hapusIndex >= 0 && hapusIndex < pulau.size()) {
                                pulau.remove(hapusIndex);
                                System.out.println("Pulau berhasil dihapus!");
                            } else {
                                System.out.println("Nomor tidak valid!");
                            }
                        }
                    }
                    
                    case 5 -> System.out.println("Terima kasih, program selesai.");
                    
                    default -> System.out.println("Pilihan tidak valid, coba lagi.");
                }
            } while (pilihan != 5);
        }
    }
}
