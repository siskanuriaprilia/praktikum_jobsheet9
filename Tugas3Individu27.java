import java.util.Scanner;

public class Tugas3Individu27 {

    public  static void main(String [] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen dalam array: ");
        int banyakElemen = input27.nextInt();
        

        int[] array = new int[banyakElemen];

        for (int i = 0; i < banyakElemen; i++) 
        {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = input27.nextInt();
        }

        int nilaiTertinggi = array[0];
        int nilaiTerendah = array[0];
        int total = array[0];
        
        for (int i = 1; i < banyakElemen; i++) 
        {
            if (array[i] > nilaiTertinggi) {
                nilaiTertinggi = array[i];
            }
            if (array[i] < nilaiTerendah) {
                nilaiTerendah = array[i];
            }
            total += array[i];
        }

        double rataRata = (double) total / banyakElemen;
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-rata: " + rataRata);

    }
}
