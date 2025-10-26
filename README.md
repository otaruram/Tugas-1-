<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README - Aplikasi Kasir Restoran</title>
    <style>
        /* Gaya dasar untuk membuat tampilan mirip README di GitHub */
        body {
            font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
            line-height: 1.6;
            background-color: #ffffff;
            color: #333;
            max-width: 900px; /* Lebar konten agar mudah dibaca */
            margin: 20px auto; /* Posisi di tengah */
            padding: 0 25px;
        }

        h1, h2, h3 {
            border-bottom: 2px solid #eaecef;
            padding-bottom: 8px;
            margin-top: 35px;
            margin-bottom: 16px;
            font-weight: 600;
        }

        h1 { font-size: 2.2em; }
        h2 { font-size: 1.8em; }
        h3 { font-size: 1.4em; }

        p {
            margin-bottom: 16px;
        }

        ul, ol {
            padding-left: 30px;
            margin-bottom: 16px;
        }

        li {
            margin-bottom: 8px;
        }

        /* Untuk blok kode */
        pre {
            background-color: #f6f8fa;
            padding: 16px;
            border-radius: 6px;
            overflow-x: auto; /* Agar bisa di-scroll horizontal jika kode panjang */
        }

        /* Untuk kode inline */
        code {
            font-family: "SFMono-Regular", Consolas, "Liberation Mono", Menlo, monospace;
            font-size: 0.9em;
        }

        /* Membedakan kode inline dengan blok kode */
        :not(pre) > code {
            background-color: #f6f8fa;
            padding: 3px 6px;
            border-radius: 6px;
        }
        
        pre code {
            background-color: transparent;
            padding: 0;
            border-radius: 0;
        }

        strong {
            font-weight: 600;
        }

        em {
            font-style: italic;
        }

        hr {
            height: 1px;
            margin: 40px 0;
            background-color: #e1e4e8;
            border: 0;
        }
    </style>
</head>
<body>

    <h1>Aplikasi Kasir Restoran Sederhana (Tugas Praktik 1)</h1>
    
    <p>Ini adalah program konsol (terminal) sederhana yang dibuat dengan Java untuk mensimulasikan sistem pemesanan dan pembayaran di sebuah restoran.</p>
    
    <p>Program ini dibuat untuk memenuhi <strong>Tugas Praktik 1 Mata Kuliah [Nama Mata Kuliah Anda]</strong>. Fokus utama dari program ini adalah untuk mengimplementasikan konsep dasar Pemrograman Berorientasi Objek (OOP) dan struktur logika keputusan <strong>tanpa menggunakan struktur perulangan (loop)</strong>.</p>
    
    <hr>
    
    <h2>📋 Fitur Utama</h2>
    
    <ul>
        <li><strong>Data Menu:</strong> Program memiliki data menu <em>hardcoded</em> yang terdiri dari 8 item (4 Makanan, 4 Minuman) beserta harganya.</li>
        <li><strong>Pemesanan:</strong> Pelanggan dapat memesan hingga 4 item menu yang berbeda sekaligus memasukkan jumlahnya.</li>
        <li><strong>Kalkulasi Biaya:</strong> Program secara otomatis menghitung:
            <ul>
                <li>Subtotal dari semua pesanan.</li>
                <li>Pajak (10% dari subtotal).</li>
                <li>Biaya Pelayanan (tetap Rp 20.000).</li>
            </ul>
        </li>
        <li><strong>Logika Diskon & Promo:</strong> Program menerapkan aturan bisnis yang kompleks:
            <ul>
                <li><strong>Diskon 10%:</strong> Diberikan pada total biaya (setelah pajak & servis) jika <strong>subtotal pesanan &gt; Rp 100.000</strong>.</li>
                <li><strong>Promo BOGO:</strong> Penawaran "Beli 1 Gratis 1" untuk 1 item minuman jika <strong>subtotal pesanan &gt; Rp 50.000</strong>.</li>
            </ul>
        </li>
        <li><strong>Cetak Struk:</strong> Menampilkan struk pembayaran yang rinci, mencantumkan semua item, biaya, pajak, pelayanan, serta diskon/promo yang didapat.</li>
    </ul>
    
    <hr>
    
    <h2>📁 Struktur Proyek</h2>
    
    <p>Proyek ini terdiri dari 2 file sumber <code>.java</code>:</p>
    
    <ol>
        <li>
            <code>menu.java</code>
            <ul>
                <li>Berisi <code>public class menu</code> yang bertindak sebagai <em>blueprint</em> (cetakan) untuk setiap objek menu.</li>
                <li>Memiliki atribut: <code>nama</code> (String), <code>harga</code> (int), dan <code>kategori</code> (String).</li>
                <li>Memiliki sebuah <em>constructor</em> untuk inisialisasi objek.</li>
            </ul>
        </li>
        <li>
            <code>main.java</code>
            <ul>
                <li>Berisi <code>public class main</code> yang menjadi program utama.</li>
                <li>Memuat <code>public static void main(String[] args)</code> sebagai titik masuk program.</li>
                <li>Berisi method-method statis untuk menjalankan logika aplikasi:
                    <ul>
                        <li><code>tampilkanMenu()</code>: Menampilkan 8 item menu ke konsol.</li>
                        <li><code>findMenu()</code>: Mencari objek <code>menu</code> di dalam array berdasarkan nama (String) yang diinput user.</li>
                        <li><code>hitungDanCetak()</code>: Melakukan semua proses kalkulasi total, diskon, promo, dan mencetak struk akhir.</li>
                    </ul>
                </li>
            </ul>
        </li>
    </ol>
    
    <hr>
    
    <h2>🚀 Cara Menjalankan</h2>
    
    <p>Program ini dapat dijalankan melalui terminal atau <em>command prompt</em>.</p>
    
    <h3>Prasyarat</h3>
    <p>Pastikan Anda memiliki <strong>Java Development Kit (JDK)</strong> yang sudah terinstal dan terkonfigurasi di sistem Anda.</p>
    
    <h3>Langkah-langkah</h3>
    
    <ol>
        <li>Buka terminal atau command prompt Anda.</li>
        <li>Arahkan (navigasi) ke direktori (folder) tempat Anda menyimpan file <code>main.java</code> dan <code>menu.java</code>.
            <pre><code>cd path/ke/folder/proyek</code></pre>
        </li>
        <li><strong>Kompilasi (Compile)</strong> kedua file <code>.java</code> menjadi <code>.class</code>.
            <pre><code># Meng-compile kedua file secara spesifik
javac main.java menu.java
    
# Atau, cara cepat (compile semua file .java di folder)
javac *.java</code></pre>
        </li>
        <li><strong>Jalankan (Run)</strong> program dengan memanggil nama class utama (<code>main</code>).
            <pre><code>java main</code></pre>
            <p><strong>Catatan:</strong> Jangan gunakan <code>.java</code> atau <code>.class</code> saat menjalankan. Cukup <code>java</code> diikuti nama class yang berisi method <code>main</code>.</p>
        </li>
    </ol>
    
    <hr>
    
    <h2>🛠️ Detail Implementasi (Pemenuhan Indikator Tugas)</h2>
    
    <p>Program ini secara spesifik dirancang untuk memenuhi 3 Indikator Hasil Belajar.</p>
    
    <h3>1. Indikator 1: Tipe Data, Variabel, Class, Object, Method</h3>
    <ul>
        <li><strong>Class:</strong> Didefinisikan dalam <code>menu.java</code> sebagai blueprint.</li>
        <li><strong>Object:</strong> Dibuat di dalam <code>main.java</code> saat mengisi array, contoh: <code>daftarMenu[0] = new menu("Nasi Padang", ...);</code>.</li>
        <li><strong>Method:</strong> Program dipecah menjadi beberapa method fungsional seperti <code>tampilkanMenu()</code>, <code>findMenu()</code>, dan <code>hitungDanCetak()</code>.</li>
        <li><strong>Tipe Data & Variabel:</strong> Menggunakan beragam tipe data seperti <code>String nama</code>, <code>int harga</code>, <code>double subTotal</code>, <code>boolean adaMinuman</code> untuk menyimpan data dan status.</li>
    </ul>
    
    <h3>2. Indikator 2: Array dan String</h3>
    <ul>
        <li><strong>Array:</strong> <code>menu[] daftarMenu = new menu[8];</code> digunakan sebagai struktur data utama untuk menyimpan 8 objek menu. Karena <em>loop</em> dilarang, array ini diakses secara manual menggunakan indeks (contoh: <code>daftarMenu[0]</code>, <code>daftarMenu[1]</code>, dst.).</li>
        <li><strong>String:</strong> Digunakan secara ekstensif untuk:
            <ul>
                <li>Menyimpan nama menu dan kategori.</li>
                <li>Menerima input dari <code>scanner.nextLine()</code>.</li>
                <li>Memvalidasi input dengan <code>nama.isEmpty()</code>.</li>
                <li>Membandingkan nama menu dengan <code>nama.equalsIgnoreCase()</code> di dalam method <code>findMenu</code>.</li>
            </ul>
        </li>
    </ul>
    
    <h3>3. Indikator 3: Struktur Keputusan (Tanpa Loop)</h3>
    <p>Ini adalah inti dari logika program. Semua skenario ditangani menggunakan struktur <code>if</code>.</p>
    <ul>
        <li><strong><code>if</code> Sederhana:</strong> Digunakan untuk menangani input pesanan opsional (pesanan 2, 3, dan 4). Program hanya akan meminta jumlah <em>jika</em> user memasukkan nama menu (<code>!nama.isEmpty()</code>).</li>
        <li><strong><code>if-else if-else</code> (Rantai):</strong> Digunakan di dalam method <code>findMenu</code>. Untuk menemukan menu di array tanpa <em>loop</em>, program mengecek satu per satu:
            <ul>
                <li><code>if (nama.equalsIgnoreCase(daftarMenu[0].nama)) { ... }</code></li>
                <li><code>else if (nama.equalsIgnoreCase(daftarMenu[1].nama)) { ... }</code></li>
                <li>...dan seterusnya sebanyak 8 kali.</li>
            </ul>
        </li>
        <li><strong><code>if-else if-else</code> & <code>nested if</code> (Logika Bisnis):</strong> Digunakan di <code>hitungDanCetak</code> untuk 3 skenario promo:
            <ol>
                <li><strong>Skenario 1:</strong> <code>if (subTotal > 100000)</code>
                    <ul>
                        <li>Mendapat diskon 10%.</li>
                        <li>Terdapat <strong>nested if (if bersarang)</strong> di dalamnya: <code>if (adaMinuman)</code> untuk mengecek apakah pelanggan juga berhak mendapat promo BOGO (karena total > 100rb pasti juga > 50rb).</li>
                    </ul>
                </li>
                <li><strong>Skenario 2:</strong> <code>else if (subTotal > 50000)</code>
                    <ul>
                        <li>Tidak dapat diskon 10%.</li>
                        <li>Hanya mendapat promo BOGO (jika ada minuman yang dipesan).</li>
                    </ul>
                </li>
                <li><strong>Skenario 3:</strong> <code>else</code>
                    <ul>
                        <li>Kondisi jika <code>subTotal &lt;= 50000</code>.</li>
                        <li>Tidak mendapat diskon maupun promo.</li>
                    </ul>
                </li>
            </ol>
        </li>
    </ul>
    
    <hr>
    
    <h2>🖥️ Contoh Sesi Program (Skenario Promo BOGO)</h2>
    <p>Berikut adalah contoh output program jika total pesanan di atas Rp 50.000 tetapi di bawah Rp 100.000.</p>
    
    <pre><code>--- SELAMAT DATANG DI RESTORAN SEDERHANA ---
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
==============================================</code></pre>
    
    <p><em>Catatan: Pada skenario ini, pelanggan mendapat promo BOGO namun tidak mendapat diskon 10%, dan total akhir tidak dikurangi (karena BOGO adalah bonus barang, bukan potongan harga).</em></p>
    
    <hr>
    
    <h2>👨‍💻 Penulis</h2>
    
    <ul>
        <li><strong>Nama:</strong> [Nama Lengkap Anda]</li>
        <li><strong>NIM:</strong> [NIM Anda]</li>
        <li><strong>Kelas:</strong> [Kelas Anda]</li>
    </ul>

</body>
</html>
