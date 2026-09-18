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
                System.out.println("Silakan masukkan NIK kembali.\n");
            }
        }
        while (String.valueOf(nik).length() != 16);
        input.nextLine();

        System.out.println("Masukkan Umur: ");
        int umur = input.nextInt();

        System.out.println("Masukkan Tinggi Badan: ");
        double tinggiBadan = input.nextDouble();
        input.nextLine();

        System.out.println("Masukkan Golongan Darah: ");
        char golonganDarah = input.next().charAt(0);

        System.out.println("Masukkan Status: ");
        boolean sudahMenikah = input.nextBoolean();

        input.nextLine();

        System.out.println("Masukkan Nama: ");
        String namaLengkap=input.nextLine();

        System.out.println("===== KARTU MAHASISWA =====");
        System.out.println("Nama      : " + namaLengkap);
        System.out.println("NIK       : " + nik);
        System.out.println("Umur      : " + umur + " tahun");
        System.out.println("Tinggi    : " + tinggiBadan + " cm");
        System.out.println("Gol darah : " + golonganDarah);
        System.out.println("Menikah   : " + sudahMenikah);

        input.close();

    }
}