import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v1, v2, v3;

        System.out.println("Digite um valor: ");
        v1 = sc.nextDouble();

        System.out.println("Digite um valor: ");
        v2 = sc.nextDouble();

        System.out.println("Digite um valor: ");
        v3= sc.nextDouble();

        if (v1!=v2 && v1!=v3 && v2!=v3) {
            if (v1<v2 && v1<v3){
                System.out.println("menor = " + v1);
            }
            else {
                if (v2<v3){
                    System.out.println("menor = " + v2);
                }
                else {
                    System.out.println("menor = " + v3);
                }
            }
        }
        else {
            System.out.println("errou feio");
        }
    }
}
