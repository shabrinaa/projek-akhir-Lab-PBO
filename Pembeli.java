import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class Pembeli here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pembeli{

    private ArrayList <Film> FilmDewasa1;
    private ArrayList <Film> FilmDewasa2;
    private ArrayList <Film> FilmDewasa3;
    private ArrayList <Film> FilmUmum1;
    private ArrayList <Film> FilmUmum2;
    private ArrayList <Film> FilmUmum3;
    Scanner scan = new Scanner(System.in);    

    public Pembeli()
    {
        FilmDewasa1 = new ArrayList<Film>();
        FilmDewasa2 = new ArrayList<Film>();
        FilmDewasa3 = new ArrayList<Film>();
        FilmUmum1 = new ArrayList<Film>();
        FilmUmum2 = new ArrayList<Film>();
        FilmUmum3 = new ArrayList<Film>();
    }

    public boolean JenisFilm(/*Film Film*/){
        Scanner input = new Scanner(System.in);
        int choose;
        Film Film = new Film();

        System.out.print("Nama : ");
        String nama = input.next();
        System.out.print("Umur : ");
        int umur = input.nextInt();
        System.out.print("Email : ");
        String email = input.next();

            while (true)
            {
                System.out.println(" ==Jenis Film== ");
                System.out.println("================");
                System.out.println(" 1. Dewasa      ");
                System.out.println(" 2. Umum    ");
                System.out.println("=================");
                System.out.print("SILAHKAN DIPILIH : ");
                choose = input.nextInt();

                if(choose == 1 && umur > 18){
                    System.out.println(" Film yang tersedia: " );
                    System.out.println(" 1. Makmum (Horror) " );
                    System.out.println(" 2. Parasite (Thriller) " );
                    System.out.println(" 3. Fast and Furious 8 (Action) " );
                    System.out.print("Film yang ingin dipilih : ");
                    int pilihan1 = input.nextInt(); //pilih 1,2,3

                        if(pilihan1 == 1 && FilmDewasa1.size() < 30 && umur > 18){
                            System.out.println("Film Makmum berhasil ditambahkan!\n\n");
                            return FilmDewasa1.add(Film);
                        }
                            
                        if(pilihan1 == 2 && FilmDewasa2.size() < 30 && umur > 18){
                            System.out.println("Film Parasite berhasil ditambahkan!\n\n");
                            return FilmDewasa2.add(Film);
                        }
                            
                        if(pilihan1 == 3 && FilmDewasa3.size() < 30 && umur > 18){
                            System.out.println("Film Fast and Furious 8 berhasil ditambahkan!\n\n");
                            return FilmDewasa3.add(Film);
                        }else{
                            System.out.println(" Maaf Tidak Ada Pilihan Film ");
                            return false;
                        }         
                    }    

                else if(choose == 2){
                    System.out.println(" Film yang tersedia: " );
                    System.out.println(" 1. Keluarga Cemara " );
                    System.out.println(" 2. Dolittle " );
                    System.out.println(" 3. The SpongeBob Movie  " );
                    System.out.print("Film yang ingin dipilih : ");
                    int pilihan2 = input.nextInt(); //pilih 1,2,3
                            
                        if(pilihan2 == 1 && FilmUmum1.size() < 30){
                            System.out.println("Film Keluarga Cemara berhasil ditambahkan!\n\n");
                            return FilmUmum1.add(Film);
                        }
                             
                        if(pilihan2 == 2 && FilmUmum2.size() < 30){
                            System.out.println("Film Dolittle berhasil ditambahkan!\n\n");
                            return FilmUmum2.add(Film);
                        }
                             
                        if(pilihan2 == 3 && FilmUmum3.size() < 30){
                            System.out.println("Film The SpongeBob Movie berhasil ditambahkan!\n\n");
                            return FilmUmum3.add(Film);
                        }else{
                            System.out.println(" Maaf Tidak Ada Pilihan Film ");
                            return false;
                        }
                    } 
                }
    }

    public static void main(String[] args){
        Pembeli p = new Pembeli();
        p.JenisFilm();
    }
}
