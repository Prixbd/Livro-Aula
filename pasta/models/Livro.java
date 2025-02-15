public class Livro {

    private String titulo;
    private String autor;
    private int numerosDePaginas;
    private int paginas;
    private double preco;
    private String isbm;








    
    public Livro(String titulo, String autor, int numerosDePaginas, int paginas, double preco, String isbm) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerosDePaginas = numerosDePaginas;
        this.paginas = paginas;
        this.preco = preco;
        this.isbm = isbm;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumerosDePaginas() {
        return numerosDePaginas;
    }
    public void setNumerosDePaginas(int numerosDePaginas) {
        this.numerosDePaginas = numerosDePaginas;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getIsbm() {
        return isbm;
    }
    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }








    
    
    }

