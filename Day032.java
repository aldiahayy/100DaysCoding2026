import java.util.Scanner;
public class Day032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai: ");
        int nilai = sc.nextInt();
        System.out.print("Pendapatan: ");
        int pendapatan = sc.nextInt();
        System.out.print("Organisasi: ");
        boolean organisasi = sc.nextBoolean();
        System.out.print("Pernah Beasiswa: ");
        boolean beasiswa = sc.nextBoolean();

        boolean cekNilai = nilai >= 80;
        boolean cekPendapatanOrganisasi = pendapatan <= 4000000 || organisasi;
        boolean cekBeasiswa = !beasiswa;
      
        System.out.println("Syarat Nilai Terpenuhi : " + (cekNilai));
        System.out.println("Syarat Pendapatan/Organisasi : " + (cekPendapatanOrganisasi));
        System.out.println("Lolos Seluruh Seleksi : " + (cekNilai && cekPendapatanOrganisasi && cekBeasiswa));
    }
}
