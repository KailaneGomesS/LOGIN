package telas;

import java.util.ArrayList;
import java.util.List;

public class Calculos {

    public static void main(String args[]) {
        Calculos c = new Calculos();
        System.out.println(">>>>" + c.calculadora("5*5+5"));
        System.out.println(">>>>" + c.calculadora("5*5+5-10%"));
    }

    public String calculadora(String expressao) {
        String resultado;
        List<Double> listaNumeros = obterNumeros(expressao);
        List<Character> listaOperadores = obterOperadores(expressao);
        resultado = calcularValor(listaNumeros, listaOperadores);
        return resultado;
    }

    private String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores) {
        double total = listaNumeros.get(0);
        boolean primeiraOperacao = true;

        for (int i = 0; i < listaOperadores.size(); i++) {
            char operador = listaOperadores.get(i);
            double numero = listaNumeros.get(i + 1);

            if (operador == '%' && i < listaOperadores.size() - 1 && listaOperadores.get(i + 1) == 'x' && primeiraOperacao) 
            {
                total = executarOperacao(total, operador, numero);
                primeiraOperacao = false;
            } else {
                total = executarOperacao(total, operador, numero);
            }
        }

        return String.valueOf(total);
    }

    private double executarOperacao(double numero1, char operador, double numero2) {
        double resultado = 0.0;

        if (operador == '+') {
            resultado = numero1 + numero2;
        } else if (operador == '-') {
            resultado = numero1 - numero2;
        } else if (operador == '/') {
            resultado = numero1 / numero2;
        } else if (operador == 'x') {
            resultado = numero1 * numero2;
        } else if (operador == '%') {
            resultado = (numero1 * numero2) / 100;
        }

        return resultado;
    }

    private List<Double> obterNumeros(String expressao) {
        List<Double> listaNumeros = new ArrayList<>();
        String[] numeros = expressao.split("[+\\-*/x%]");
        for (String numero : numeros) {
            listaNumeros.add(Double.parseDouble(numero));
        }
        return listaNumeros;
    }

    private List<Character> obterOperadores(String expressao) {
        List<Character> listaOperadores = new ArrayList<>();
        for (int i = 0; i < expressao.length(); i++) {
            char caracter = expressao.charAt(i);
            if (isOperador(caracter)) {
                listaOperadores.add(caracter);
            }
        }
        return listaOperadores;
    }

    private boolean isOperador(char caracter) {
        return caracter == '+' || caracter == '-' || caracter == '/' || caracter == 'x' || caracter == '%';
    }
}




