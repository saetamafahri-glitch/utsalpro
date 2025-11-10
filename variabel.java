import java.util.Scanner;

public class PerkenalanDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Assalamu'alaikum");
        System.out.println("Izinkan saya memperkenalkan diri\n");

        System.out.print("Nama Lengkap          : ");
        String nama = input.nextLine();

        System.out.print("Tempat & Tanggal Lahir: ");
        String ttl = input.nextLine();

        System.out.print("Jenis Kelamin         : ");
        String jk = input.nextLine();

        System.out.print("Alamat Lengkap        : ");
        String alamat = input.nextLine();

        System.out.print("No Hp                 : ");
        String noHp = input.nextLine();

        System.out.print("Penghasilan Sebulan   : ");
        String penghasilan = input.nextLine();

        System.out.println("\n==============================");
        System.out.println("Perkenalan Diri Anda");
        System.out.println("==============================");
        System.out.println("Nama Lengkap          : " + nama);
        System.out.println("Tempat & Tanggal Lahir: " + ttl);
        System.out.println("Jenis Kelamin         : " + jk);
        System.out.println("Alamat Lengkap        : " + alamat);
        System.out.println("No Hp                 : " + noHp);
        System.out.println("Penghasilan Sebulan   : " + penghasilan);
        System.out.println("==============================");

        input.close();
    }
}
