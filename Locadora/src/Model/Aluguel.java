package Model;

public class Aluguel {

    private Cliente cliente;
    private Filme filme;
    private int dias;

    public Aluguel(Cliente cliente, Filme filme, int dias) {
        this.cliente = cliente;
        this.filme = filme;
        this.dias = dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void calcularTotal(){
        double valor = dias * 1.50;

        if (dias > 20){
            valor = valor + 10;
        }
        System.out.println("Preço do dias é: " + valor);
        //valor = valor + filme.getValor();
        //System.out.println("Preço com o filme é: " + valor);

    }

    public String getResumo(){
       return " ";

    }
}
