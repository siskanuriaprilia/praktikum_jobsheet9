import java.util.Scanner;

public class ArrayRataNilai27 {

    public  static void main(String [] args) {
        Scanner input27 = new Scanner(System.in);

        int[] nilaiMhs = new int [10];
        double total = 0;
        double rata_Rata;
        int lulusCount = 0;

        for (int i = 0; i< nilaiMhs.length; i++)
        {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs [i] = input27.nextInt();
            if (nilaiMhs[i] > 70);
            {
                lulusCount++;
            }
        }
        {
            for (int i = 0; i < nilaiMhs.length; i++)
            {
                total += nilaiMhs[i];
            }
        }
        rata_Rata = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata_Rata);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulusCount);
    }
}   
