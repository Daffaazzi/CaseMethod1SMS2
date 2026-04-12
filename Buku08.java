public class Buku08 { 
   String kode; //kode unik buku contoh: B001, B002, dst
   String judul;  //judul buku
    int tahunTerbit; //tahun terbit buku

    // constructor: dipanggil saat object buku dibuat
    public Buku08(String kode, String judul, int tahunTerbit) {
        this.kode = kode;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    // menampilkan data buku ke layar
    void tampilkanInfo() {
        System.out.println("| Kode: " + kode);
        System.out.println("| Judul: " + judul);
        System.out.println("| Tahun Terbit: " + tahunTerbit);
    }
}
