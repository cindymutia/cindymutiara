import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("## program java konversi suhu  ##");
        System.out.println("==================================");


        double celc, fahr, kelv, ream;

        System.out.print("masukan nilai konversi suhu celsius: ");
        celc = input.nextDouble();
        System.out.println("==================================");
        fahr = (9.0 / 5.0 * celc) + 32;
        kelv = celc + 273.15;
        ream = celc * (4.0 / 5.0);



        System.out.println("==================================");

        System.out.println(celc + "derajat celcius =" + ream + "derajat reamur");

        if (ream % 5 == 0) {
            System.out.println("kelipatan 5");
        } else {
            System.out.println("reamur bukan kelipatan 5");
        }
        if (ream % 2 == 0) {
            System.out.println("reamur kelipatan 2");
        }
        System.out.println("reamur bukan kelipatan 2");
        System.out.println("==================================");
    }


}






















