/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.CalculadoraJuros;

/**
 *
 * @author NazgulTorre
 */
public class TesteCalculadoraJuros {
    public static void main(String[] args) {
        //Criação e Instância Objeto da Classe Calculadora de Juros.
        CalculadoraJuros calculadoraJuros = new CalculadoraJuros();
        
    
        //exibindo Teste.
        System.out.println("\n\t\t\t -- CALCULADORA DE JUROS -- \n");
        System.out.printf("CAPITAL: R$%.2f\n JUROS: R$%.2f\n", 1000.0, calculadoraJuros.calcularJuros(1000.0, 10.0, 3.0));
    }
    
}
