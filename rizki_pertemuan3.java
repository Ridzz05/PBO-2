import java.util.Scanner;

public class rizki_pertemuan3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean ulang = true;
        
        while(ulang) {
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
            
            // Tampilkan isi array ipk
            System.out.println("\nData IPK yang diinput:");
            for(int i = 0; i < banyak; i++) {
                System.out.println("IPK ke-" + (i + 1) + " = " + ipk[i]);
            }
            
            // Tanya apakah ingin mengulang program
            System.out.print("\nApakah Anda ingin mengulang program (Y/T)? ");
            String jawaban = s.next();
            if(!jawaban.equalsIgnoreCase("Y")) {
                ulang = false;
                System.out.println("Program selesai");
            }
        }
        s.close();
    }
}
