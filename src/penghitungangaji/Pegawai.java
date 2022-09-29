package penghitungangaji;

public class Pegawai {
    private String nama;
    private String nip;
    private double gajiPokok;
    private double lembur;
    private double uangMakan;
    private double transport;
    private int jlhJamKerja;

    Pegawai() {

    }

    Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    Pegawai(String nama, String nip, int jlhJamKerja) {
        this.nama = nama;
        this.nip = nip;
        this.jlhJamKerja = jlhJamKerja;
    }

    public void setJamKerja(int jlhJamKerja) {
        this.jlhJamKerja = jlhJamKerja;
    }

    public void hitungGajiHarian() {
        this.gajiPokok = 2000 * jlhJamKerja;
        if (jlhJamKerja == 7) {
            this.lembur = 1.5 * gajiPokok;
            this.uangMakan = 0;
            this.transport = 0;
        } else if (jlhJamKerja == 8) {
            this.lembur = 1.5 * gajiPokok;
            this.uangMakan = 3500;
            this.transport = 0;
        } else if (jlhJamKerja >= 9) {
            this.lembur = 1.5 * gajiPokok;
            this.uangMakan = 3500;
            this.transport = 4000;
        }
    }

    public void cetakPenghasilan() {
        double ttlGaji = 0;
        ttlGaji = gajiPokok + lembur + uangMakan + transport;
        System.out.println("===============STRUK GAJI===============");
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("NIP\t\t\t: " + nip);
        System.out.println("Gaji Pokok\t\t: " + gajiPokok);
        System.out.println("Gaji Lembur\t\t: " + lembur);
        System.out.println("Uang Makan\t\t: " + uangMakan);
        System.out.println("Transport Lembur\t: " + transport);
        System.out.println("-------------------------------");
        System.out.println("Take Home Pay\t\t: " + ttlGaji);
    }
}
