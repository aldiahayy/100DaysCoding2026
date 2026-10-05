import java.util.Scanner;
public class Day035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah sudah terdaftar?: ");
        boolean terdaftar = sc.nextBoolean();

        if (terdaftar) {
            System.out.print("Masukkan nilai DDP: ");
            int ddp = sc.nextInt();
            System.out.print("Masukkan nilai PBO: ");
            int pbo = sc.nextInt();
            System.out.print("Masukkan nilai FWB: ");
            int fwb = sc.nextInt();

            double rataRata = (double) (ddp + pbo + fwb) / 3;

            System.out.println("\nRata-rata nilai : " + rataRata);
            if (rataRata >= 75) {
                System.out.println("Status : Boleh Mengikuti Lomba");
            } else {
                System.out.println("Status : Nilai Belum Memenuhi Syarat");
            }
        } else {
            System.out.println("\nStatus : Belum Terdaftar");
        }
    }
}
