import java.util.Scanner;
public class CaseMethod_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiUTS_1, nilaiUAS_1, nilaiTugas_1,
            nilaiUTS_2, nilaiUAS_2, nilaiTugas_2,
            nilaiUTS_3, nilaiUAS_3, nilaiTugas_3,
            kuis1_1, kuis1_2, kuis2_1, kuis2_2, kuis3_1, kuis3_2,
            totalKuis_1, totalKuis_2, totalKuis_3;
        double uts=0.2, uas=0.2, tugas=0.3, kuis= 0.3,
               nilaiAkhir_1, nilaiAkhir_2, nilaiAkhir_3, avg_nilai_akhir;
        String namaMhs, nim, nilaiHuruf_1, nilaiHuruf_2, nilaiHuruf_3,
               status_1, status_2, status_3, statusAkhir;

        System.out.println("<<<<<INPUT DATA MAHASISWA>>>>");
        System.out.print("Nama Mahasiswa: >");
        namaMhs = sc.nextLine();
        System.out.print("Masukkan NIM  : >");
        nim = sc.nextLine();

        System.out.println("<<Algoritma dan Pemrograman>>");
        System.out.print("Input nilai UTS  : >");
        nilaiUTS_1= sc.nextInt();
        System.out.print("Input nilai UAS  : >");
        nilaiUAS_1 = sc.nextInt();
        System.out.print("Input nilai Tugas: >");
        nilaiTugas_1 = sc.nextInt();
        System.out.print("Input nilai kuis 1: >");
        kuis1_1 = sc.nextInt();
        System.out.print("Input nilai kuis 2: >");
        kuis1_2 = sc.nextInt();
        totalKuis_1 = (kuis1_1+kuis1_2) / 2;
        nilaiAkhir_1 = (nilaiUTS_1 * uts) + (nilaiUAS_1 * uas) + (nilaiTugas_1 * tugas) + (totalKuis_1 * kuis);

        System.out.println("<<<<<<<<Struktur Data>>>>>>>");
        System.out.print("Input nilai UTS  : >");
        nilaiUTS_2 = sc.nextInt();
        System.out.print("Input nilai UAS  : >");
        nilaiUAS_2 = sc.nextInt();
        System.out.print("Input nilai Tugas: >");
        nilaiTugas_2 = sc.nextInt();
        System.out.print("Input nilai kuis 1: >");
        kuis2_1 = sc.nextInt();
        System.out.print("Input nilai kuis 2: >");
        kuis2_2 = sc.nextInt();
        totalKuis_2 = (kuis2_1+kuis2_2) / 2;
        nilaiAkhir_2 = (nilaiUTS_2 * uts) + (nilaiUAS_2 * uas) + (nilaiTugas_2 * tugas)  + (totalKuis_2 * kuis);

        System.out.println("<<<<<<<<Java>>>>>>>");
        System.out.print("Input nilai UTS  : >");
        nilaiUTS_3 = sc.nextInt();
        System.out.print("Input nilai UAS  : >");
        nilaiUAS_3 = sc.nextInt();
        System.out.print("Input nilai Tugas: >");
        nilaiTugas_3 = sc.nextInt();
        System.out.print("Input nilai kuis 1: >");
        kuis3_1 = sc.nextInt();
        System.out.print("Input nilai kuis 2: >");
        kuis3_2 = sc.nextInt();
        totalKuis_3 = (kuis3_1+kuis3_2) / 2;
        nilaiAkhir_3 = (nilaiUTS_3 * uts) + (nilaiUAS_3 * uas) + (nilaiTugas_3 * tugas) + (totalKuis_3 * kuis);
        avg_nilai_akhir= (nilaiAkhir_1 + nilaiAkhir_2 + nilaiAkhir_3) / 3 ;

        if (nilaiAkhir_1 > 80 && nilaiAkhir_1 <=100) {
            nilaiHuruf_1 = "A";
        } else if(nilaiAkhir_1 > 73 && nilaiAkhir_1 <=80){
            nilaiHuruf_1 = "B+";
        } else if(nilaiAkhir_1 > 65 && nilaiAkhir_1 <=73){
            nilaiHuruf_1 = "B";
        } else if(nilaiAkhir_1 > 60 && nilaiAkhir_1 <=65){
            nilaiHuruf_1 = "C+";
        } else if(nilaiAkhir_1 > 50 && nilaiAkhir_1 <=60){
            nilaiHuruf_1 = "C";
        } else if(nilaiAkhir_1 > 39 && nilaiAkhir_1 <=50){
            nilaiHuruf_1 = "D";
        }else if(nilaiAkhir_1 <= 39){
            nilaiHuruf_1 = "E";
        }else{
            nilaiHuruf_1 = "-";
        }

        if (nilaiAkhir_1 >=60) {
            status_1 = "LULUS";
        }else{
            status_1 = "TIDAK LULUS";
        }

        if (nilaiAkhir_2 > 80 && nilaiAkhir_2 <=100) {
            nilaiHuruf_2 = "A";
        } else if(nilaiAkhir_2 > 73 && nilaiAkhir_2 <=80){
            nilaiHuruf_2 = "B+";
        } else if(nilaiAkhir_2 > 65 && nilaiAkhir_2 <=73){
            nilaiHuruf_2 = "B";
        } else if(nilaiAkhir_2 > 60 && nilaiAkhir_2 <=65){
            nilaiHuruf_2 = "C+";
        } else if(nilaiAkhir_2 > 50 && nilaiAkhir_2 <=60){
            nilaiHuruf_2 = "C";
        } else if(nilaiAkhir_2 > 39 && nilaiAkhir_2 <=50){
            nilaiHuruf_2 = "D";
        }else if(nilaiAkhir_2 <= 39){
            nilaiHuruf_2 = "E";
        }else{
            nilaiHuruf_2 = "-";
        }

        if (nilaiAkhir_2 >=60) {
            status_2 = "LULUS";
        }else{
            status_2 = "TIDAK LULUS";
        }


        if (nilaiAkhir_3 > 80 && nilaiAkhir_3 <=100) {
            nilaiHuruf_3 = "A";
        } else if(nilaiAkhir_3 > 73 && nilaiAkhir_3 <=80){
            nilaiHuruf_3 = "B+";
        } else if(nilaiAkhir_3 > 65 && nilaiAkhir_3 <=73){
            nilaiHuruf_3 = "B";
        } else if(nilaiAkhir_3 > 60 && nilaiAkhir_3 <=65){
            nilaiHuruf_3 = "C+";
        } else if(nilaiAkhir_3 > 50 && nilaiAkhir_3 <=60){
            nilaiHuruf_3 = "C";
        } else if(nilaiAkhir_3 > 39 && nilaiAkhir_3 <=50){
            nilaiHuruf_3 = "D";
        }else if(nilaiAkhir_3 <= 39){
            nilaiHuruf_3 = "E";
        }else{
            nilaiHuruf_3 = "-";
        }

        if (nilaiAkhir_3 >=60) {
            status_3 = "LULUS";
        }else{
            status_3 = "TIDAK LULUS";
        }


        if (status_1.equals("LULUS") && status_2.equals("LULUS") && status_3.equals("LULUS")) {
            if (kuis1_1 == 0 || kuis1_2 == 0 || kuis2_1 == 0 || kuis2_2 ==0 || kuis3_1 == 0 || kuis3_2 == 0) {
                statusAkhir = "TIDAK LULUS (ada nilai kuis 0)";
            }else if (avg_nilai_akhir >= 70) {
                statusAkhir = "LULUS";
            } else {
                statusAkhir = "TIDAK LULUS (rata-rata < 70)";
            }
        } else {
            statusAkhir = "TIDAK LULUS";
        }

        System.out.println("========================================================================");
        System.out.println("                         HASIL PENILAIAN AKADEMIK                       ");
        System.out.println("========================================================================");
        System.out.println("Nama Mahasiswa : " + namaMhs);
        System.out.println("NIM            : " + nim);
        System.out.println("========================================================================");
        System.out.println("| No | Mata Kuliah          | UTS | UAS | Tugas | Kuis 1| Kuis 2| Akhir | Huruf | Status|");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("| 1  | Algoritma Pemrograman| " + nilaiUTS_1 + " | " + nilaiUAS_1 + " | " + nilaiTugas_1 + " | " +kuis1_1  + "  | " +  kuis1_2  +" | " + String.format("%.2f", nilaiAkhir_1) + " | " + nilaiHuruf_1 + " | " + status_1 + " |");
        System.out.println("| 2  | Struktur Data        | " + nilaiUTS_2 + " | " + nilaiUAS_2 + " | " + nilaiTugas_2 + " | " +kuis2_1  + "  | " +  kuis2_2  +" | " + String.format("%.2f", nilaiAkhir_2) + " | " + nilaiHuruf_2 + " | " + status_2 + " |");
        System.out.println("| 3  | Java                 | " + nilaiUTS_3 + " | " + nilaiUAS_3 + " | " + nilaiTugas_3 + " | " +kuis3_1  + "  | " +  kuis3_2  +" | " + String.format("%.2f", nilaiAkhir_3) + " | " + nilaiHuruf_3 + " | " + status_3 + " |");
        System.out.println("------------------------------------------------------------------------"); 
        System.out.println(String.format("Rata-rata Nilai Akhir : %.2f", avg_nilai_akhir));
        System.out.println("Status Semester       : " + statusAkhir);
        System.out.println("=========================================================================");
        sc.close();
    }
}