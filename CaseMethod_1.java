import java.util.Scanner;
public class CaseMethod_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double uts=0.3, uas=0.4, tugas=0.3;
        String nilaiHuruf_1, nilaiHuruf_2, status_1, status_2, statusAkhir;

        System.out.print("Nama Mahasiswa: >");
        String namaMhs = sc.nextLine();
        System.out.print("Masukkan NIM: >");
        String nim = sc.nextLine();

        System.out.println("Mata Kuliah 1: Algoritma dan Pemrograman");
        System.out.print("Input nilai UTS: >");
        int nilaiUTS_1= sc.nextInt();
        System.out.print("Input nilai UAS: >");
        int nilaiUAS_1 = sc.nextInt();
        System.out.print("Input nilai Tugas: >");
        int nilaiTugas_1 = sc.nextInt();
        double nilaiAkhir_1 = (nilaiUTS_1 * uts) + (nilaiUAS_1 * uas) + (nilaiTugas_1 * tugas);

        System.out.println("Mata Kuliah 2: Struktur Data");
        System.out.print("Input nilai UTS: >");
        int nilaiUTS_2 = sc.nextInt();
        System.out.print("Input nilai UAS: >");
        int nilaiUAS_2 = sc.nextInt();
        System.out.print("Input nilai Tugas: >");
        int nilaiTugas_2 = sc.nextInt();
        double nilaiAkhir_2 = (nilaiUTS_2 * uts) + (nilaiUAS_2 * uas) + (nilaiTugas_2 * tugas);
        double avg_nilai_akhir= (nilaiAkhir_1 + nilaiAkhir_2) / 2 ;

        if (nilaiAkhir_1 > 80 && nilaiAkhir_1 <=100) {
            nilaiHuruf_1 = "A";
        } else if(nilaiAkhir_1 > 73 && nilaiAkhir_1 <=80){
            nilaiHuruf_1 = "B+";
        } else if(nilaiAkhir_1 > 73 && nilaiAkhir_1 <=80){
            nilaiHuruf_1 = "B";
        } else if(nilaiAkhir_1 > 65 && nilaiAkhir_1 <=73){
            nilaiHuruf_1 = "C+";
        } else if(nilaiAkhir_1 > 60 && nilaiAkhir_1 <=65){
            nilaiHuruf_1 = "C";
        } else if(nilaiAkhir_1 > 50 && nilaiAkhir_1 <=60){
            nilaiHuruf_1 = "D";
        } else if(nilaiAkhir_1 > 39 && nilaiAkhir_1 <=50){
            nilaiHuruf_1 = "E";
        }else {
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
        } else if(nilaiAkhir_2 > 73 && nilaiAkhir_2 <=80){
            nilaiHuruf_2 = "B";
        } else if(nilaiAkhir_2 > 65 && nilaiAkhir_2 <=73){
            nilaiHuruf_2 = "C+";
        } else if(nilaiAkhir_2 > 60 && nilaiAkhir_2 <=65){
            nilaiHuruf_2 = "C";
        } else if(nilaiAkhir_2 > 50 && nilaiAkhir_2 <=60){
            nilaiHuruf_2 = "D";
        } else if(nilaiAkhir_2 > 39 && nilaiAkhir_2 <=50){
            nilaiHuruf_2 = "E";
        }else {
            nilaiHuruf_2 = "-";
        }

        if (nilaiAkhir_2 >=60) {
            status_2 = "LULUS";
        }else{
            status_2 = "TIDAK LULUS";
        }

        if (status_1.equals("LULUS") && status_2.equals("LULUS")) {
            if (avg_nilai_akhir >= 70) {
                statusAkhir = "LULUS";
            } else {
                statusAkhir = "TIDAK LULUS (rata-rata < 70)";
            }
        } else {
            statusAkhir = "TIDAK LULUS";
        }

        System.out.println("Nama Mahasiswa: "+namaMhs);
        System.out.println("NIM "+nim);
        System.out.println("1. Algoritma Pemrograman");
        System.out.println("Nilai UTS: "+nilaiUTS_1);
        System.out.println("Nilai UAS: "+nilaiUAS_1);
        System.out.println("Nilai Tugas: "+nilaiTugas_1);
        System.out.println("Nilai Akhir: "+nilaiAkhir_1);
        System.out.println("Nilai Huruf: "+nilaiHuruf_1);
        System.out.println("Status "+status_1);
        System.out.println("2. Struktur Data");
        System.out.println("Nilai UTS: "+nilaiUTS_2);
        System.out.println("Nilai UAS: "+nilaiUAS_2);
        System.out.println("Nilai Tugas: "+nilaiTugas_2);
        System.out.println("Nilai Akhir: "+nilaiAkhir_2);
        System.out.println("Nilai Huruf: "+nilaiHuruf_2);
        System.out.println("Status "+status_2);
        System.out.println("Rata-rata nilai akhir: "+avg_nilai_akhir);
        System.out.println("Status Semester: "+statusAkhir);

        sc.close();
    }
}