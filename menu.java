/**
 * kelas menu (blueprint/template)
 * mewakili satu item menu di restoran.
 */
public class menu { // <-- diubah jadi huruf kecil

    // atribut (variabel instance)
    String nama;
    int harga;
    String kategori; // "makanan" atau "minuman"

    /**
     * constructor
     * method khusus yang dipanggil saat sebuah object menu dibuat.
     */
    public menu(String nama, int harga, String kategori) { // <-- diubah jadi huruf kecil
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }
}