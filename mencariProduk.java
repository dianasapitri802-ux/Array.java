import java.util.Scanner;

public class mencariProduk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] produk = {101, 105, 110, 115, 120, 125};
        System.out.print("Mauskkan kode produk: ");
        int cari = input.nextInt();
        
        boolean ditemukan = false;
        int jumlahPeriksa = 0;

        for (int i = 0; i < produk.length; i++) {
            jumlahPeriksa++;
            if (produk[i] == cari) {
                System.out.println("Produk ditemukkan!");
                System.out.println("Indeks: " + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Produk tidak tersedia.");
        }

        System.out.println("Jumlah elemen diperikksa: " + jumlahPeriksa);

        input.close();

    }
}
