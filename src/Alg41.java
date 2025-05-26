import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Alg41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a,b,c,d;

        List<Integer> pesos = Arrays.asList(1, 2, 3, 4);

        int peso1 = pesos.get(0);

        int peso2 = pesos.get(1);

        int peso3 = pesos.get(2);

        int peso4 = pesos.get(3);

        System.out.println("Digite o primeiro valor: ");

        a = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");

        b = sc.nextDouble();

        System.out.println("Digite o terceiro valor: ");

        c = sc.nextDouble();

        System.out.println("Digite o quarto valor: ");
        

        d = sc.nextDouble(); 

        double mediaPonderada = (a*peso1+b*peso2+c*peso3+d*peso4)/10;

        System.out.println("A media ponderada será: " + mediaPonderada);

        sc.close();
      
    }

}
