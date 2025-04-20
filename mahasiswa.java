public class mahasiswa {
    public String NIM;
    public String nama;
    public String prodi;

    public mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.println("NIM: " + NIM + " | Nama: " + nama + " | Prodi: " + prodi);
    }

    public static void SearchNim(mahasiswa[] mhs, String cari) {
        // Sequential Search
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].NIM.equalsIgnoreCase(cari)) {
                System.out.println("Mahasiswa ditemukan:");
                mhs[i].tampilMahasiswa();
                return;
            }
        } 
        System.out.println("Mahasiswa dengan NIM " + cari + " tidak ditemukan.");
    }
} 
