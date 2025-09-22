import java.util.Scanner;

public class rizki_pertemuan3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean ipkValid = true;

        while(ipkValid) {  // !not 
            // butuh variabel, untuk nampung berapa banyak data ipk yang diinput
            int banyak;
            System.out.print("Masukkan Banyak Data IPK = ");
            banyak = s.nextInt();
            // Deklarasikan array ipk
            float[] ipk = new float[banyak];
            // Input ipk
            for(int i = 0; i < banyak; i++) {
                // latihan validasi input IPK kurang dari nol atau 
               // lebih dari 4.00 maka diminta isi ulang data ipk
                do {
                    System.out.print("Masukkan IPK ke-" + (i + 1) + " = ");
                    ipk[i] = s.nextFloat();
                    if(ipk[i] < 0 || ipk[i] > 4.00) {
                        System.out.println("IPK tidak valid - ulang input IPK");
                    }
                } while(ipk[i] < 0 || ipk[i] > 4.00);
            }

            // tampilkan isi array ipk : ipk[0] + ipk[1] + ... = total 3.0 + 2.1 + 2.0 = 7.1
            System.out.println("\nData IPK yang diinput:");
            float total = 0;
            for(int i = 0; i < banyak; i++) {
                System.out.print("IPK ke-" + (i + 1) + " = " + ipk[i]);
                total += ipk[i];
                if(i < banyak - 1) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" = " + total);
                }
            }
            System.out.println("\nTotal IPK = " + total);

            // tampilkan ipk terbesar, ipk terkecil, rata rata ipk
            float ipkTerbesar = ipk[0];
            float ipkTerkecil = ipk[0];
            float rataRata = total / banyak;
            
            // Cari IPK terbesar dan terkecil
            for(int i = 1; i < banyak; i++) {
                if(ipk[i] > ipkTerbesar) {
                    ipkTerbesar = ipk[i];
                }
                if(ipk[i] < ipkTerkecil) {
                    ipkTerkecil = ipk[i];
                }
            }
            
            System.out.println("\nStatistik IPK:");
            System.out.println("IPK Terbesar = " + ipkTerbesar);
            System.out.println("IPK Terkecil = " + ipkTerkecil);
            System.out.println("Rata-rata IPK = " + rataRata);
            
            // Tanya apakah ingin mengulang program
            System.out.print("\nApakah Anda ingin mengulang program (Y/T)? ");
            String jawaban = s.next();
            if(!jawaban.equalsIgnoreCase("Y")) {
                ipkValid = false;
                System.out.println("Program selesai");
            }
        }
        s.close();
    }
}
