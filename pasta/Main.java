import java.util.Scanner;
package 
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Digite o titulo do livro: ");
        String titulo = Scanner.next();
        

        System.out.println("Digite o nome do Autor: ");
        String autor = Scanner.next();

        Livro livro1 = new Livro (titulo, autor, numerosDePaginas:300, preco:11.50, isbm:"5454354354-3425");





        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Titulo: " + livro1.getAutor());
        System.out.println("Titulo: " + livro1.getNumerosDePaginas());
        System.out.println("Titulo: " + livro1.getPreco());
    }
}
