import java.util.Scanner;

public class LinearSearch27 {
    public  static void main(String [] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array : ");
        int jumlahElemen = input27.nextInt();
        int[] arrayInt = new int[jumlahElemen];

        for (int i= 0; i < jumlahElemen; i++)
        {
        System.out.println("Masukkan elemen array ke-"+i+": ");
        arrayInt[i] = input27.nextInt();
        }
        System.out.println("Masukkan key yang ingin dicari : ");
        int key = input27.nextInt();

        int hasil = -1;
        for (int i = 0; i < jumlahElemen; i++)
        {
            if (arrayInt[i] == key)
            {
                hasil = i;
                break;
            }
        }
        if (hasil != -1)
        {
            System.out.println("Key ada diposisi index ke-" + hasil);
        }
        else
        {
            System.out.println("Key tidak ditemukan dalam array.");
        }
    }
}
