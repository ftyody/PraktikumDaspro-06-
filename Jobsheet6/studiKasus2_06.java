package Jobsheet6;
import java.util.Scanner;
public class studiKasus2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        String jenis = input.nextLine().trim();
        boolean memenuhiSyarat = false;
        String alasan;

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("Mandiri")) {
            System.out.print("Peringkat juara (1, 2, 3; isi 0 jika bukan juara): ");
            int peringkat = input.nextInt();
            if (peringkat >= 1 && peringkat <= 3) {
                memenuhiSyarat = true;
                alasan = "meraih Juara " + peringkat;
            } else {
                alasan = "bukan peraih Juara 1, 2, atau 3";
            }
        } else if (jenis.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int pendanaan = input.nextInt();
            if (pendanaan == 1) {
                memenuhiSyarat = true;
                alasan = "tim lolos pendanaan PKM";
            } else {
                alasan = "tim tidak lolos pendanaan PKM";
            }
        } else {
            alasan = "kegiatan lainnya tidak memperoleh dana penghargaan";
        }

        if (memenuhiSyarat) {
            System.out.print("Jumlah dokumen yang diupload (0-4): ");
            int dokumen = input.nextInt();
            if (dokumen == 4) {
                System.out.println("Mahasiswa: " + nama);
                System.out.println("Status: Berhak menerima dana penghargaan karena " + alasan +
                        " dan seluruh dokumen lengkap.");
            } else {
                System.out.println("Mahasiswa: " + nama);
                System.out.println("Status: Tidak berhak menerima dana penghargaan karena " + alasan +
                        ", dokumen tidak lengkap.");
                System.out.println("Jumlah dokumen yang masih kurang: " + (4 - dokumen));
            }
        } else {
            System.out.println("Mahasiswa: " + nama);
            System.out.println("Status: Tidak berhak menerima dana penghargaan karena " + alasan + ".");
        }
        input.close(); 
    }
}
