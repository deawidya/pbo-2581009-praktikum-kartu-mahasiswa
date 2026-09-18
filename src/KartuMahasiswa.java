import java.util.Scanner;

public class KartuMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long nik;

        do {
            System.out.print("Masukkan NIK (16 digit): ");
            nik = input.nextLong();

            if (String.valueOf(nik).length() != 16) {
                System.out.print("Peringatan: NIK harus terdiri dari 16 digit!");
                System.out.println(" Silakan masukkan NIK kembali.\n");
            }

        } while (String.valueOf(nik).length() != 16);

        input.nextLine();

        int umur;
        while (true) {
            System.out.print("Masukkan Umur: ");

            try {
                umur = input.nextInt();

                if (umur > 0) {
                    break;
                } else {
                    System.out.println("Peringatan: Umur harus lebih dari 0!");
                }
            }
            catch (Exception e) {
                System.out.println("Peringatan: Umur harus berupa angka!");
                input.nextLine();
            }
        }


        System.out.print("Masukkan Tinggi Badan: ");
        double tinggiBadan = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Golongan Darah: ");
        char golonganDarah = input.next().charAt(0);

        System.out.print("Masukkan Status: ");
        boolean sudahMenikah = input.nextBoolean();

        input.nextLine();

        System.out.print("Masukkan Nama: ");
        String namaLengkap = input.nextLine();


        System.out.println("\n===== KARTU MAHASISWA =====");
        System.out.println("Nama      : " + namaLengkap);
        System.out.println("NIK       : " + nik);
        System.out.println("Umur      : " + umur + " tahun");
        System.out.println("Tinggi    : " + tinggiBadan + " cm");
        System.out.println("Gol darah : " + golonganDarah);
        System.out.println("Menikah   : " + sudahMenikah);

        input.close();
    }
}