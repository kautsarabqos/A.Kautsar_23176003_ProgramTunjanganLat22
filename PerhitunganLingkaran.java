import java.util.Scanner;

public class PerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double diameter = 0;
        boolean validInput = false;

        // Validasi input diameter
        while (!validInput) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String input = scanner.nextLine();

            try {
                diameter = Double.parseDouble(input);
                if (diameter > 0) {
                    validInput = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }

        // Menghitung jari-jari, luas, dan keliling
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        // Menampilkan hasil
        System.out.println("======Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran: %.2f cm%n", jariJari);
        System.out.printf("Luas Lingkaran: %.2f cm²%n", luas);
        System.out.printf("Keliling Lingkaran: %.2f cm%n", keliling);

        scanner.close();
    }
}