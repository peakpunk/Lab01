import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        AirPurifier MI = new AirPurifier();
        MI.printDust_filtered(2);
        MI.printEcomode();
        MI.printSilent();
        System.out.println(MI.silent);
        System.out.println(MI.Dust_filtered);
        System.out.println(MI.Eco_mode);
    }
}