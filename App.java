import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Date TanggalPembelian = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("E dd/MM/yyyy");
        SimpleDateFormat ft2 = new SimpleDateFormat("HH:mm:ss");
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Jakarta"));

        System.out.print("Masukan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukan Nomor HP: ");
        String noHp = scanner.nextLine();

        System.out.print("Masukan Alamat: ");
        String alamat = scanner.nextLine();

        System.out.print("Masukan Kode Barang: ");
        String kodeBarang = scanner.nextLine();

        System.out.print("Masukan Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukan Harga Barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukan Jumlah Barang yang Dibeli: ");
        double jumlahBeli = scanner.nextDouble();

        double totalBayar = hargaBarang * jumlahBeli;

        String kasir = "Bang Toyib";

        String namaSuperMarket = "tarin mart";

        System.out.println("==============================");
        System.out.println(namaSuperMarket.toUpperCase());
        System.out.println("Tanggal\t: " + ft1.format(TanggalPembelian));
        System.out.println("Waktu\t: " + ft2.format(TanggalPembelian) + " " + "WIB");
        System.out.println("==============================");
        System.out.println("data pelanggan".toUpperCase());
        System.out.println("----------------------");
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("No. HP\t\t: " + noHp);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("data pembelian barang".toUpperCase());
        System.out.println("----------------------");
        System.out.println("Kode Barang\t: " + kodeBarang);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Barang\t: " + hargaBarang);
        System.out.println("Jumlah Beli\t: " + jumlahBeli);
        System.out.println("----------------------");
        System.out.println("total bayar\t: ".toUpperCase() + totalBayar);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir: " + kasir);

        scanner.close();

    }

}