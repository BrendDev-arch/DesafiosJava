import java.util.Scanner;

public class Alg42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double theta,seno,cosseno,tangente,secante,cossecante,cotangente,conversao;

        System.out.println("Dígite um ângulo(em graus): ");

        theta = sc.nextDouble();

        conversao = Math.toRadians(theta);

        seno = Math.sin(conversao);

        cosseno = Math.cos(conversao);
        
        tangente = Math.tan(conversao);

        secante = (1/cosseno);

        cossecante = (1/seno);

        cotangente = (cosseno/seno);

        System.out.println("seno: " + seno);

        System.out.println("cosseno: " + cosseno);

        System.out.println("tangente: " + tangente);

        System.out.println("secante: " + secante);

        System.out.println("cossecante: " + cossecante);

        System.out.println("cotangente: " + cotangente);











    }

}
