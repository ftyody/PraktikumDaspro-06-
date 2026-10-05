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
        } 
        
        input.close();
    }
}