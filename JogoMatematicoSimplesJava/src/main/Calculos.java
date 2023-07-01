package main;

import java.util.Random;

public class Calculos {
    private int nivel;
    private int valor1;
    private int valor2;
    private int operacao;
    private int result;

    public Calculos(int nivel) {
        Random random = new Random();
        this.operacao = random.nextInt(4); // 0-somar, 1-diminuir, 2-multiplicar, 3-dividir
        this.nivel = nivel;

        if (nivel == 1) {
            this.valor1 = random.nextInt(10);
            this.valor2 = random.nextInt(10);
        } else {
            this.valor1 = random.nextInt(100);
            this.valor2 = random.nextInt(100);
        }
    }

    public int getNivel() {
        return nivel;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResult() {
        return result;
    }

    public boolean somar(int resposta) {
        this.result = this.getValor1() + this.getValor2();
        boolean acerto = false;

        if (resposta == this.getResult()) {
            System.out.println("Resposta correta!");
            acerto = true;
        } else {
            System.out.println("Estude mais!");
        }
        System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }

    public boolean subtrair(int resposta) {
        this.result = this.getValor1() - this.getValor2();
        boolean acerto = false;

        if (resposta == this.getResult()) {
            System.out.println("Resposta correta!");
            acerto = true;
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }

    public boolean multiplicar(int resposta) {
        this.result = this.getValor1() * this.getValor2();
        boolean acerto = false;

        if (resposta == this.getResult()) {
            System.out.println("Resposta correta!");
            acerto = true;
        } else {
            System.out.println("Resposta errada!");
        }
        System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResult());
        return acerto;
    }
}
