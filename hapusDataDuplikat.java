public class hapusDataDuplikat {
    public static void main(String[] args) {
        int[] data = {101, 102, 101, 103, 102, 104, 105, 103};
        int[] unik = new int[data.length];
        int jumlah = 0;

        // 1 dan 2. mencari data duplikat dan menyimpan data unik
        System.out.println("Nomor peserta duplikat: ");
        for (int i = 0; i < data.length; i++);
        boolean ada = false;

        int i = 0;
        for (int j = 0; i < jumlah;) {
            if (data[i] == unik[j]) {
            }

            ada = true;
            break;
        }
    

    if (ada) {
        System.out.println(data[i]);
    } else {
        unik[jumlah] = data[i];
        jumlah++;
    }
    
    //3. menampilkan array hasil 
    System.out.print("Array setelah dupilkat dihapus: ");
    int jumlah1 = 0;
    for (int i1 = 0; i1 < jumlah1; i++) {
        System.out.print(unik[i] + " ");
    }

    System.out.println("Jumlah peserta unik: " + jumlah);
}
}

