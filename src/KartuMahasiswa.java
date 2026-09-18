import java.util.Scanner;
public class KartuMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nik = input.nextLong();
        int umur = input.nextInt();
        double tinggiBadan = input.nextDouble();
        char golonganDarah = input.next().charAt(0);
        boolean sudahMenikah = input.nextBoolean();

        input.nextLine();

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