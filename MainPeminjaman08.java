import java.util.Scanner;

public class MainPeminjaman08 {

    // insettion sort untuk urutkan peminjaman berdasarkan denda terbesar
    static void insertionSort(Peminjaman08[] arr) { // mengurutkan data berdasarkan denda terbesar
        for (int i = 1; i < arr.length; i++) {
            Peminjaman08 key = arr[i]; // mengaambil elemen ke-i sebagai acuan
            int j = i - 1;
            // menggeser elemen yang dendanya lebih kecil ke kanan
            while (j >= 0 && arr[j].denda < key.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // sisipkan key di posisi yang tepat
        }
    }

    // mencari peminjaman berdasarkan NIM
    static void sequentialSearch(Peminjaman08[] arr, String nim) {
        boolean ditemukan = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].mahasiswa.nim.equals(nim)) { // cek apakah NIM cocok
                if (!ditemukan) System.out.println("Data ditemukan:");
                arr[i].tampilkanInfo();
                ditemukan = true; // lanjut cari jika ada lebih dari 1
            }
        }
        if (!ditemukan) System.out.println("Data tidak ditemukan.");
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// /////  
    static void sequentialSearchUntukbukujudul(Peminjaman08[] arr, String judul) { // mencari peminjaman berdasarkan judul buku                //
        boolean ditemukan = false;                                                                                                             //
        for (int i = 0; i < arr.length; i++) { // mengurutkan data berdasarkan judul buku                                                     //
            if (arr[i].buku.judul.equalsIgnoreCase(judul)) { // cek apakah judul cocok                                                       // 
                if (!ditemukan) System.out.println("Data ditemukan:");                                                                    //  Memodifikasi UTS Menambahkan fitur perncarian transaksi prminjaman buku berdasarkan judul buku
                arr[i].tampilkanInfo();                                                                                                     //
                ditemukan = true; // lanjut cari jika ada lebih dari 1                                                                     // 
            }                                                                                                                              //
        }                                                                                                                                  //
        if (!ditemukan) System.out.println("Data tidak ditemukan.");                                                                    //
    }                                                                                                                                     // 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //array dati obbject mahasiswa
        Mahasiswa08[] daftarMahasiswa08 = {
            new Mahasiswa08("22001", "Andi",  "Teknik Informatika"),
            new Mahasiswa08("22002", "Budi",  "Teknik Informatika"),
            new Mahasiswa08("22003", "Citra", "Sistem Informasi Bisnis")
        };

        // array dari object buku
        Buku08[] daftarBuku08 = {
            new Buku08("B001", "Algoritma",   2020),
            new Buku08("B002", "Basis Data",  2019),
            new Buku08("B003", "Pemrograman", 2021),
            new Buku08("B004", "Fisika",      2024)
        };

        // array dari object peminjaman
        Peminjaman08[] daftarPeminjaman08 = {
            new Peminjaman08(daftarMahasiswa08[0], daftarBuku08[0], 7),  
            new Peminjaman08(daftarMahasiswa08[1], daftarBuku08[1], 3),  
            new Peminjaman08(daftarMahasiswa08[2], daftarBuku08[2], 10), 
            new Peminjaman08(daftarMahasiswa08[2], daftarBuku08[3], 6),  
            new Peminjaman08(daftarMahasiswa08[0], daftarBuku08[1], 4)   
        };
        

        int pilih = -1;
        while (pilih != 0) {
            System.out.println("\n=== Sistem Peminjaman Ruang Baca ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Cari Berdasarkan Judul Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa08 m : daftarMahasiswa08) { m.tampilkanInfo(); System.out.println(); }
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku08 b : daftarBuku08) { b.tampilkanInfo(); System.out.println(); }
                    break;
                case 3:
                    System.out.println("Daftar Peminjaman:");
                    for (Peminjaman08 p : daftarPeminjaman08) p.tampilkanInfo();
                    break;
                case 4:
                    // salin array agar urutan asli tidak berubah
                    Peminjaman08[] sorted = daftarPeminjaman08.clone();
                    insertionSort(sorted);
                    System.out.println("Diurutkan berdasarkan denda terbesar:");
                    for (Peminjaman08 p : sorted) p.tampilkanInfo();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    sequentialSearch(daftarPeminjaman08, sc.next());
                    break;
                    /////////////////////////////////////////////////////////////
                case 6:                                                        //
                    System.out.print("Masukkan Judul Buku: ");              //
                    sc.nextLine(); // buang newline                           // Modifikasi UTS Menambahkan fitur perncarian transaksi prminjaman buku berdasarkan judul buku
                    String judul = sc.nextLine();                             //
                    sequentialSearchUntukbukujudul(daftarPeminjaman08, judul);//
                    break;                                                    //
                    ////////////////////////////////////////////////////////////
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        sc.close();
    }
}