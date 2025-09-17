    package rizki_pertemuan2;
    import java.util.Scanner;
    import java.time.LocalDate;

    public class rizki_pertemuan2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ulang = "Y";
        
        while(ulang.equalsIgnoreCase("Y")) {
            String nama, npm, status;
            float ipk;
            int tahunLahir;
            char kodeJenis;

            // Input data mahasiswa
            System.out.print("Masukkan Nama = ");
            nama = s.nextLine(); 
            System.out.print("Masukkan NPM " + nama + " = ");
            npm = s.next();
            
            // Input IPK dengan validasi
            ipk = 0.0f; // Initialize ipk
            boolean validIPK = false;
            while (!validIPK) {
                try {
                    System.out.print("Masukkan IPK " + nama + " = ");
                    ipk = s.nextFloat();
                    if (ipk > 4.0) {
                        System.out.println("IPK tidak valid - ulang input IPK");
                    } else {
                        validIPK = true;
                    }
                } catch (Exception e) {
                    System.out.println("Input IPK tidak valid!");
                    s.next();
                }
            }
            
            // Input tahun lahir dengan validasi
            tahunLahir = 0;
            boolean validTahunLahir = false;
            while (!validTahunLahir) {
                try {
                    System.out.print("Masukkan Tahun Lahir " + nama + " = ");
                    tahunLahir = s.nextInt();
                    validTahunLahir = true;
                } catch (Exception e) {
                    System.out.println("Periksa kembali tahun lahir!");
                    s.next();
                }
            }
            
            System.out.print("Masukkan Kode Jenis (P/L) = ");
            kodeJenis = s.next().charAt(0);
            
            System.out.print("Masukkan status mahasiswa (Aktif/Tidak Aktif) = ");
            status = s.next();
            
            // Tampilkan informasi berdasarkan status
            if(status.equalsIgnoreCase("Aktif")) {
                // Menampilkan semua data mahasiswa
                System.out.println("\nDATA MAHASISWA");
                System.out.println("Nama = " + nama);
                System.out.println("NPM = " + npm);
                System.out.println("IPK = " + ipk);
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
                
                // Menampilkan predikat kelulusan berdasarkan IPK
                String predikat;
                if(ipk < 2.50) {
                    predikat = "Belum Lulus";
                } else if(ipk >= 2.50 && ipk <= 2.75) {
                    predikat = "Lulus";
                } else if(ipk >= 2.76 && ipk <= 3.00) {
                    predikat = "Memuaskan";
                } else if(ipk >= 3.01 && ipk <= 3.50) {
                    predikat = "Sangat Memuaskan";
                } else if(ipk >= 3.51 && ipk <= 4.00) {
                    predikat = "Dengan Pujian";
                } else {
                    predikat = "Tidak valid";
                }
                System.out.println("Predikat Kelulusan = " + predikat);
                
            } else {
                System.out.println("Mahasiswa Tidak Aktif, Data Tidak Bisa Ditampilkan");
            }
            
            // Tanya apakah ingin mengulang program
            System.out.print("\nApakah Anda ingin mengulang program (Y/T)? ");
            ulang = s.next();
            s.nextLine(); // consume newline
        }
    }
    }
