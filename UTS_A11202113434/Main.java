package UTS_A11202113434;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MahasiswaBaru> MahasiswaBaru = new ArrayList<>();
        ArrayList<MahasiswaTransfer> mahasiswaTransfer = new ArrayList<>();
        ArrayList<MahasiswaLulus> mahasiswaLulus = new ArrayList<>();
        ArrayList<MahasiswaAktif> mahasiswaAktif = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        
        do {
        	System.out.println("Menu:");
            System.out.println("1. Mahasiswa Baru");
            System.out.println("2. Mahasiswa Transfer");
            System.out.println("3. Mahasiswa Lulus");
            System.out.println("4. Mahasiswa Aktif");
            System.out.println("5. Keluar");
            
            System.out.print("Masukkan Pilihan: ");
            pilihan = scanner.nextInt();
            	
            switch (pilihan) {
            case 1:
            	 System.out.print("Masukkan jumlah mahasiswa: ");
                 int n2 = scanner.nextInt();

                 for (int i = 0; i < n2; i++) {
                     System.out.println("Data mahasiswa ke-" + (i+1) + ":");
                     System.out.print("Nama: ");
                     String nama = scanner.next();
                     System.out.print("NIM: ");
                     String nim = scanner.next();
                     System.out.print("Semester: ");
                     int semester = scanner.nextInt();
                     System.out.print("Usia: ");
                     int usia = scanner.nextInt();
                     System.out.print("Asal Sekolah: ");
                     String asalSekolah = scanner.next();
                     System.out.print("\n");
                     
                     System.out.print("Masukkan Jumlah KRS: (max 24)");
                     int m = scanner.nextInt();
                     if(m>24){
                        System.out.print("kelebihan Input");
                        break;
                     }
                     
                     String[] krs = new String[m];
                     for (int j = 0; j < m; j++) {
                     	System.out.print("Masukkan Nama Matkul ke - "+(j+1)+": ");
                     	krs[j] = scanner.next();
                     }
                     
                     MahasiswaBaru mhsBaru = new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah);
                     
                     MahasiswaBaru.add(mhsBaru);
                     
                 }
                 
                 System.out.print("\nDaftar Mahasiswa Baru:");
                 for (MahasiswaBaru mhsBaru : MahasiswaBaru) {
                     System.out.print("Info Mahasiswa");
                     mhsBaru.infoMahasiswa();
                     System.out.print("\nKeikutsertaan Ospek: "+mhsBaru.ikutOspek());
                     System.out.print("\nInfo KRS");
                     mhsBaru.infoKrsMahasiwa();
                     System.out.print("\n");
                 }
                 
                break;
            case 2:
            	 System.out.print("Masukkan jumlah mahasiswa: ");
                 int n3 = scanner.nextInt();

                 for (int i = 0; i < n3; i++) {
                     System.out.println("Data mahasiswa ke-" + (i+1) + ":");
                     System.out.print("Nama: ");
                     String nama = scanner.next();
                     System.out.print("NIM: ");
                     String nim = scanner.next();
                     System.out.print("Semester: ");
                     int semester = scanner.nextInt();
                     System.out.print("Usia: ");
                     int usia = scanner.nextInt();
                     System.out.print("Asal Sekolah: ");
                     String asalSekolah = scanner.next();
                     System.out.print("Asal Universitas: ");
                     String asalUniversitas = scanner.next();
                     System.out.print("\n");
                     
                     System.out.print("Masukkan Jumlah KRS: ");
                     int m = scanner.nextInt();
                     
                     String[] krs = new String[m];
                     for (int j = 0; j < m; j++) {
                     	System.out.print("Masukkan Nama Matkul ke - "+(j+1)+": ");
                     	krs[j] = scanner.next();
                     }
                     
                     MahasiswaTransfer mhsTransfer = new MahasiswaTransfer(nim, nama, semester, usia, krs, asalSekolah, asalUniversitas);
                     
                     mahasiswaTransfer.add(mhsTransfer);
                 }
                 
                 System.out.print("\nDaftar Mahasiswa Transfer:");
                 for (MahasiswaTransfer mhsTransfer : mahasiswaTransfer) {
                     System.out.print("Info Mahasiswa");
                     mhsTransfer.infoMahasiswa();
                     System.out.print("\nKeikutsertaan Ospek: "+mhsTransfer.ikutOspek());
                     System.out.print("\nInfo KRS");
                     mhsTransfer.infoKrsMahasiwa();
                     System.out.print("\n");
                 }
                 
                break;
            case 3:
            	System.out.print("Masukkan jumlah mahasiswa: ");
                int n4 = scanner.nextInt();

                for (int i = 0; i < n4; i++) {
                    System.out.println("Data mahasiswa ke-" + (i+1) + ":");
                    System.out.print("Nama: ");
                    String nama = scanner.next();
                    System.out.print("NIM: ");
                    String nim = scanner.next();
                    System.out.print("Semester: ");
                    int semester = scanner.nextInt();
                    System.out.print("Usia: ");
                    int usia = scanner.nextInt();
                    System.out.print("Tahun Wisuda: ");
                    int tahunWisuda = scanner.nextInt();
                  	System.out.print("IPK: ");
                  	float ipk = scanner.nextFloat();
                  	System.out.print("\n");
                  	
                  	System.out.print("Masukkan Jumlah KRS: ");
                    int m = scanner.nextInt();
                  	
                  	String[] krs = new String[m];
                    for (int j = 0; j < m; j++) {
                    	System.out.print("Masukkan Nama Matkul ke - "+(j+1)+": ");
                    	krs[j] = scanner.next();
                    }
                  	
                  	MahasiswaLulus mhsLulus = new MahasiswaLulus(nim, nama, semester, usia, krs, tahunWisuda, ipk);
                    
                    mahasiswaLulus.add(mhsLulus);   	
                }
                
                System.out.print("\nDaftar Mahasiswa Lulus:");
                for (MahasiswaLulus mhsLulus : mahasiswaLulus) {
                    System.out.print("Info Mahasiswa");
                    mhsLulus.infoMahasiswa();
                    System.out.print("\nKeikutsertaan Wisuda: "+mhsLulus.ikutWisuda());
                    System.out.print("\nInfo KRS");
                    mhsLulus.infoKrsMahasiwa();
                    System.out.print("\n");
                }
            	break;
            case 4:
            	// meminta input dari user
                float value;
                int[] nilai;
                	System.out.print("Nama: ");
                	String nama = scanner.next();
                    System.out.print("NIM: ");
                    String nim = scanner.next();
                    System.out.print("Semester: ");
                    int semester = scanner.nextInt();
                    System.out.print("Usia: ");
                    int usia = scanner.nextInt();
                    System.out.print("\n");
                    
                    System.out.print("Masukkan Jumlah KRS: ");
                    int m = scanner.nextInt();
                    
                    String[] krs = new String[m];
                    for (int j = 0; j < m; j++) {
                    	System.out.println("Masukkan Nama Matkul ke - "+(j+1)+": ");
                    	krs[j] = scanner.next();
                    }
                    
                    nilai = new int[m];

                    // Menginput nilai pada array menggunakan loop for
                    for (int k = 0; k < m; k++) {
                        System.out.print("Masukkan nilai ke-" + (k+1) + ": ");
                        nilai[k] = scanner.nextInt();
                    }
                    
                    // membuat objek mahasiswa
                    MahasiswaAktif mhsAktif = new MahasiswaAktif(nim, nama, semester, usia, krs);
                    
                    value = mhsAktif.hitungRataNilai(nilai);
                    
                    // menambahkan objek mahasiswa ke dalam ArrayList
                    mahasiswaAktif.add(mhsAktif);
                
                
             // menampilkan data mahasiswa
                for (MahasiswaAktif mhsAkt : mahasiswaAktif) {
                System.out.print("\nDaftar Mahasiswa:");
                    System.out.print("Info Mahasiswa");
                    mhsAkt.infoMahasiswa();
                    System.out.print("\nInfo KRS");
                    mhsAkt.infoKrsMahasiwa();
                    System.out.print("Rata - rata Nilai: "+value);
                    System.out.print("\n");
                }
            	break;
            case 5:
            	System.out.println("Anda sudah keluar");
            	break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
            }
        } while (pilihan != 5);
    }
}
