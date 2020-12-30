/**
 * Write a description of class Transaksi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class Transaksi{

    public int MenuTransaksi()
    {
         Scanner input = new Scanner(System.in);
         DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
         DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
         int jum=0, i=0;
         double total_bayar=0;
       
         int [] kode  = new int[5];
         int [] harga = new int[5];
         double [] diskon= new double [5];
         String [] barang = new String[5];
         
         System.out.println("=====PEMBAYARAN FULL PAYMENT=====");
         
         System.out.print("Jumlah tiket : ");
         jum=input.nextInt();
         System.out.println(" ");
         
         for (i=0; i<jum;i++){
              System.out.print("Masukan Jenis Tiket yang diinginkan ");
              kode[i]=input.nextInt();
             
              switch (kode[i]){
                  case 1 : 
                            barang[i]="Reguler  ";
                            harga[i]=40000;
                            break;
                  case 2 : 
                            barang[i]="Ultra XD  ";
                            harga[i]=50000;
                            break;
                  case 3 : 
                            barang[i]="Gold";
                            harga[i]=100000;
                            break;

                  default : 
                            System.out.println("=====FULL PAYMENT=====");
              }
         }
    
          formatRp.setCurrencySymbol("Rp. ");
          formatRp.setMonetaryDecimalSeparator(',');
          formatRp.setGroupingSeparator('.');
          kursIndonesia.setDecimalFormatSymbols(formatRp);
          
          System.out.println(" ");
          System.out.println("No   Nama Tiket             Harga   ");  
           for (i=0; i<jum;i++){ 
                harga[i]=harga[i];
                  System.out.println(i+1+"    "+barang[i]+"   "+kursIndonesia.format(harga[i])); 
                  System.out.println("Transaksi Berhasil!!!");
              }
          System.out.println(" ");

          return 0;
      }
}
