public class Livro {
    private String titulo;
    private String autor;
    private int codigo;
    private boolean status;

    public Livro(String titulo, String autor, int codigo, boolean status){
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.status = status;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
