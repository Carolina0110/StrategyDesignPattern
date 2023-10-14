/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategydesignpattern;

/**
 *
 * @author Carolina0110
 */
public class Aritmetica implements ICalcMedia {
    @Override
    public double CalculaMedia(double p1, double p2) {
        return (p1 + p2) / 2;
    }

    @Override
    public String Situacao(double p1, double p2) {
        if (CalculaMedia(p1, p2) > 5.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}