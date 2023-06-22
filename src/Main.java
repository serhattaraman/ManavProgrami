import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.0;

        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlıcan;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kilosunu girin :");

        kgArmut =input.nextDouble();

        System.out.print("Elma kilosunu girin :");

        kgElma=input.nextDouble();

        System.out.print("Domates kilosunu girin: ");

        kgDomates=input.nextDouble();

        System.out.print("Muz kilosunu girin: ");

        kgMuz= input.nextDouble();

        System.out.print("Patlıcan kilosunu girin: ");

        kgPatlıcan= input.nextDouble();

        double toplam=((kgArmut*armut)+(kgElma*elma)+(kgDomates*domates)+(kgMuz*muz)+(kgPatlıcan*patlıcan));

        System.out.println("Toplam tutar: "+toplam);

    }

}
