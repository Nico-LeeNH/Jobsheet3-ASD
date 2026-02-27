import java.util.Scanner;

public class DosenDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen20[] arrayOfDosen20 = new Dosen20[3];
        String kode, nama, dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                : ");
            kode = sc.nextLine();
            System.out.print("Nama                : ");
            nama = sc.nextLine();
            while (true) {
                System.out.print("Jenis Kelamin       : ");
                dummy = sc.nextLine();

                if (dummy.equalsIgnoreCase("L")) {
                    jenisKelamin = true;
                    break;
                } else if (dummy.equalsIgnoreCase("P")) {
                    jenisKelamin = false;
                    break;
                } else {
                    System.out.println("Kenis Kelamin Tidak Valid");
                }
            }

            System.out.print("Usia                : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------");

            arrayOfDosen20[i] = new Dosen20(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen20 dosen : arrayOfDosen20) {

            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode           : " + dosen.kode);
            System.out.println("Nama           : " + dosen.nama);
            System.out.println("Jenis Kelamin  : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia           : " + dosen.usia);
            System.out.println("-----------------------");

        }
        DataDosen20.dataSemuaDosen(arrayOfDosen20);
        DataDosen20.jumlahDosenPerJenisKelamin(arrayOfDosen20);
        DataDosen20.rerataUsiaDosenPerJenisKelamin(arrayOfDosen20);
        DataDosen20.infoDosenPalingTua(arrayOfDosen20);
        DataDosen20.infoDosenPalingMuda(arrayOfDosen20);
        sc.close();
    }
}
