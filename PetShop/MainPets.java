package PetShop;

public class MainPets {
public static void main(String[] args) {
    
  ClientePets cliente = new ClientePets("Jorgin", 25,
  new Pets("Mike", 4, "Viralata")) ; 

  System.out.println(cliente.toString());
}
}
