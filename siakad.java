import java.util.Scanner;
public class siakad {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        mahasiswa[] mhs = {
            new mahasiswa("22001", "Ali Rahman", "Informatika"),
            new mahasiswa("22002", "Budi Santoso", "Informatika"),
            new mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };
        matakuliah[] matkul = {
            new matakuliah("MK001", "Struktur Data", 3),
            new matakuliah("MK002", "Basis Data", 3), 
            new matakuliah("MK003", "Desain Web", 3)    
        };
        penilaian[] dataNilai = {
            new penilaian(mhs[0], matkul[0], 80, 85, 90),
            new penilaian(mhs[0], matkul[1], 60, 75, 70),
            new penilaian(mhs[1], matkul[0], 75, 70, 80),
            new penilaian(mhs[2], matkul[1], 85, 90, 95),
            new penilaian(mhs[2], matkul[2], 80, 90, 65)
        };

        int menu=-1; 
        while (menu!=6) { 
            System.out.println(("============= MENU SISTEM AKADEMIK ===============")); 
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("6. Keluar "); 
            System.out.print("Pilih Menu: ");
            menu= input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                System.out.println("Daftar Mahasiswa: ");
                    for (mahasiswa mahasiswa : mhs) {
                        mahasiswa.tampilMahasiswa();                       
                    }
                    break;
                case 2:
                System.out.println("Daftar Mata Kuliah: ");
                    for (matakuliah MataKuliah : matkul) {
                        MataKuliah.tampilMataKuliah();
                    }
                    break;
                case 3:
                System.out.println("Daftar penilaian ");
                    for (penilaian penilaian : dataNilai) {
                        penilaian.tampilDataPenilaian();
                    }
                    break;
                case 4:
                    dataNilai[0].ShortingNilai(dataNilai);
                    for (penilaian nilai : dataNilai) {
                        nilai.tampilDataPenilaian();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cari = input.nextLine(); 
                    mahasiswa.SearchNim(mhs, cari);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem akademik.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    } 

}