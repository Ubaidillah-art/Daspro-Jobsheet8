import java.util.Scanner;
public class Tugas3_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = sc.nextInt();
        System.out.print("Masukkan jumlah pelanggan : ");
        int jumlahPelanggan = sc.nextInt();
        if (jumlahToko <= 0 || jumlahPelanggan <= 0) {
            System.out.print("Jumlah toko dan pelanggan minimal 1. Ulangi input!");
        }else {
            int totalSemuaBarang = 0;
            int totalSemuaPelanggan = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = 0;
            int toko = 1;
            while (toko <= jumlahToko) {
                System.out.println("Toko "+toko);
                int totalBarang = 0;
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                    System.out.print("    Jumlah barang pelanggan " + p + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("    Tidak boleh negatif. Ulangi input!");
                    }
                    } while (barang < 0);
                    totalBarang += barang;
                }
                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarang);
                totalSemuaBarang += totalBarang;
                totalSemuaPelanggan += jumlahPelanggan;
                if (totalBarang > barangTerbanyak) {
                    barangTerbanyak = totalBarang;
                    tokoTerbanyak = toko;
                }
                toko++;
            }
            System.out.println("==============================");
            System.out.println("Total pelanggan seluruh toko: " + totalSemuaPelanggan);
            System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
        }
    }
}