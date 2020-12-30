import java.util.Scanner;

public class Tiket{

	public void JenisTiket() {
    Scanner input = new Scanner(System.in);
       String pesan;

        System.out.println(" ==Jenis Tiket== ");
        System.out.println("================");
        System.out.println(" 1. Reguler      ");
        System.out.println("Harga tiket : 40.000");
        System.out.println("Fasilitas : seat biasa, kualitas dan kenyamanan bagus\n\n");
        System.out.println(" 2. Ultra XD      ");
		    System.out.println("Harga tiket : 50.000");
        System.out.println("fasilitas : sistem audio digital lebih kuat, layar ultra wide, dan tampak lebih nyata\n\n");
        System.out.println(" 3. Gold      ");
        System.out.println("Harga tiket : 100.000");
        System.out.println("fasilitas : suasana lebih eksklusif, seat sofa dengan sandaran, free service, dan paket lengkap\n\n");

            while(true){
            System.out.println("Ingin Memesan ?[y][n]");
            pesan = input.next();
            if(pesan.equalsIgnoreCase("y")){
                Transaksi s = new Transaksi();
                s.MenuTransaksi();
            } else{
                System.exit(0);
            }
        }
    }
}
