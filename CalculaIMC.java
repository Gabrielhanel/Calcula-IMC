import java.util.Scanner;

public class CalculaIMC {

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.println("Digite o seu gênero: (M): Masculino; (F): Feminino; (N): Não desejo informar");
        char genero = lerTeclado.next().charAt(0);
        lerTeclado.nextLine();

        System.out.println("Digite a sua altura:");
        double altura = lerTeclado.nextDouble();
        lerTeclado.nextLine();

        System.out.println("Digite o seu peso: ");
        int peso = lerTeclado.nextInt();
        lerTeclado.nextLine();

        double calculoimc = peso / (altura * altura);

        if (genero == 'M') {
            if (calculoimc <= 40)
                {
                System.out.println("Obesidade Mórbida");}

            else if (calculoimc > 40 && calculoimc <= 30) {
                System.out.println("Obesidade moderada");
            }

            else if (calculoimc > 30 && calculoimc <= 25 ) {
                System.out.println("Obesidade leve");
            }

            else if (calculoimc > 25 && calculoimc <= 20) {
                System.out.println("Normal");
            }
            else if (calculoimc > 20) {
                System.out.println("Abaixo do normal");
            }
        }
        if (genero == 'F' || genero == 'N') {
            if (calculoimc <= 39)
                {
                System.out.println("Obesidade Mórbida");}

            else if (calculoimc > 39 && calculoimc <= 29 ) {
                System.out.println("Obesidade moderada");
            }

            else if (calculoimc > 29 && calculoimc <= 24 ) {
                System.out.println("Obesidade leve");
            }

            else if (calculoimc > 24 && calculoimc <= 19) {
                System.out.println("Normal");
            }
            else if (calculoimc > 19) {
                System.out.println("Abaixo do normal");
            }
        }
            
    }
}