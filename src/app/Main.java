package app;
import model.ContaCorrente;
import service.ContaService;
import exception.SaldoInsuficienteException;
import java.io.IOException;
import javax.swing.*;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaService cs = new ContaService();


        try {
            ContaCorrente conta = cs.lerConta("conta.txt");
            System.out.println("\nconta.txt carregada com sucesso!");
            conta.imprimirDados();

            System.out.print("\nInsira um valor para o saque: ");
            double valor = scanner.nextDouble();

            try {
                cs.sacarValor(conta, valor);
                System.out.println("\nSaque realizado com sucesso!");
                System.out.println("\nConta atualizada: ");
                conta.imprimirDados();
            } catch (SaldoInsuficienteException e) {
                System.out.println("\nErro: " + e.getMessage());
            }

            cs.atualizarConta(conta, "conta_atualizada.txt");

        } catch (IOException e){
            System.out.println("\nErro ao acessar arquivo: "+e.getMessage());
        };
    }
}