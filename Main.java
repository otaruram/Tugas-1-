import java.util.Scanner; // keyword 'import' untuk menggunakan kelas dari package lain

/**
 * kelas utama (main)
 * berisi method main dan method-method lain untuk menjalankan aplikasi.
 */
public class main { // <-- pakai 'm' kecil

    /**
     * method utama (entry point) program.
     */
    public static void main(String[] args) {
        
        // 1. input menu restoran (indikator 2: implementasi array)
        // kita membuat array untuk menyimpan object menu.
        menu[] daftarMenu = new menu[8]; // <-- pakai 'm' kecil

        // mengisi array dengan object menu (instansiasi)
        // kategori makanan
        daftarMenu[0] = new menu("Nasi Padang", 25000, "Makanan"); // <-- pakai 'm' kecil
        daftarMenu[1] = new menu("Ayam Bakar", 30000, "Makanan"); // <-- pakai 'm' kecil
        daftarMenu[2] = new menu("Sate Ayam", 28000, "Makanan"); // <-- pakai 'm' kecil
        daftarMenu[3] = new menu("Gado-Gado", 20000, "Makanan"); // <-- pakai 'm' kecil
        // kategori minuman
        daftarMenu[4] = new menu("Es Teh Manis", 8000, "Minuman"); // <-- pakai 'm' kecil
        daftarMenu[5] = new menu("Jus Alpukat", 15000, "Minuman"); // <-- pakai 'm' kecil
        daftarMenu[6] = new menu("Kopi Susu", 18000, "Minuman"); // <-- pakai 'm' kecil
        daftarMenu[7] = new menu("Air Mineral", 5000, "Minuman"); // <-- pakai 'm' kecil

        
        // menampilkan daftar menu ke pelanggan
        tampilkanMenu(daftarMenu);

        // 2. pemesanan (maksimal 4 menu)
        Scanner scanner = new Scanner(System.in);

        // variabel untuk menyimpan pesanan
        String nama1 = "", nama2 = "", nama3 = "", nama4 = "";
        int jumlah1 = 0, jumlah2 = 0, jumlah3 = 0, jumlah4 = 0;

        // pesanan 1 (wajib diisi)
        System.out.println("\n--- PEMESANAN (Maksimal 4 Menu) ---");
        System.out.print("Pesanan 1 (Nama Menu): ");
        nama1 = scanner.nextLine();
        System.out.print("Jumlah 1: ");
        jumlah1 = scanner.nextInt(); 
        scanner.nextLine(); // membersihkan newline buffer

        // pesanan 2 (opsional)
        System.out.print("Pesanan 2 (Nama Menu, kosongkan jika selesai): ");
        nama2 = scanner.nextLine();
        if (!nama2.isEmpty()) { 
            System.out.print("Jumlah 2: ");
            jumlah2 = scanner.nextInt();
            scanner.nextLine();
        }

        // pesanan 3 (opsional)
        System.out.print("Pesanan 3 (Nama Menu, kosongkan jika selesai): ");
        nama3 = scanner.nextLine();
        if (!nama3.isEmpty()) { 
            System.out.print("Jumlah 3: ");
            jumlah3 = scanner.nextInt();
            scanner.nextLine();
        }

        // pesanan 4 (opsional)
        System.out.print("Pesanan 4 (Nama Menu, kosongkan jika selesai): ");
        nama4 = scanner.nextLine();
        if (!nama4.isEmpty()) {
            System.out.print("Jumlah 4: ");
            jumlah4 = scanner.nextInt();
            scanner.nextLine();
        }

        // mencari object menu berdasarkan nama yang diinput
        menu menu1 = findMenu(daftarMenu, nama1); // <-- pakai 'm' kecil
        menu menu2 = findMenu(daftarMenu, nama2); // <-- pakai 'm' kecil
        menu menu3 = findMenu(daftarMenu, nama3); // <-- pakai 'm' kecil
        menu menu4 = findMenu(daftarMenu, nama4); // <-- pakai 'm' kecil

        // 3 & 4. menghitung total biaya & mencetak struk
        hitungDanCetak(menu1, jumlah1, menu2, jumlah2, menu3, jumlah3, menu4, jumlah4);
        
        scanner.close();
    }

    /**
     * method untuk menampilkan menu.
     */
    public static void tampilkanMenu(menu[] daftarMenu) { // <-- pakai 'm' kecil
        System.out.println("--- SELAMAT DATANG DI RESTORAN SEDERHANA ---");
        System.out.println("--- MAKANAN ---");
        System.out.println("1. " + daftarMenu[0].nama + "\t - Rp " + daftarMenu[0].harga);
        System.out.println("2. " + daftarMenu[1].nama + "\t - Rp " + daftarMenu[1].harga);
        System.out.println("3. " + daftarMenu[2].nama + "\t - Rp " + daftarMenu[2].harga);
        System.out.println("4. " + daftarMenu[3].nama + "\t - Rp " + daftarMenu[3].harga);
        System.out.println("\n--- MINUMAN ---");
        System.out.println("5. " + daftarMenu[4].nama + "\t - Rp " + daftarMenu[4].harga);
        System.out.println("6. " + daftarMenu[5].nama + "\t - Rp " + daftarMenu[5].harga);
        System.out.println("7. " + daftarMenu[6].nama + "\t - Rp " + daftarMenu[6].harga);
        System.out.println("8. " + daftarMenu[7].nama + "\t - Rp " + daftarMenu[7].harga);
    }

    /**
     * method untuk mencari menu di array berdasarkan nama.
     */
    public static menu findMenu(menu[] daftarMenu, String nama) { // <-- pakai 'm' kecil
        // jika nama kosong atau null, kembalikan null
        if (nama == null || nama.isEmpty()) {
            return null;
        }

        // mengecek satu per satu secara manual
        if (nama.equalsIgnoreCase(daftarMenu[0].nama)) {
            return daftarMenu[0];
        } else if (nama.equalsIgnoreCase(daftarMenu[1].nama)) {
            return daftarMenu[1];
        } else if (nama.equalsIgnoreCase(daftarMenu[2].nama)) {
            return daftarMenu[2];
        } else if (nama.equalsIgnoreCase(daftarMenu[3].nama)) {
            return daftarMenu[3];
        } else if (nama.equalsIgnoreCase(daftarMenu[4].nama)) {
            return daftarMenu[4];
        } else if (nama.equalsIgnoreCase(daftarMenu[5].nama)) {
            return daftarMenu[5];
        } else if (nama.equalsIgnoreCase(daftarMenu[6].nama)) {
            return daftarMenu[6];
        } else if (nama.equalsIgnoreCase(daftarMenu[7].nama)) {
            return daftarMenu[7];
        } else {
            // jika tidak ditemukan
            System.out.println("Menu '" + nama + "' tidak ditemukan.");
            return null;
        }
    }

    /**
     * method untuk menghitung total dan mencetak struk.
     */
    public static void hitungDanCetak(menu menu1, int jml1, menu menu2, int jml2, 
                                      menu menu3, int jml3, menu menu4, int jml4) { // <-- pakai 'm' kecil
        
        double subTotal = 0;
        double totalItem1 = 0, totalItem2 = 0, totalItem3 = 0, totalItem4 = 0;
        
        boolean adaMinuman = false;
        String namaMinumanDipesan = "";

        // menghitung sub-total per item dan sub-total keseluruhan
        if (menu1 != null) {
            totalItem1 = menu1.harga * jml1;
            subTotal += totalItem1;
            if (menu1.kategori.equals("Minuman")) {
                adaMinuman = true;
                namaMinumanDipesan = menu1.nama;
            }
        }
        if (menu2 != null) {
            totalItem2 = menu2.harga * jml2;
            subTotal += totalItem2;
            if (menu2.kategori.equals("Minuman") && !adaMinuman) { 
                adaMinuman = true;
                namaMinumanDipesan = menu2.nama;
            }
        }
        if (menu3 != null) {
            totalItem3 = menu3.harga * jml3;
            subTotal += totalItem3;
            if (menu3.kategori.equals("Minuman") && !adaMinuman) {
                adaMinuman = true;
                namaMinumanDipesan = menu3.nama;
            }
        }
        if (menu4 != null) {
            totalItem4 = menu4.harga * jml4;
            subTotal += totalItem4;
            if (menu4.kategori.equals("Minuman") && !adaMinuman) {
                adaMinuman = true;
                namaMinumanDipesan = menu4.nama;
            }
        }

        // menghitung pajak dan biaya pelayanan
        double biayaPajak = subTotal * 0.10; // 10%
        double biayaPelayanan = 20000;
        double totalKeseluruhan = subTotal + biayaPajak + biayaPelayanan;

        // menghitung diskon dan promo
        double diskon = 0;
        double totalAkhir = totalKeseluruhan;
        String infoPromo = "-";

        // skenario 1: total > 100.000
        if (subTotal > 100000) {
            diskon = totalKeseluruhan * 0.10; // diskon 10%
            totalAkhir = totalKeseluruhan - diskon;
            infoPromo = "Diskon 10% (Total > 100rb)";

            // nested if
            if (adaMinuman) {
                infoPromo += " + Promo BOGO 1 " + namaMinumanDipesan;
            }

        // skenario 2: total > 50.000 (tapi tidak > 100.000)
        } else if (subTotal > 50000) {
            totalAkhir = totalKeseluruhan; // tidak ada diskon moneter
            
            if (adaMinuman) {
                infoPromo = "Promo: Beli 1 Gratis 1 " + namaMinumanDipesan;
            } else {
                infoPromo = "Promo: BOGO Minuman (Tidak ada minuman di pesanan)";
            }
        
        // skenario 3: total <= 50.000
        } else {
            totalAkhir = totalKeseluruhan;
            infoPromo = "Tidak ada promo";
        }

        // 4. mencetak struk pesanan
        System.out.println("\n==============================================");
        System.out.println("             STRUK PEMBAYARAN");
        System.out.println("==============================================");
        
        if (menu1 != null) {
            System.out.println(String.format("%-15s %d x %-8d = Rp %10.0f", menu1.nama, jml1, menu1.harga, totalItem1));
        }
        if (menu2 != null) {
            System.out.println(String.format("%-15s %d x %-8d = Rp %10.0f", menu2.nama, jml2, menu2.harga, totalItem2));
        }
        if (menu3 != null) {
            System.out.println(String.format("%-15s %d x %-8d = Rp %10.0f", menu3.nama, jml3, menu3.harga, totalItem3));
        }
        if (menu4 != null) {
            System.out.println(String.format("%-15s %d x %-8d = Rp %10.0f", menu4.nama, jml4, menu4.harga, totalItem4));
        }

        System.out.println("----------------------------------------------");
        System.out.println(String.format("%-28s = Rp %10.0f", "Subtotal", subTotal));
        System.out.println(String.format("%-28s = Rp %10.0f", "Pajak (10%)", biayaPajak));
        System.out.println(String.format("%-28s = Rp %10.0f", "Biaya Pelayanan", biayaPelayanan));
        System.out.println(String.format("%-28s = Rp %10.0f", "Total Awal", totalKeseluruhan));
        
        System.out.println("\nPromo: " + infoPromo);
        if (diskon > 0) {
            System.out.println(String.format("%-28s = Rp %10.0f", "Diskon", -diskon));
        }

        System.out.println("==============================================");
        System.out.println(String.format("%-28s = Rp %10.0f", "TOTAL AKHIR", totalAkhir));
        System.out.println("==============================================");
        System.out.println("           Terima Kasih!");
        System.out.println("==============================================");
    }
}