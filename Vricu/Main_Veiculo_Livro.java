package Vricu;

import java.util.Scanner;

public class Main_Veiculo_Livro {
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

        Veiculo veiculo = new Veiculo(Placa, cor, NumerosdePassageiros, capacidadedetanque, velocidadeMaxima, velocidadeMaxima);

  
        System.out.println("----Entrando na Parte do Livro----");

        

        System.out.println("Digite o Titulo do Livro: ");
        String Titulo = scanner.next();
        
        System.out.println("Digite o Nome do Autor: ");
        String Autor = scanner.next();

        System.out.println("Informe o isbn do Livro: ");
        String isbn  = scanner.next();

        System.out.println("Informe o numeros de paginas: ");
        int NumeroDePaginas = scanner.nextInt();

        System.out.println("Informe o valor de compra: ");
        int ValorDeCompra = scanner.nextInt();


        Livro livro = new Livro(Titulo, Autor, isbn, NumeroDePaginas, ValorDeCompra);
        
        
        System.out.println("\n Informacoes do carro: ");
        System.out.println("Placa:" + veiculo.getPlaca());
        System.out.println("cor:" + veiculo.getCor());
        System.out.println("NumerodePassageiros: " + veiculo.getNumerosdePassageiros());
        System.out.println("capacidadedetanque: " + veiculo.getCapacidadedetanque());
        System.out.println("velocidadeMaxima: " + veiculo.getVelocidadeMaxima());
        System.out.println("consumoMedio: " + veiculo.getConsumoMedio());

       System.out.println("\n");

        System.out.println("\n Informacoes do livro: ");
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("isbn: " + livro.getIsbm());
        System.out.println("NumeroDePaginas: " + livro.getNumeroDePaginas());
        System.out.println("Valor de Compra: " + livro.getValorDeCompra());

    }
    

}
