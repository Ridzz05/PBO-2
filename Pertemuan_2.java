package rizki_pertemuan2;
import java.util.Scanner;
import java.time.LocalDate;

public class rizki_pertemuan2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nama, npm;
        float ipk;
        int tahunLahir;
        char kodeJenis;

        // input    
        System.out.print("Masukkan Nama = ");
        nama = s.nextLine(); 
        System.out.print("Masukkan NPM " + nama + " = ");
        npm = s.next();
        System.out.print("Masukkan IPK " + nama + " = ");
        ipk = s.nextFloat();
        System.out.print("Masukkan Tahun Lahir " + nama + " = ");

        tahunLahir = s.nextInt();
        System.out.print("Masukkan Kode Jenis (P/L) = ");
        kodeJenis = s.next().charAt(0);
        String status;
        System.out.println("Masukkan status mahasiswa (Aktif/Tidak Aktif)");
        status = s.next();
        if(status.equals("Aktif")) {
            status = "Aktif";
        } else {
            status = "Tidak Aktif";
        }
        // tampilkan informasi
        System.out.println("Nama = " + nama);
        System.out.println("NPM = " + npm);
        System.out.println("IPK = " + ipk);
        System.out.println("Status Mahasiswa = " + status);
        // Cek ketika input tahun lahir apkaah sesuai atau tidak
        // Inisialisasi 
        tahunLahir = 0;
        boolean validTahunLahir = false;
        while (!validTahunLahir) {
            try {
                System.out.print("Masukkan Tahun Lahir");
                tahunLahir = s.nextInt();
                validTahunLahir = true;
            } catch (Exception e) {
                System.out.println("Periksa kembali tahun lahir!");
                s.next();
            }
        }
        System.out.println("Tahun Lahir = " + tahunLahir);
        System.out.println("Kode Jenis = " + kodeJenis);

        String jenis;
        if(kodeJenis == 'P' || kodeJenis == 'p') {
            jenis = "Perempuan";
        } else if(kodeJenis == 'L' || kodeJenis == 'l') {
            jenis = "Laki - Laki";
        } else {
            jenis = "Tidak diinformasikan";
        }
        
        System.out.println("Jenis Kelamin = " + jenis);
        
        int umur = (LocalDate.now().getYear()) - tahunLahir;
        System.out.println("Umur = " + umur);

        // Menampilkan tahunMasuk, tahunLulus, kodeProdi, prodi, nomorUrut
        // Misalnya NPM = 2428240069
        int tahunMasuk = Integer.parseInt("20" + npm.substring(0, 2));
        int tahunLulus = Integer.parseInt("20" + npm.substring(2, 4));
        String kodeProdi = npm.substring(4, 6);
        String prodi;
        if(kodeProdi.equals("24")) {
            prodi = "Sistem Informasi";     
        } else if(kodeProdi.equals("25")) {
            prodi = "Informatika";
        } else if(kodeProdi.equals("27")) {
            prodi = "Teknik Elektro";
        } else {
            prodi = "Program Studi Tidak Diketahui";
        }
        int nomorUrut = Integer.parseInt(npm.substring(6));
        System.out.println("Tahun Masuk = " + tahunMasuk);
        System.out.println("Tahun Lulus = " + tahunLulus);
        System.out.println("Kode Prodi = " + kodeProdi);
        System.out.println("Program Studi = " + prodi);
        System.out.println("Nomor Urut = " + nomorUrut);
        System.out.println("Status Mahasiswa = " + status);
        if(status.equals("Aktif")) {
            System.out.println("Status Mahasiswa = Aktif");
        } else {
            System.out.println("Status Mahasiswa = Tidak Aktif");
        }
    }
}
