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
import javax.swing.JPanel;

import Source.JavaBeans.Pedido;

public class Principal extends JFrame implements ActionListener{
    JPanel BG;
    JLabel Titulo;
    JLabel Img;
    JButton Belp;
    JButton Befp;
    EfetuarPedido EfetuarPedidoTela;
    EntregarPedido EntregarPedidoTela;
    ArrayList<Pedido> ListaPedidos;
    
    public Principal(){
        ListaPedidos = new ArrayList<>();
        BG = new JPanel();
        Titulo = new JLabel();
        Img = new JLabel();
        Belp = new JButton();
        Befp = new JButton();
        EfetuarPedidoTela = new EfetuarPedido(ListaPedidos);
        EntregarPedidoTela = new EntregarPedido(ListaPedidos);
        
        //Caracteristicas
        Titulo.setText("YB-LANCHES - DRIVE THRU");
        Titulo.setFont(new Font("Sans Serif", Font.BOLD, 30));
        Titulo.setForeground(Color.white);
        Belp.setText("Efetuar Pedido");
        Befp.setText("Entregar Pedido");
        Belp.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Befp.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Befp.setBackground(java.awt.Color.gray);
        Belp.setBackground(java.awt.Color.gray);
        Befp.setForeground(Color.white);
        Belp.setForeground(Color.white);
        Belp.addActionListener(this);
        Befp.addActionListener(this);
        BG.setBackground(java.awt.Color.darkGray);
        Img.setIcon(new ImageIcon("AtividadeV2//Source/IMGs/MotoBoy256.png"));

        BG.setBounds(0,0,600,500);
        Titulo.setBounds(100,70,500,50);
        Belp.setBounds(100,200,150,50);
        Befp.setBounds(100,300,150,50);
        Img.setBounds(280,150,256,256);

        //this add
        this.add(Img);
        this.add(Titulo);
        this.add(Belp);
        this.add(Befp);
        this.add(BG);
        
        //instacia do main
        this.setTitle("Principal");
        this.setSize(600, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(Befp)) {
            System.out.println("Efetuar Pedido Abriu");
            EntregarPedidoTela.setVisible(false);
            EfetuarPedidoTela.setVisible(true);
        }

        if (e.getSource().equals(Belp)) {
            System.out.println("Entregar Pedido Abriu");
            EntregarPedidoTela.setVisible(true);
            EfetuarPedidoTela.setVisible(false);
        }
    }
}
