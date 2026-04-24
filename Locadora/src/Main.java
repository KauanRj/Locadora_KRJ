import Model.Aluguel;
import Model.Cliente;
import Model.Filme;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Cliente cliente = new Cliente("kauan","359948549");
    cliente.apresentar();


    Filme filme = new Filme("guerra",30.0,"Ação");
    filme.exibirDetalhes();
    filme.aplicarDesconto();


    Aluguel aluguel = new Aluguel(cliente,filme,10);
    aluguel.calcularTotal();








    }
}