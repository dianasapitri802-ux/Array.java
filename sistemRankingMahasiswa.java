public class sistemRankingMahasiswa {
    public static void main(String[] args) {
        int[] nilai = {78, 90, 65, 90,85, 72, 95, 85};

        // 1. mengurutkan nilai dari tertinggi ke terendah
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.println("Urutan nilai tertinggi ke terendah: ");
        for (int skor : nilai) {
            System.out.print(skor + " ");
        }
        System.out.println();

        // 2. menampilkan tiga nilai tertinggi yang berbeda
        System.out.println("Tiga nilai tertinggi yang berbeda: ");
        int jumlah = 0;
        int sebelumnya = -1;

        for (int skor : nilai) {
            if (skor != sebelumnya) {
                System.out.print(skor + " ");
                sebelumnya = skor;
                jumlah++;

                if (jumlah == 3){
                    break;
                }
            }
        }
        System.out.println();

    // 3 dan 4. menentukan peringkat dengan nilai yang sama
    System.out.println("Peringkat setiap mahasiswa: ");
    int peringkat = 0;
    int nilaiSebelumnya = -1;

    for (int i = 0; i < nilai.length; i++) {
        if (nilai[i] != nilaiSebelumnya) {
            peringkat = i + 1;
            nilaiSebelumnya = nilai[i];
        }
    
    System.out.println("Nilai" + nilai[i] + " = Peringkat " + peringkat);
    }
}
}
