public class Mahasiswa08 {
    String nim; // nomor induk mahasiswa
    String nama; // nama mahasiswa
    String prodi; // program studi mahasiswa

    // constructor:dipanggil saat object mahasiswa dibuat
    public Mahasiswa08(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // menampilkan data mahasiswa ke layar
    void tampilkanInfo() {
        System.out.print("| NIM: " + nim);
        System.out.print("| Nama: " + nama);
        System.out.print("| Prodi: " + prodi);
    }

}
