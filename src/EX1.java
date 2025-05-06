import java.text.DecimalFormat;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("0.00");

        double diaria, taxaservico, dias,valortotal;

        System.out.println("Numero de diarias: ");
        dias = sc.nextDouble();

        diaria=250*dias;

        if (dias>15){
            taxaservico=15.5*dias;
        }

        else{
            if (dias==15){
                taxaservico=36*dias;
            }
            else {
                taxaservico = 58 * dias;
            }
        }

        valortotal=diaria+taxaservico;
        System.out.println("O valor da taxa" + taxaservico);
        System.out.println("O valor da estadia foi " + df.format(valortotal));





    }
}
