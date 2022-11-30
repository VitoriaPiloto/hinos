package br.edu.faeterjrio;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Vitória
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner ln = new Scanner(System.in);
        
        LinkedList<Hino> hinosPaises = new LinkedList<Hino>();
 
        String pais, instrumental, vocal;
        double duracao;
        int quantPaises;
        System.out.println("Quantos países?");
        quantPaises = in.nextInt();
        for (int i = 0; i < quantPaises; i++) {
            System.out.println("Insira a duração do hino em minutos: ");
            duracao = in.nextDouble();
            
            System.out.println("Insira o nome do país: ");
            pais = ln.nextLine();
            
            System.out.println("Possui instrumental? [SIM/NAO]");
            instrumental = ln.nextLine();
            
            System.out.println("Possui vocal? [SIM/NAO]");
            vocal = ln.nextLine();
            
            Hino hinoPaisBasico = new Hino(pais,duracao);
            
            if ("SIM".equals(instrumental.toUpperCase())){
                LinkedList<String> instrumentos = new LinkedList<String>();
                hinoPaisBasico.adicionaInstrumental(instrumentos);
                Hino hinoPais = new Hino(pais,duracao,instrumentos);
                hinosPaises.add(hinoPais);
            }
            if ("SIM".equals(vocal.toUpperCase())){
                LinkedList<String> cantores = new LinkedList<String>();
                hinoPaisBasico.adicionaVocal(cantores);
                Hino hinoPais = new Hino(pais,duracao,cantores);
                hinosPaises.add(hinoPais);
            }
        }
        exibePais(hinosPaises);
    }
    
    public static void exibePais(LinkedList<Hino> hinosPaises){
        for (int i = 0; i < hinosPaises.size(); i++) {
            System.out.println("----------------");
            System.out.println("\nPAIS: ");
            System.out.println(hinosPaises.get(i).getPais());
            System.out.println("\nDURACAO DO HINO:");
            System.out.println(hinosPaises.get(i).getDuracao());
        }
    }
    
    public static void exibeInstrumentos(LinkedList<String> instrumentos){
        System.out.println("\nINSTRUMENTOS: ");
            for (String instrumento : instrumentos) {
                System.out.println(instrumento);
        }
    }
    
    public static void exibeCantores(LinkedList<String> cantores){
        System.out.println("\nCANTORES: ");
            for (String cantor : cantores) {
                System.out.println(cantor);
            }
    }
}
