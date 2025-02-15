package ATV3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a placa do Veiculo: ");

        String Placa = scanner.next();

        System.out.println("Digite a Cor do veiculo: ");
        String cor = scanner.next();

        System.out.println("Informe o Numeros de Passageiro: ");
        int NumerosdePassageiros = scanner.nextInt();

        System.out.println("Informe a Capacidade do tanque: ");
        int capacidadedetanque = scanner.nextInt();

        System.out.println("Informe a Velocidade maxima do veiculo: ");
        int velocidadeMaxima = scanner.nextInt();

        System.out.println("Informe o Consumo medio: ");
        double consumoMedio = scanner.nextDouble();

        Veiculo veiculo = new Veiculo(Placa, cor, NumerosdePassageiros, capacidadedetanque, velocidadeMaxima,
                velocidadeMaxima);


                System.out.println("Digite O nome Do cliente: ");
                String Nome = scanner.next();
                
                System.out.println("Digite a Idade: ");
                int Idade = scanner.nextInt();
        
                System.out.println("Informe o CPF: ");
                int CPF = scanner.nextInt();
        
                System.out.println("Informe o Endereco: ");
                String Endereco = scanner.next();
        
                System.out.println("Informe a telefone: ");
                int Telefone = scanner.nextInt();
        
               Cliente cliente = new Cliente(Nome, Idade, CPF, Endereco, Telefone);

        
               System.out.println("\n ----- Informacao do CLiente -------");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("CPF: " + cliente.getCPF());
        System.out.println("Endereco: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());
        
                
        System.out.println("\n ----- Informacao do Carro -------");
        System.out.println("\n Informacoes do carro: ");
        System.out.println("Placa:" + veiculo.getPlaca());
        System.out.println("cor:" + veiculo.getCor());
        System.out.println("NumerodePassageiros: " + veiculo.getNumerosdePassageiros());
        System.out.println("capacidadedetanque: " + veiculo.getCapacidadedetanque());
        System.out.println("velocidadeMaxima: " + veiculo.getVelocidadeMaxima());
        System.out.println("consumoMedio: " + veiculo.getConsumoMedio());
}
}