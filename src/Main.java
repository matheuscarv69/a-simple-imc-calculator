import modelo.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("IMC Calculator");

        Pessoa pessoa = solicitarEntradaDeDados(sc);
        pessoa.setImc(calcularImc(pessoa.getPeso(), pessoa.getAltura()));

        String classificacaoImc = classificarImc(pessoa.getImc());

        exibirRelatorio(pessoa, classificacaoImc);

        sc.close();

    }

    public static Pessoa solicitarEntradaDeDados(Scanner sc) {

        System.out.println("Informe seu Nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe seu Peso: ");
        Float peso = sc.nextFloat();

        System.out.println("Informe sua Altura: ");
        Float altura = sc.nextFloat();

        Pessoa pessoa = new Pessoa(nome, peso, altura);

        return pessoa;

    }

    public static Double calcularImc(Float peso, Float altura) {

        Double imc = peso / Math.pow(altura, 2);
        return imc;

    }

    public static void exibirRelatorio(Pessoa pessoa, String classificaoImc) {

        System.out.println();

        System.out.println("Pessoa: " + pessoa.getNome());
        System.out.printf("IMC: %.2f \n", pessoa.getImc());
        System.out.println("Classificação IMC: " + classificaoImc);

    }

    public static String classificarImc(Double imc) {

        if (imc < 18.5) {

            return "MAGREZA";

        } else if (imc > 18.5 && imc < 24.9) {

            return "PESO_NORMAL";

        } else if (imc > 25 && imc < 29.9) {

            return "SOBREPESO";

        } else if (imc > 30 && imc < 34.9) {

            return "OBESIDADE_1";

        } else if (imc > 35 && imc < 40) {

            return "OBESIDADE_2";

        } else {

            return "OBESIDADE_3";

        }

    }


}