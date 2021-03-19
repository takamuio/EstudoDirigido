
package com.mycompany.estudodirigido;
import java.util.Scanner;
public class Animal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Cachorro c1 = new Cachorro();
        Papagaio p1 = new Papagaio();
        Mosca m1 = new Mosca();
        
        String especie, cor;
        
        System.out.println("Digite a cor do pelo do cachorro: ");
        c1.setCorPelo(ler.nextLine());
        System.out.println("O doguinho é: "+ c1.getCorPelo());
        
        System.out.println("Digite a cor da pena do papagaio: ");
        p1.setCorPena(ler.nextLine());
        System.out.println("O doguinho é: "+ p1.getCorPena());
        
        System.out.println("Digite a quantidade de patas da mosca: ");
        m1.setQtdPatas(ler.nextInt());
        System.out.println("O doguinho é: "+ m1.getQtdPatas());
    }
    
}
