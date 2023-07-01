package view;

import main.Calculos;

import java.util.Scanner;

public class Jogo {
    static Scanner input = new Scanner(System.in);
    static int pontos = 0;
    static Calculos calculos;

    public static void main(String[] args) {
        Jogo.play();
    }

    public static void play() {
        System.out.println("Informe o nível da dificuldade desejado [1 ou 2]: ");
        int nivel = Jogo.input.nextInt();

        Jogo.calculos = new Calculos(nivel);

        System.out.println("Informe o resultado para a seguinte operação: ");

        // Somar
        if (calculos.getOperacao() == 0) {
            System.out.println(calculos.getValor1() + " + " + calculos.getValor2());
            int resposta = Jogo.input.nextInt();

            if (calculos.somar(resposta)) {
                Jogo.pontos += 1;
                System.out.println("Você tem " + Jogo.pontos + " ponto(s).");
            }
        }

        // Subtrair
        if (calculos.getOperacao() == 1) {
            System.out.println(calculos.getValor1() + " - " + calculos.getValor2());
            int resposta = Jogo.input.nextInt();

            if (calculos.subtrair(resposta)) {
                Jogo.pontos += 1;
                System.out.println("Você tem " + Jogo.pontos + " ponto(s).");
            }
        }

        // Multiplicar
        if (calculos.getOperacao() == 2) {
            System.out.println(calculos.getValor1() + " * " + calculos.getValor2());
            int resposta = Jogo.input.nextInt();

            if (calculos.multiplicar(resposta)) {
                Jogo.pontos += 1;
                System.out.println("Você tem " + Jogo.pontos + " ponto(s).");
            }
        }


        if (calculos.getOperacao() < 0 || calculos.getOperacao() > 3) {
            System.out.println("A operação " + calculos.getOperacao() + " não é reconhecida.");
        }

        System.out.println("Deseja continuar? [1 - Sim, 0 - Não]");
        int continuar = Jogo.input.nextInt();

        if (continuar == 1) {
            Jogo.play();
        } else {
            System.out.println("Você fez " + Jogo.pontos + " ponto(s).");
            System.out.println("Até a próxima!");
            System.exit(0);
        }
    }
}
