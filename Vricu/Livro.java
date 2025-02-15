package Vricu;

public class Livro {

    private String Titulo;
    private String Autor;
    private String isbm;
    private int NumeroDePaginas;
    private double ValorDeCompra;





    
    public Livro(String titulo, String autor, String isbm, int numeroDePaginas, double valorDeCompra) {
        Titulo = titulo;
        Autor = autor;
        this.isbm = isbm;
        NumeroDePaginas = numeroDePaginas;
        ValorDeCompra = valorDeCompra;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public String getIsbm() {
        return isbm;
    }
    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }
    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }
    public void setNumeroDePaginas(int numeroDePaginas) {
        NumeroDePaginas = numeroDePaginas;
    }
    public double getValorDeCompra() {
        return ValorDeCompra;
    }
    public void setValorDeCompra(double valorDeCompra) {
        ValorDeCompra = valorDeCompra;
    }
    
    

}
