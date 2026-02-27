import java.util.Scanner;

public class MataKuliahDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MataKuliah20[] arrayOfMataKuliah20 = new MataKuliah20[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah20.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------");

            arrayOfMataKuliah20[i] = new MataKuliah20(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMataKuliah20.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah20[i].cetakInfo();
            System.out.println("------------------------");
        }
        sc.close();
    }
}
