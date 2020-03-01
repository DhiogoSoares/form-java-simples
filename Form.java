import java.util.*;
import java.lang.String;

public class Form {
    public static void main (String[] args){

    String nome, hobby, profi;
    int idade;

    Scanner getInfo = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
            nome = getInfo.next();

        System.out.print("Informe sua idade: ");
            idade = getInfo.nextInt();

        System.out.print("Insira seu maior hobby: ");
            hobby = getInfo.next();

        System.out.print("Insira sua profissão: ");
            profi = getInfo.next();

        System.out.println("\nPerfil criado no sistema!");
        System.out.println("\n Seu nome é "+nome+
                           "\nVocê tem "+idade+" anos."+
                           "\nVocê é um "+profi+
                            "\nSeu maior hobby é "+hobby);

    }//Fecha main
}//Fecha form
