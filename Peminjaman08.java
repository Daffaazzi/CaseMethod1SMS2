public class Peminjaman08 {
    Mahasiswa08 mahasiswa;
    Buku08 buku;
    String tanggalPinjam;

    public Peminjaman08(Mahasiswa08 mahasiswa, Buku08 buku, String tanggalPinjam) {
        this.mahasiswa = mahasiswa;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
    }

    void tampilkanInfo() {
        System.out.println("Informasi Peminjaman:");
        mahasiswa.tampilkanInfo();
        buku.tampilkanInfo();
        System.out.println("Tanggal Pinjam: " + tanggalPinjam);
    }

    int hitungDenda(int hariTerlambat) {
        if (hariTerlambat > 0) {
            return hariTerlambat * 5000; 
            
        }else {
        return 0;
    }
}
}