import java.util.Scanner;
public class Tugas1_23 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int i = 1;
        int totalAngka = 0;
        while (i <= n) {
            int angka = 1;
            int j = 1;
            while (j <= i) {
                System.out.print(" "+angka);
                totalAngka += 1;
                angka++;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println(" Total angka tercetak : " +totalAngka);
        sc.close();
    }
}
