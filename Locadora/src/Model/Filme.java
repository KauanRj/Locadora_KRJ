package Model;

public class Filme {

    private String titulo;
    private String genero;
    private Double valor;

    public Filme(String titulo, Double valor, String genero) {
        this.titulo = titulo;
        this.valor = valor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public  void exibirDetalhes(){
        System.out.println("Filme:");
        System.out.println(getTitulo() + ", "+ getGenero() + ", "+ getValor());

    }

    public void aplicarDesconto(){
        double desc = this.valor -10;

        System.out.println("Valor com desconto é " + desc);

    }


}
