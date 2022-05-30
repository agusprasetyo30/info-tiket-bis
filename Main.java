import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rute rute = new Rute();
        System.out.println("Daftar Kota");
        System.out.println("1. Metro");
        System.out.println("2. Jakarta");
        System.out.println("3. Bandung");
        System.out.println("4. Surabaya");
        System.out.println();
        System.out.print("Piih Kota Keberangkatan : ");
        int kotaAsal = scanner.nextInt();
        System.out.print("Pilih Kota Tujuan : ");
        int kotaTujuan = scanner.nextInt();
        if (kotaAsal == 1){
            switch (kotaTujuan){
                case 2:
                    rute.ruteMetro(kotaTujuan);
                    break;
                case 3:
                    rute.ruteMetro(kotaTujuan);
                    break;
                case 4:
                    rute.ruteMetro(kotaTujuan);
                    break;
                default:
                    System.out.println("Rute tidak ditemukan");
                    break;
            }
        } else if (kotaAsal == 2) {
            switch (kotaTujuan){
                case 1:
                    rute.ruteJakarta(kotaTujuan);
                    break;
                case 3:
                    rute.ruteJakarta(kotaTujuan);
                    break;
                case 4:
                    rute.ruteJakarta(kotaTujuan);
                    break;
                default:
                    System.out.println("Rute tidak ditemukan");
                    break;
            }
        } else if (kotaAsal == 3) {
            switch (kotaTujuan){
                case 1:
                    rute.ruteBandung(kotaTujuan);
                    break;
                case 2:
                    rute.ruteBandung(kotaTujuan);
                    break;
                case 4:
                    rute.ruteBandung(kotaTujuan);
                    break;
                default:
                    System.out.println("Rute tidak ditemukan");
                    break;
            }
        } else if (kotaAsal == 4) {
            switch (kotaTujuan){
                case 1:
                    rute.ruteSurabaya(kotaAsal,kotaTujuan);
                    break;
                case 2:
                    rute.ruteSurabaya(kotaAsal,kotaTujuan);
                    break;
                case 3:
                    rute.ruteSurabaya(kotaAsal,kotaTujuan);
                    break;
                default:
                    System.out.println("Rute tidak ditemukan");
                    break;
            }
        } else{
            System.out.println("Rute tidak ditemukan");
        }
    }
}
