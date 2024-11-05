import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double total = 0, rata2, lulus = 0;
        double totalLulus = 0, totalTidakLulus = 0;
        double rata2Lulus = 0, rata2TidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        int jumlahTidakLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                jumlahTidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;
        if (lulus > 0) {
            rata2Lulus = totalLulus / lulus;
        }
        if (jumlahTidakLulus > 0) {
            rata2TidakLulus = totalTidakLulus / jumlahTidakLulus;
        }

        System.out.println("Rata-rata Nilai = " + rata2);
        System.out.println("Jumlah Mahasiswa Lulus = " + lulus);
        System.out.println("Rata-rata Nilai Lulus = " + rata2Lulus);
        System.out.println("Rata-rata Nilai Tidak Lulus = " + rata2TidakLulus);
    }
}
