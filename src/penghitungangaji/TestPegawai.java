package penghitungangaji;

import java.util.Scanner;

public class TestPegawai {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        Pegawai p2 = new Pegawai();

        Scanner iNAMA = new Scanner(System.in);
        Scanner iNIP = new Scanner(System.in);
        Scanner iJML = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        int pil = 0;
        while (pil != 4) {
            System.out.println("=================================");
            System.out.println("SISTEM PENGINPUTAN DATA PEGAWAI");
            System.out.println("=================================");
            System.out.println(
                    " 1. Tambah Data Pegawai\n 2. Tambah Data Pegawai + Jam Kerja\n 3. Tambah Lama Jam Kerja\n 4. Keluar");
            System.out.println("=================================");
            switch (pil) {
                case 1:
                    System.out.println("Masukkan Data Pegawai");
                    System.out.print("NIP: ");
                    String nip1 = iNIP.nextLine();
                    System.out.print("Nama: ");
                    String nama1 = iNAMA.nextLine();

                    p1 = new Pegawai(nama1, nip1);
                    break;
                case 2:
                    System.out.println("Masukkan Data Pegawai");
                    System.out.print("NIP: ");
                    String nip2 = iNIP.nextLine();
                    System.out.print("Nama: ");
                    String nama2 = iNAMA.nextLine();
                    System.out.print("Jumlah Jam Kerja: ");
                    int jumlah2 = iJML.nextInt();
                    p2 = new Pegawai(nama2, nip2, jumlah2);
                    p2.hitungGajiHarian();
                    p2.cetakPenghasilan();
                    break;
                case 3:
                    System.out.print("Jumlah Jam Kerja: ");
                    int jumlah1 = iJML.nextInt();
                    p1.setJamKerja(jumlah1);
                    p1.hitungGajiHarian();
                    p1.cetakPenghasilan();
                    break;
                case 4:
                    System.out.println("Sistem Telah Berakhir");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Sesuai");
            }
        }
    }
}
