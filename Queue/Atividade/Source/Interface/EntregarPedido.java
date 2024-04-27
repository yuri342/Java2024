package Source.Interface;

import javax.swing.JFrame;

import Source.JavaBeans.Pedido;

public class EntregarPedido extends JFrame {
    Pedido pedido;
    public EntregarPedido(Pedido pedido){
        this.pedido = pedido;
        this.setTitle("EP");
        this.setSize(700, 800);
        this.setLayout(null);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}
