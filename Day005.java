public class Day005 {
    public static void main(String[] args) {
        double nilaiTugas = 85.5;
        double nilaiUts = 80.0;
        double nilaiUas = 90.5;

        System.out.println("========================");
        System.out.println("     NILAI MAHASISWA");
        System.out.println("========================");
        System.out.println("Nilai Tugas : " + nilaiTugas);
        System.out.println("Nilai UTS   : " + nilaiUts);
        System.out.println("Nilai UAS   : " + nilaiUas + "\n");
        System.out.println("Rata-rata   : " + (nilaiTugas + nilaiUts + nilaiUas)/3);
    }
}
