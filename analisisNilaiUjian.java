public class analisisNilaiUjian {
    public static void main(String[] args) {
        int[] nilai = {75, 80, 65, 90, 55, 85, 70, 95};
        int total = 0;
        int lulus = 0;

        // 1. menghitung rata-rata nilai
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        double rataRata = (double) total / nilai.length;
        System.out.println("Rata-rata nilai: " + rataRata);

        // 2. menampilkan nilai yang lebih besar dari rata-rata
        System.out.println("Nilai di atas rata-rata: ");

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > rataRata) {
                System.out.println(nilai[i]);
            }
        }

        // 3. menghitung jumlah mahasiswa yang lulus
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 70) {
                lulus++;
            }
        }
        System.out.println("Jumlah mahasiswa lulus: " + lulus);

        // 4. menghitung persentase mahasiswa yang lulus
        double persentase = (double) lulus/nilai.length * 100;
        System.out.println("Persentase mahasiswa lulus: " + persentase + "%");
    }
}
