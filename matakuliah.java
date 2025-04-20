public class matakuliah {
    public String kodeMK;
    public String namaMK;
    public int sks;

    public matakuliah (String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }
    public void tampilMataKuliah() {
        System.out.println("Kode MK: " + kodeMK + " | Nama: " + namaMK +" | SKS: " + sks);
    }
} 