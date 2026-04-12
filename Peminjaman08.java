public class Peminjaman08 {
    Mahasiswa08 mahasiswa;
    Buku08 buku;
    int lamaPinjam;   // lama peminjaman dalam hari
    int terlambat;    // jumlah hari keterlambatan
    int denda;        // total denda
    int batas = 5;    // batas maksimal peminjaman

    public Peminjaman08(Mahasiswa08 mahasiswa, Buku08 buku, int lamaPinjam) {
        this.mahasiswa = mahasiswa;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        // hitung otomatis saat objek dibuat
        terlambat = (lamaPinjam > batas) ? lamaPinjam - batas : 0;
        denda     = terlambat * 2000; // Rp2.000 per hari
    }

    void tampilkanInfo() {
        System.out.println(mahasiswa.nama + " | " + buku.judul +
            " | Lama: " + lamaPinjam +
            " | Terlambat: " + terlambat +
            " | Denda: " + denda);
    }
}