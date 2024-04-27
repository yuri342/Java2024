package Source.Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Source.JavaBeans.Pedido;
import Source.JavaBeans.Produtos;

public class EntregarPedido extends JFrame implements ActionListener {
    Pedido pedido;
    ArrayList<Pedido> ListaPedidos;
    JLabel DadoP;
    JLabel NumP;
    JLabel Placa;
    JLabel Pedido;
    JLabel IMG;
    JButton Proximo;
    JButton Entregar;
    JButton VerificarE;
    JButton Sair;
    JTextArea PedidoIN;
    JTextArea PlacaIN;
    JTextArea PedidoText;
    JPanel BG;
    JPanel inputs;
    Pedido tempPE = null;

    public EntregarPedido(ArrayList<Pedido> ListaPedidos) {
        this.ListaPedidos = ListaPedidos;
        DadoP = new JLabel();
        NumP = new JLabel();
        Placa = new JLabel();
        Pedido = new JLabel();
        IMG = new JLabel();
        Proximo = new JButton();
        Entregar = new JButton();
        VerificarE = new JButton();
        Sair = new JButton();
        PedidoIN = new JTextArea();
        PlacaIN = new JTextArea();
        PedidoText = new JTextArea();
        BG = new JPanel();
        inputs = new JPanel();

        DadoP.setFont(new Font("Helvetica", Font.BOLD, 30));
        NumP.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Placa.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Pedido.setFont(new Font("Sans Serif", Font.BOLD, 20));
        Proximo.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Entregar.setFont(new Font("Sans Serif", Font.BOLD, 15));
        VerificarE.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Sair.setFont(new Font("Sans Serif", Font.BOLD, 15));
        DadoP.setText("Dados Do Pedido:");
        NumP.setText("N°Pedido:");
        Placa.setText("Placa:");
        Pedido.setText("Pedido:");
        Proximo.setText("Proximo");
        Entregar.setText("Entregar");
        VerificarE.setText("Verificar Entregas");
        Sair.setText("Sair");
        BG.setBackground(Color.GRAY);
        inputs.setBackground(Color.darkGray);
        Proximo.setBackground(Color.darkGray);
        Entregar.setBackground(Color.darkGray);
        VerificarE.setBackground(Color.darkGray);
        Sair.setBackground(Color.darkGray);
        Proximo.setForeground(Color.white);
        Entregar.setForeground(Color.white);
        VerificarE.setForeground(Color.white);
        Sair.setForeground(Color.white);
        Entregar.setFont(new Font("Sans Serif", Font.BOLD, 15));
        VerificarE.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Sair.setFont(new Font("Sans Serif", Font.BOLD, 15));
        DadoP.setForeground(Color.BLACK);
        NumP.setForeground(Color.white);
        Placa.setForeground(Color.white);
        Pedido.setForeground(Color.white);
        Proximo.setForeground(Color.white);
        IMG.setIcon(new ImageIcon("AtividadeV2/Source/IMGs/fast-deliveryB.png"));
        Proximo.addActionListener(this);
        Entregar.addActionListener(this);
        VerificarE.addActionListener(this);
        Sair.addActionListener(this);
        PedidoIN.setEditable(false);
        PlacaIN.setEditable(false);
        PedidoText.setEditable(false);
        PedidoText.setFont(new Font("Sans Serif", Font.BOLD, 12));
        PlacaIN.setFont(new Font("Sans Serif", Font.BOLD, 12));
        Pedido.setFont(new Font("Sans Serif", Font.BOLD, 12));

        PlacaIN.setBounds(130, 110, 200, 20);
        PedidoIN.setBounds(130, 140, 200, 20);
        inputs.setBounds(40, 95, 340, 500);
        DadoP.setBounds(10, 50, 500, 30);
        NumP.setBounds(50, 110, 100, 15);
        Placa.setBounds(80, 140, 100, 15);
        Pedido.setBounds(50, 200, 200, 20);
        BG.setBounds(0, 0, 700, 800);
        PedidoText.setBounds(60, 250, 300, 300);
        Proximo.setBounds(470, 330, 150, 60);
        VerificarE.setBounds(470, 400, 150, 60);
        Sair.setBounds(470, 470, 150, 60);
        Entregar.setBounds(470, 260, 150, 60);
        IMG.setBounds(420, 20, 256, 256);

        this.add(DadoP);
        this.add(NumP);
        this.add(Placa);
        this.add(Pedido);
        this.add(PedidoIN);
        this.add(PlacaIN);
        this.add(PedidoText);
        this.add(IMG);
        this.add(Entregar);
        this.add(Proximo);
        this.add(VerificarE);
        this.add(Sair);
        this.add(inputs);
        this.add(BG);

        this.ListaPedidos = ListaPedidos;
        this.setTitle("EP");
        this.setSize(700, 650);
        this.setLayout(null);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(VerificarE)) {
            try {
                int T = ListaPedidos.size();
                JOptionPane.showMessageDialog(null, "FALTAM = " + T + " Pedidos", "Número de Pedidos", 2);
            } catch (IndexOutOfBoundsException b) {
                System.out.println("Array Vazio!!!!");
                JOptionPane.showMessageDialog(null, "Não há mais pedidos!!!.", "AVISO-Pedidos", 3);
            }
        }

        if (e.getSource().equals(Sair)) {
            if (this.isVisible() == true) {
                this.setVisible(false);
            } else {
                this.setVisible(true);
            }
        }
        
        if ((e.getSource().equals(Entregar))) {
            try {
                tempPE = ListaPedidos.get(0);
                PedidoText.setText("");
                PedidoIN.setText("");
                PlacaIN.setText("");
                JOptionPane.showMessageDialog(null, "PEDIDO:" + tempPE.getNumeroPedido() + " ENTREGE", "AVISO-Pedidos", 1);
                tempPE.setStatus("Entrege");
            } catch (IndexOutOfBoundsException c) {
                JOptionPane.showMessageDialog(null, "ARRAY VAZIO", "AVISO-Pedidos", 2);
                PedidoText.setText("");
                PedidoIN.setText("");
                PlacaIN.setText("");
            }
        }
        
        if (e.getSource().equals(Proximo)) {
            try {
                tempPE = ListaPedidos.get(0);
                ListaPedidos.remove(0);
                PedidoText.setText("");
                System.out.println(tempPE.getNumeroPedido());
                PedidoIN.setText(tempPE.getPlaca()); // PLACA
                PlacaIN.setText(tempPE.getNumeroPedido()); // PEDIDO
                while (tempPE.hasMoreElements()) {
                    Produtos PRtemp = (Produtos) tempPE.dequeue();
                    String Info = String.format("Produto:%s | QTD:%d | Preço:%.2f", PRtemp.getNome(),
                    PRtemp.getQuantidade(), PRtemp.getPreco() * PRtemp.getQuantidade());
                    PedidoText.append(Info + "\n");
                }
            } catch (IndexOutOfBoundsException a) {
                System.out.println("Array Vazio!!!!");
                JOptionPane.showMessageDialog(null, "Não há mais pedidos!!!.", "AVISO-Pedidos", 3);
            }
        }
    }
}
