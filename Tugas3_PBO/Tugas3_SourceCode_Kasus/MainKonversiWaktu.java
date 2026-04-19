//nama : Ahmad Rifaldi
//Nim : 13020240259
//tanggal & waktu pengerjaan : 19/04/2026 jam 15.03

package konversiwaktu;
import java.util.Scanner;

public class MainKonversiWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total detik: ");
        long d = sc.nextLong();

        KonversiWaktu k = new KonversiWaktu(d);

        System.out.printf("Waktu: %02d:%02d:%02d\n",
                k.jam(), k.menit(), k.detik());
    }
}