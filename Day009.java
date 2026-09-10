public class Day009 {
    public static void main(String[] args) {
        final double harga = 15000;
        final double diskon = 0.10;

        double potongan = harga * diskon;
        double sisa = harga - potongan;

        System.out.println("Jadi yang harus di bayar yaitu Rp." + sisa );
    }
}
