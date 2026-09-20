public class Day019 {
    public static void main(String[] args) {
        double angkaDouble = 150.75;
        float angkaFloat = (float) angkaDouble;
        long angkaLong = (long) angkaFloat;
        int angkaInt = (int) angkaLong;
        short angkaShort = (short) angkaInt;
        byte angkaByte = (byte) angkaShort;

        System.out.println("Nilai double\t: " + angkaDouble);
        System.out.println("Nilai float\t: " + angkaFloat);
        System.out.println("Nilai long\t: " + angkaLong);
        System.out.println("Nilai int\t: " + angkaInt);
        System.out.println("Nilai short\t: " + angkaShort);
        System.out.println("Nilai byte\t: " + angkaByte);
    }
}
