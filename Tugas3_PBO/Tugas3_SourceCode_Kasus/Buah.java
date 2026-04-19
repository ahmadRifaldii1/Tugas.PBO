//nama : Ahmad Rifaldi
//Nim : 13020240259
//tanggal & waktu pengerjaan : 19/04/2026 jam 15.03

package tokobuah;

public class Buah {
    private String nama;
    private int harga, stok;

    public Buah(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String info() {
        return nama + " Rp" + harga + " (stok: " + stok + ")";
    }

    public boolean tersedia(int qty) {
        if (stok >= qty) {
            stok -= qty;
            return true;
        }
        return false;
    }

    public int total(int qty) {
        return harga * qty;
    }
}