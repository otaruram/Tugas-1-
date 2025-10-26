Aplikasi Kasir Restoran Sederhana (Tugas Praktik 1)

Ini adalah program konsol (terminal) sederhana yang dibuat dengan Java untuk mensimulasikan sistem pemesanan dan pembayaran di sebuah restoran.

Program ini dibuat untuk memenuhi Tugas Praktik 1 Mata Kuliah [Nama Mata Kuliah Anda]. Fokus utama dari program ini adalah untuk mengimplementasikan konsep dasar Pemrograman Berorientasi Objek (OOP) dan struktur logika keputusan tanpa menggunakan struktur perulangan (loop).

📋 Fitur Utama

    Data Menu: Program memiliki data menu hardcoded yang terdiri dari 8 item (4 Makanan, 4 Minuman) beserta harganya.

    Pemesanan: Pelanggan dapat memesan hingga 4 item menu yang berbeda sekaligus memasukkan jumlahnya.

    Kalkulasi Biaya: Program secara otomatis menghitung:

        Subtotal dari semua pesanan.

        Pajak (10% dari subtotal).

        Biaya Pelayanan (tetap Rp 20.000).

    Logika Diskon & Promo: Program menerapkan aturan bisnis yang kompleks:

        Diskon 10%: Diberikan pada total biaya (setelah pajak & servis) jika subtotal pesanan > Rp 100.000.

        Promo BOGO: Penawaran "Beli 1 Gratis 1" untuk 1 item minuman jika subtotal pesanan > Rp 50.000.

    Cetak Struk: Menampilkan struk pembayaran yang rinci, mencantumkan semua item, biaya, pajak, pelayanan, serta diskon/promo yang didapat.

📁 Struktur Proyek

Proyek ini terdiri dari 2 file sumber .java:

    menu.java

        Berisi public class menu yang bertindak sebagai blueprint (cetakan) untuk setiap objek menu.

        Memiliki atribut: nama (String), harga (int), dan kategori (String).

        Memiliki sebuah constructor untuk inisialisasi objek.

    main.java

        Berisi public class main yang menjadi program utama.

        Memuat public static void main(String[] args) sebagai titik masuk program.

        Berisi method-method statis untuk menjalankan logika aplikasi:

            tampilkanMenu(): Menampilkan 8 item menu ke konsol.

            findMenu(): Mencari objek menu di dalam array berdasarkan nama (String) yang diinput user.

            hitungDanCetak(): Melakukan semua proses kalkulasi total, diskon, promo, dan mencetak struk akhir.

🚀 Cara Menjalankan

Program ini dapat dijalankan melalui terminal atau command prompt.

Prasyarat

    Pastikan Anda memiliki Java Development Kit (JDK) yang sudah terinstal dan terkonfigurasi di sistem Anda.

Langkah-langkah

    Buka terminal atau command prompt Anda.

    Arahkan (navigasi) ke direktori (folder) tempat Anda menyimpan file main.java dan menu.java.
    Bash

cd path/ke/folder/proyek

Kompilasi (Compile) kedua file .java menjadi .class.
Bash

# Meng-compile kedua file secara spesifik
javac main.java menu.java

# Atau, cara cepat (compile semua file .java di folder)
javac *.java

Jalankan (Run) program dengan memanggil nama class utama (main).
Bash

    java main

    Catatan: Jangan gunakan .java atau .class saat menjalankan. Cukup java diikuti nama class yang berisi method main.

🛠️ Detail Implementasi (Pemenuhan Indikator Tugas)

Program ini secara spesifik dirancang untuk memenuhi 3 Indikator Hasil Belajar.

1. Indikator 1: Tipe Data, Variabel, Class, Object, Method

    Class: Didefinisikan dalam menu.java sebagai blueprint.

    Object: Dibuat di dalam main.java saat mengisi array, contoh: daftarMenu[0] = new menu("Nasi Padang", ...);.

    Method: Program dipecah menjadi beberapa method fungsional seperti tampilkanMenu(), findMenu(), dan hitungDanCetak().

    Tipe Data & Variabel: Menggunakan beragam tipe data seperti String nama, int harga, double subTotal, boolean adaMinuman untuk menyimpan data dan status.

2. Indikator 2: Array dan String

    Array: menu[] daftarMenu = new menu[8]; digunakan sebagai struktur data utama untuk menyimpan 8 objek menu. Karena loop dilarang, array ini diakses secara manual menggunakan indeks (contoh: daftarMenu[0], daftarMenu[1], dst.).

    String: Digunakan secara ekstensif untuk:

        Menyimpan nama menu dan kategori.

        Menerima input dari scanner.nextLine().

        Memvalidasi input dengan nama.isEmpty().

        Membandingkan nama menu dengan nama.equalsIgnoreCase() di dalam method findMenu.

3. Indikator 3: Struktur Keputusan (Tanpa Loop)

Ini adalah inti dari logika program. Semua skenario ditangani menggunakan struktur if.

    if Sederhana: Digunakan untuk menangani input pesanan opsional (pesanan 2, 3, dan 4). Program hanya akan meminta jumlah jika user memasukkan nama menu (!nama.isEmpty()).

    if-else if-else (Rantai): Digunakan di dalam method findMenu. Untuk menemukan menu di array tanpa loop, program mengecek satu per satu:

        if (nama.equalsIgnoreCase(daftarMenu[0].nama)) { ... }

        else if (nama.equalsIgnoreCase(daftarMenu[1].nama)) { ... }

        ...dan seterusnya sebanyak 8 kali.

    if-else if-else & nested if (Logika Bisnis): Digunakan di hitungDanCetak untuk 3 skenario promo:

        Skenario 1: if (subTotal > 100000)

            Mendapat diskon 10%.

            Terdapat nested if (if bersarang) di dalamnya: if (adaMinuman) untuk mengecek apakah pelanggan juga berhak mendapat promo BOGO (karena total > 100rb pasti juga > 50rb).

        Skenario 2: else if (subTotal > 50000)

            Tidak dapat diskon 10%.

            Hanya mendapat promo BOGO (jika ada minuman yang dipesan).

        Skenario 3: else

            Kondisi jika subTotal <= 50000.

            Tidak mendapat diskon maupun promo.

🖥️ Contoh Sesi Program (Skenario Promo BOGO)

Berikut adalah contoh output program jika total pesanan di atas Rp 50.000 tetapi di bawah Rp 100.000.

--- SELAMAT DATANG DI RESTORAN SEDERHANA ---
--- MAKANAN ---
1. Nasi Padang     - Rp 25000
2. Ayam Bakar      - Rp 30000
3. Sate Ayam       - Rp 28000
4. Gado-Gado       - Rp 20000

--- MINUMAN ---
5. Es Teh Manis    - Rp 8000
6. Jus Alpukat     - Rp 15000
7. Kopi Susu       - Rp 18000
8. Air Mineral     - Rp 5000

--- PEMESANAN (Maksimal 4 Menu) ---
Pesanan 1 (Nama Menu): Ayam Bakar
Jumlah 1: 2
Pesanan 2 (Nama Menu, kosongkan jika selesai): Es Teh Manis
Jumlah 2: 1
Pesanan 3 (Nama Menu, kosongkan jika selesai):
Pesanan 4 (Nama Menu, kosongkan jika selesai):

==============================================
             STRUK PEMBAYARAN
==============================================
Ayam Bakar      2 x 30000   = Rp    60000.0
Es Teh Manis    1 x 8000    = Rp     8000.0
----------------------------------------------
Subtotal                      = Rp    68000.0
Pajak (10%)                   = Rp     6800.0
Biaya Pelayanan               = Rp    20000.0
Total Awal                    = Rp    94800.0

Promo: Promo: Beli 1 Gratis 1 Es Teh Manis
==============================================
TOTAL AKHIR                   = Rp    94800.0
==============================================
           Terima Kasih!
==============================================

Catatan: Pada skenario ini, pelanggan mendapat promo BOGO namun tidak mendapat diskon 10%, dan total akhir tidak dikurangi (karena BOGO adalah bonus barang, bukan potongan harga).

👨‍💻 Penulis

    Nama: Oki Taruna

    NIM: 051441949

   
