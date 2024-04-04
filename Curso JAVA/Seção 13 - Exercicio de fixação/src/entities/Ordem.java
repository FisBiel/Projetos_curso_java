package entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Ordem {

    private Date momento;
    private OrderStatus status;

    private Clientes cliente;

    private List<OrderItem> items = new ArrayList<OrderItem>();

    public Ordem() {
    }

    public Ordem(Date momento, OrderStatus status, Clientes cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void remuveItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double soma = 0.0;
        for (OrderItem it : items) {
            soma = soma + it.subTotal();
        }
        return soma;

    }

}
