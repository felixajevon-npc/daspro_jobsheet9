import java.util.Scanner;

public class KafePemesanan08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesan = scanner.nextInt();
        scanner.nextLine();

        String[] namaPesanan = new String[jmlPesan];
        double[] hargaPesanan = new double[jmlPesan];

        for (int i = 0; i < jmlPesan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jmlPesan; i++) {
            System.out.println(namaPesanan[i] + ": " + hargaPesanan[i]);
        }
        System.out.println("Total biaya: " + totalBiaya);

        scanner.close();
    }
}
