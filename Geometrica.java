/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategydesignpattern;

/**
 *
 * @author Carolina0110
 */
public class Geometrica implements ICalcMedia {
    @Override
    public double CalculaMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String Situacao(double p1, double p2) {
        if (CalculaMedia(p1, p2) > 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
