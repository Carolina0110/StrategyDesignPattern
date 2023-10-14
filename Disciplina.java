/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategydesignpattern;

/**
 *
 * @author Carolina0110
 */
public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private ICalcMedia calculoMedia;

    public Disciplina(ICalcMedia calculoMedia) {
        this.calculoMedia = calculoMedia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void CalcularMedia() {
        this.media = calculoMedia.CalculaMedia(p1, p2);
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return calculoMedia.Situacao(p1, p2);
    }
}