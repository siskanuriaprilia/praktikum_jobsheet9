import java.util.Scanner;

public class ArrayRataNilai27 {

    public  static void main(String [] args) {
        Scanner input27 = new Scanner(System.in);

        double rata_RataLulus,rata_RataTidakLulus;
        int jumlahMahasiswa;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int lulusCount = 0;
        int tidakLulusCount = 0;

        System.out.println("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input27.nextInt();
        int [] nilaiMhs = new int[jumlahMahasiswa];

        for (int i = 0; i< nilaiMhs.length; i++)
        {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs [i] = input27.nextInt();
            if (nilaiMhs[i] > 70)
            {
                totalLulus += nilaiMhs[i];
                lulusCount++;
            }
            else
            {
                totalTidakLulus += nilaiMhs[i];
                tidakLulusCount++;
            }
        }
        rata_RataLulus = totalLulus / lulusCount;
        rata_RataTidakLulus =totalTidakLulus / tidakLulusCount;
        System.out.println("Rata-rata nilai lulus = "+rata_RataLulus);
        System.out.println("Jumlah mahasiswa yang lulus: " + rata_RataTidakLulus);
    }
}   
