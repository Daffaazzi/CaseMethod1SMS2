import java.util.Scanner;

public class MainPeminjaman08 {

    static void insertionSort(Peminjaman08[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman08 key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].mahasiswa.nim.compareTo(key.mahasiswa.nim) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void sequentialSearch(Peminjaman08[] arr, String nim) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].mahasiswa.nim.equals(nim)) {
                System.out.println("Data ditemukan:");
                arr[i].tampilkanInfo();
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }

    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa08 [] daftarMahasiswa08 = {
            new Mahasiswa08("12345", "Andi", "Teknik Informatika"),
            new Mahasiswa08("67890", "Budi", "Teknik Informatika"),
            new Mahasiswa08("54321", "Citra", "Sistem Informasi Bisnis")
        };

        Buku08 [] daftarBuku08 = {
            new Buku08("B001", "Algoritma", 2020),
            new Buku08("B002", "Basisdata", 2019),
            new Buku08("B003", "Pemrograman", 2021),
            new Buku08("B004", "Fisika", 2024)
        };

        Peminjaman08 [] daftarPeminjaman08 = {
            new Peminjaman08(daftarMahasiswa08[0], daftarBuku08[0], "2024-01-01"),
            new Peminjaman08(daftarMahasiswa08[1], daftarBuku08[1], "2024-01-02"),
            new Peminjaman08(daftarMahasiswa08[2], daftarBuku08[2], "2024-01-03")
        };

        int pilih = -1;
        while (pilih != 0) {
            System.out.println("=== Sistem Peminjaman Ruang Baca ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa08 m : daftarMahasiswa08) {
                        m.tampilkanInfo();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku08 b : daftarBuku08) {
                        b.tampilkanInfo();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Daftar Peminjaman:");
                    for (Peminjaman08 p : daftarPeminjaman08) {
                        p.tampilkanInfo();
                        System.out.println();
                    }
                    break;
                case 4:
                    insertionSort(daftarPeminjaman08);
                    System.out.println("Peminjaman telah diurutkan berdasarkan NIM.");
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang ingin dicari: ");
                    String nim = sc.next();
                    sequentialSearch(daftarPeminjaman08, nim);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

    }
}
}