package Source.JavaBeans;

import java.util.ArrayList;

public class Pedido {
    private String Placa;
    private ArrayList<Object> ItemsDoPedido;
    private float ValorTotal;
    private String Status;

    public Pedido(){
        ItemsDoPedido = new ArrayList<Object>();
    }

    public void queue(Object obj) {
        ItemsDoPedido.add(obj);
    }

    public Object dequeue() {
        Object temp = ItemsDoPedido.get(0);
        ItemsDoPedido.remove(0);
        return temp;
    }

    public boolean isEmpty() {
        if (ItemsDoPedido.isEmpty())
            return true;
        else
            return false;

    }

    public int size() {
        return ItemsDoPedido.size();
    }

    public boolean hasMoreElements() {
        if (ItemsDoPedido.size() > 0)
            return true;
        else
            return false;

    }

    public ArrayList<Object> getItemsDoPedido() {
        return ItemsDoPedido;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getStatus() {
        return Status;
    }

    public float getValorTotal() {
        return ValorTotal;
    }

    public void setItemsDoPedido(ArrayList<Object> itemsDoPedido) {
        ItemsDoPedido = itemsDoPedido;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setValorTotal(float valorTotal) {
        ValorTotal = valorTotal;
    }
}
