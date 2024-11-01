import java.util.Scanner;

public class KafePencarian08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };

        System.out.print("Masukkan Nama Makanan Yang Ingin Dicari: ");
        String searchMakanan = sc.nextLine();

        boolean makananFound = false;
        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(searchMakanan)) {
                makananFound = true;
                break;
            }
        }

        if (makananFound) {
            System.out.println(searchMakanan + " Tersedia Di Menu.");
        } else {
            System.out.println(searchMakanan + " Tidak Tersedia Di Menu.");
        }

        sc.close();
    }
}
