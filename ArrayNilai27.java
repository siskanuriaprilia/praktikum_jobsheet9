import java.util.Scanner;

public class ArrayNilai27 {

    public  static void main(String [] args) {
        Scanner input27 = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) 
        {
            System.out.println("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = input27.nextInt();
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
    }
}
