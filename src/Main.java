import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cliente> listaClientes = new ArrayList<Cliente>();

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        listaClientes.add(venilton);

        Cliente lorran = new Cliente();
        lorran.setNome("Lorran");
        listaClientes.add(lorran);

        Conta ccVenilton = new ContaCorrente(venilton);
        Conta poupancaVenilton = new ContaPoupanca(venilton);

        ccVenilton.depositar(100);
        ccVenilton.transferir(100, poupancaVenilton);

        ccVenilton.imprimirExtrato();
        poupancaVenilton.imprimirExtrato();

        System.out.println("\nLista de Clientes:");
        listaClientes.forEach(item -> System.out.printf("%s\n", item.getNome()));

    }

}