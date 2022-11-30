package br.edu.faeterjrio;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Vitória
 */

public final class Hino {
    Scanner in = new Scanner(System.in);
    Scanner ln = new Scanner(System.in);

    private String pais;
    private double duracao;
    private LinkedList<String> instrumentos = new LinkedList<String>();
    private LinkedList<String> vocais = new LinkedList<String>();
        
    // Encapsulamento - get e setter
    
    public String getPais() { 
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public LinkedList<String> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(LinkedList<String> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public LinkedList<String> getVocais() {
        return vocais;
    }

    public void setVocais(LinkedList<String> vocais) {
        this.vocais = vocais;
    }
    

    // Construtores (sobrecarga dele - o mesmo método duas vezes com parâmetros diferentes)
    public Hino(String pais, double duracao, LinkedList<String> instrumentos, LinkedList<String> vocais) {
        this.pais = pais;
        this.duracao = duracao;
        this.instrumentos = instrumentos;
        this.vocais = vocais;
    }
    
    public Hino(String pais, double duracao, LinkedList<String> instrumentos) {
        this.pais = pais;
        this.duracao = duracao;
        this.instrumentos = instrumentos;
    }
    
    public Hino(String pais, double duracao) {
        this.pais = pais;
        this.duracao = duracao;
    }
    
    public Hino(double duracao) {
        this.duracao = duracao;
    }
    
    //Métodos 
    
    public void adicionaInstrumental(LinkedList<String> instrumentos){
        int quantInstrumentos;
        String instrumento;
        System.out.println("Qual a quantidade de instrumentos no hino?");
        quantInstrumentos = in.nextInt();
        int i=1;
        do {
            System.out.println("Insira o nome do instrumento " + i + ":");
            instrumento = ln.nextLine();
            instrumentos.add(instrumento);
            i++;
        } while(i <= quantInstrumentos);
    }
    
    public void adicionaVocal (LinkedList<String> cantores){
        int quantCantores;
        String nomeCantor;
        System.out.println("Quantos cantores? ");
        quantCantores = in.nextInt();
        int i=1;
        do {
            System.out.println("Nome do cantor " + i + ":");
            nomeCantor = ln.nextLine();
            cantores.add(nomeCantor);
            i++;
        } while (i <= quantCantores);
    }
}
