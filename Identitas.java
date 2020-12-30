import java.util.Scanner;

public class Identitas{
    public static void main(String[] args)
    {
        //Identitas();
        Pembeli p = new Pembeli();
        p.JenisFilm();
        Tiket t = new Tiket();
        t.JenisTiket();
    }

    public static void Identitas(){
        Scanner input = new Scanner(System.in);
        Scanner inputUser = new Scanner(System.in);
        String pesan;
        Transaksi s = new Transaksi();
        
        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Umur : ");
        int umur = input.nextInt();
        System.out.print("Email : ");
        String email = input.next();

        
        //Transaksi s = new Transaksi();
        //s.MenuTransaksi();
    }
}
