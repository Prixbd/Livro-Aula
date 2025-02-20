import java.util.Scanner;

public class MainCliente {
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

//endereco endereco1 = new endereco("Rua A", 6, "Salvador");
//cliente cliente1 = new cliente("Marta", 26, "endereco1");

//System.out.println(cliente1.toString());


//2

cliente cliente2 = new cliente("jose", 50, 
new endereco("Rua A", 7, "Salvador"));

System.out.println(cliente2.toString());

}
}
