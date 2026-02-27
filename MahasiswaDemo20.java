public class MahasiswaDemo20 {
    public static void main(String[] args) {

        Mahasiswa20[] arrayOfMahasiswa20 = new Mahasiswa20[3];

        arrayOfMahasiswa20[0] = new Mahasiswa20();
        arrayOfMahasiswa20[0].nim = "123456789";
        arrayOfMahasiswa20[0].nama = "Adi";
        arrayOfMahasiswa20[0].kelas = "TI-2A";
        arrayOfMahasiswa20[0].ipk = (float) 3.8;

        arrayOfMahasiswa20[1] = new Mahasiswa20();
        arrayOfMahasiswa20[1].nim = "12345673450";
        arrayOfMahasiswa20[1].nama = "Padi";
        arrayOfMahasiswa20[1].kelas = "TI-1A";
        arrayOfMahasiswa20[1].ipk = (float) 3.7;

        arrayOfMahasiswa20[2] = new Mahasiswa20();
        arrayOfMahasiswa20[2].nim = "1234234568";
        arrayOfMahasiswa20[2].nama = "Budi";
        arrayOfMahasiswa20[2].kelas = "TI-1B";
        arrayOfMahasiswa20[2].ipk = (float) 4.0;

        System.out.println("NIM     : " + arrayOfMahasiswa20[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa20[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa20[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa20[0].ipk);
        System.out.println("--------------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa20[1].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa20[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa20[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa20[1].ipk);
        System.out.println("--------------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa20[2].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa20[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa20[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa20[2].ipk);
        System.out.println("--------------------------------------------");
    }
}
