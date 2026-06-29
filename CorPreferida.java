package cores;
import java.util.Scanner;

public class CorPreferida {

    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);

       System.out.println("=== Escolha sua cor preferida ===");
        System.out.println("1 - Azul");
        System.out.println("2 - Vermelho");
        System.out.println("3 - Verde");
        System.out.println("4 - Amarelo");
        System.out.println("5 - Roxo");
        System.out.print("Digite o número da sua escolha: ");

        int opcao = entrada.nextInt();

      switch (opcao) {
            case 1:
                System.out.println("Sua cor preferida é: Azul");
                break;
            case 2:
                System.out.println("Sua cor preferida é: Vermelho");
                break;
            case 3:
                System.out.println("Sua cor preferida é: Verde");
                break;
            case 4:
                System.out.println("Sua cor preferida é: Amarelo");
                break;
            case 5:
                System.out.println("Sua cor preferida é: Roxo");
                break;
            default:
            
                System.out.println("Opção inválida! Escolha um número de 1 a 5.");
        }

    
        entrada.close();
    }
}
