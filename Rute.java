package InfoTiket;

public class Rute {
    public void ruteMetro(int kotaTujuan){
        switch (kotaTujuan){
            case 2:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Metro - Jakarta");
                System.out.println("Eksekutif");
                System.out.println("Rp.400.000");
                break;
            case 3:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Metro - Bandung");
                System.out.println("Eksekutif");
                System.out.println("Rp.420.000");
                break;
            case 4:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Metro - Surabaya");
                System.out.println("Eksekutif");
                System.out.println("Rp.560.000");
                break;
            default:
                System.out.println();
                System.out.println("Rute tidak ditemukan");
                break;
        }
    }
    public void ruteJakarta(int kotaTujuan){
        switch (kotaTujuan){
            case 1:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Jakarta - Metro");
                System.out.println("Eksekutif");
                System.out.println("Rp.400.000");
                break;
            case 3:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Jakarta - Bandung");
                System.out.println("Eksekutif");
                System.out.println("Rp.300.000");
                break;
            case 4:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Jakarta - Surabaya");
                System.out.println("Eksekutif");
                System.out.println("Rp.450.000");
                break;
            default:
                System.out.println();
                System.out.println("Rute tidak ditemukan");
                break;
        }
    }
    public void ruteBandung(int kotaTujuan){
        switch (kotaTujuan){
            case 1:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Bandung - Metro");
                System.out.println("Eksekutif");
                System.out.println("Rp.320.000");
                break;
            case 2:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Bandung - Jakarta");
                System.out.println("Eksekutif");
                System.out.println("Rp.280.000");
                break;
            case 4:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Bandung - Surabaya");
                System.out.println("Eksekutif");
                System.out.println("Rp.430.000");
                break;
            default:
                System.out.println();
                System.out.println("Rute tidak ditemukan");
                break;
        }
    }
    public void ruteSurabaya(int kotaAsal, int kotaTujuan){
        switch (kotaTujuan){
            case 1:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Surabaya - Metro");
                System.out.println("Eksekutif");
                System.out.println("Rp.560.000");
                break;
            case 2:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Surabaya - Jakarta");
                System.out.println("Eksekutif");
                System.out.println("Rp.450.000");
                break;
            case 3:
                System.out.println();
                System.out.println("5 Juni 2022");
                System.out.println("Surabaya - Jakarta");
                System.out.println("Eksekutif");
                System.out.println("Rp.450.000");
                break;
            default:
                System.out.println();
                System.out.println("Rute tidak ditemukan");
                break;
        }
    }
}
