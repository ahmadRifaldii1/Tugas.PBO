//nama : Ahmad Rifaldi
//Nim : 13020240259
//tanggal & waktu pengerjaan : 19/04/2026 jam 15.03
package mahasiswa;
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("NIM: ");
        String nim = sc.nextLine();

        System.out.print("Jumlah MK: ");
        int jml = sc.nextInt();

        Mahasiswa m = new Mahasiswa(nama, nim, jml);
        m.inputNilai(sc);
        m.tampil();
    }
}