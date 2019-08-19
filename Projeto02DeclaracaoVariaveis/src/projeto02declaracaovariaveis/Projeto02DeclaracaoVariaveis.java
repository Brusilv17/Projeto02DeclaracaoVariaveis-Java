/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto02declaracaovariaveis;

/**
 *
 * @author mathe
 */
public class Projeto02DeclaracaoVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here/
        
        // Declaração de variáveis
        int idade;
        idade = 30;
        
        int novaIdade = 35;
        
        // Operadores + - / *
        idade = idade +10;
        int divisao = 11 / 2;
        int modulo = 11 % 2;
        
        
        // sout + tab
        System.out.println("Idade: " + idade);
        
        //double e float
        double pi = 3.14;
        
        int x = 20;
        x = x /3;
        System.out.println("Valor de x:" + x);
        
        boolean menorIdade = idade < 18; //true se idade < 18
        System.out.println("Menor  idade: " + menorIdade);
        
        char letraA = 'A';
        System.out.println("Letra: " + letraA);
        
        
    }
    
}
