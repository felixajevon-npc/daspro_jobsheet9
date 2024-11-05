import java.util.Scanner;

public class SearchNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput : ");
        int jumlahElemen = sc.nextInt();

        int[] arrNilai = new int[jumlahElemen];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari (key): ");
        int key = sc.nextInt();

        int hasil = -1; 
        for (int i = 0; i < arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i; 
                break;     
            }
        }

        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak dapat ditemukan!");
        }
    }
}
