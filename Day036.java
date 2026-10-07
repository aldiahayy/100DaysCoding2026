import java.util.Scanner;
public class Day036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nomor peserta: ");
        int nomor = sc.nextInt();
 
        if (nomor % 2 == 0) {
            System.out.println("Nomor peserta adalah bilangan Genap");
        } else {
            System.out.println("Nomor peserta adalah bilangan Ganjil");
        }
    }
}
