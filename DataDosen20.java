public class DataDosen20 {
    public static void dataSemuaDosen(Dosen20[] arrayOfDosen) {
        int no = 1;
        for (Dosen20 dosen : arrayOfDosen) {

            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode           : " + dosen.kode);
            System.out.println("Nama           : " + dosen.nama);
            System.out.println("Jenis Kelamin  : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia           : " + dosen.usia);
            System.out.println("-----------------------");

        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria     : " + pria);
        System.out.println("Jumlah Dosen Wanita   : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen20[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jmlPria++;
            } else {
                totalWanita += dosen.usia;
                jmlWanita++;
            }
        }

        if (jmlPria > 0) {
            System.out.println("Rata-rata Pria        : " + (double) totalPria / jmlPria);
        }
        if (jmlWanita > 0) {
            System.out.println("Rata-rata Wanita      : " + (double) totalWanita / jmlWanita);
        }
    }

    public static void infoDosenPalingTua(Dosen20[] arrayOfDosen) {
        Dosen20 tertua = arrayOfDosen[0];

        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }

        System.out.println("Dosen paling tua adalah : ");
        System.out.println("Nama      : " + tertua.nama);
        System.out.println("Usia      : " + tertua.usia);
    }

    public static void infoDosenPalingMuda(Dosen20[] arrayOfDosen) {
        Dosen20 termuda = arrayOfDosen[0];

        for (Dosen20 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }

        System.out.println("Dosen paling muda adalah : ");
        System.out.println("Nama      : " + termuda.nama);
        System.out.println("Usia      : " + termuda.usia);
    }
}
