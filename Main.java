/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategydesignpattern;

/**
 *
 * @author Carolina0110
 */
public class Main {
    public static void main(String[] args) {
        ICalcMedia calculo = new Aritmetica(); // ou Geometrica
        Disciplina d = new Disciplina(calculo);
        d.setNome("Padroes de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.CalcularMedia();
        System.out.println(
                String.format("P1: %.2f P2: %.2f Media: %.2f Situacao: %s",
                        d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }
}