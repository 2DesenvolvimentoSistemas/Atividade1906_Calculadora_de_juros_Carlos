/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author NazgulTorre
 */
public class CalculadoraJuros {
    public Double calcularJuros(double c, double i, double n){
        return (c * i * n) / 100;
    }
}
