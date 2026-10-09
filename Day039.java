import java.util.Scanner;
public class Day039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = sc.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = sc.nextDouble();
        System.out.print("Masukkan simbol operasi (+, -, *, /, %): ");
        char simbol = sc.next().charAt(0);
        System.out.println();

        double hasil = 0;

        if (simbol == '+') {
            hasil = angka1 + angka2;
        } else if (simbol == '-') {
            hasil = angka1 - angka2;
        } else if (simbol == '*') {
            hasil = angka1 * angka2;
        } else if (simbol == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error, tidak terdefinisi");
                return;
            }
        } else if (simbol == '%') {
            if (angka2 != 0) {
                hasil = angka1 % angka2;
            } else {
                System.out.println("Error, tidak terdefinisi");
                return;
            }
        } else {
            System.out.println("Waduhhh, Operasi yang anda masukkan tidak ada!!!");
            return;
        }
        System.out.println("Hasil dari " + angka1 + " " + simbol + " " + angka2 + " adalah " + hasil);
    }
}
