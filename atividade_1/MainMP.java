package atividade_1;

public class MainMP {
public static void main(String[] args) {
    
   Processador processador = new Processador("AMD", "X", 3200);
   Memoria memoria = new Memoria("Kigston", "8", 34000, 34000);
   PlacaMae placamae = new PlacaMae("asus", "b650", "AMD4");
   DispositivoArmazenamento dispositivoArmazenamento = new DispositivoArmazenamento("kingston", "SSD", 240, "sla");

    
   
    System.out.println(processador.toString());
    System.out.println(memoria.toString());
    System.out.println(placamae.toString());
    System.out.println(dispositivoArmazenamento.toString());

}
}
