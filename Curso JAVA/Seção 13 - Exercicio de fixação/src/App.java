import entities.Clientes;
import entities.OrderItem;
import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        Produto p = new Produto("TV", 1000.0);

        OrderItem oi1 = new OrderItem(1, p.getPreco(), p);

        System.out.println(oi1.getProduto().getNome());
        System.out.println(oi1);

        Clientes cliente = new Clientes("Gabriel", "gabriel@gmail.com", "05/09/2001");
        System.out.println(cliente);

    }
}
