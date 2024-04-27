
package Source.Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import Source.JavaBeans.Pedido;
import Source.JavaBeans.Produtos;

/**
 * Pedido
 */
public class EfetuarPedido extends JFrame implements ActionListener {
    JPanel BG;
    JLabel PedidoN;
    JLabel PlacaCar;
    JLabel Lanches;
    JLabel Bebidas;
    JLabel VisualP;
    JLabel ValorTotal;
    JLabel Qtd1;
    JLabel Qtd2;
    JLabel Qtd3;
    JLabel Qtd4;
    JLabel Qtd5;
    JLabel Qtd6;
    JLabel Qtd7;
    JLabel Qtd8;
    JTextArea PedidoIN;
    JTextArea PlacaCarroIN;
    JTextArea PedidoComanda;
    JButton LimparP;
    JButton VisualizaP;
    JButton ConfirmaP;
    JButton Batata;
    JButton Hamburger;
    JButton Pizza;
    JButton Taco;
    JButton Café;
    JButton LaranjaS;
    JButton Cerveja;
    JButton Sorvete;
    JComboBox<Integer> box1;
    JComboBox<Integer> box2;
    JComboBox<Integer> box3;
    JComboBox<Integer> box4;
    JComboBox<Integer> box5;
    JComboBox<Integer> box6;
    JComboBox<Integer> box7;
    JComboBox<Integer> box8;
    JCheckBox Check1;
    JCheckBox Check2;
    JCheckBox Check3;
    JCheckBox Check4;
    JCheckBox Check5;
    JCheckBox Check6;
    JCheckBox Check7;
    JCheckBox Check8;
    Pedido pedido;
    Produtos produto = new Produtos();
    ArrayList<Produtos> Comanda = new ArrayList<>();

    public EfetuarPedido(Pedido pedido) {
        this.pedido = pedido;
        PedidoN = new JLabel();
        PlacaCar = new JLabel();
        Lanches = new JLabel();
        Bebidas = new JLabel();
        VisualP = new JLabel();
        ValorTotal = new JLabel();
        Qtd1 = new JLabel();
        Qtd2 = new JLabel();
        Qtd3 = new JLabel();
        Qtd4 = new JLabel();
        Qtd5 = new JLabel();
        Qtd6 = new JLabel();
        Qtd7 = new JLabel();
        Qtd8 = new JLabel();
        PedidoIN = new JTextArea();
        PlacaCarroIN = new JTextArea();
        PedidoComanda = new JTextArea();
        LimparP = new JButton();
        VisualizaP = new JButton();
        ConfirmaP = new JButton();
        Batata = new JButton();
        Hamburger = new JButton();
        Pizza = new JButton();
        Taco = new JButton();
        Café = new JButton();
        LaranjaS = new JButton();
        Cerveja = new JButton();
        Sorvete = new JButton();
        box1 = new JComboBox<>();
        box2 = new JComboBox<>();
        box3 = new JComboBox<>();
        box4 = new JComboBox<>();
        box5 = new JComboBox<>();
        box6 = new JComboBox<>();
        box7 = new JComboBox<>();
        box8 = new JComboBox<>();
        Check1 = new JCheckBox();
        Check2 = new JCheckBox();
        Check3 = new JCheckBox();
        Check4 = new JCheckBox();
        Check5 = new JCheckBox();
        Check6 = new JCheckBox();
        Check7 = new JCheckBox();
        Check8 = new JCheckBox();
        BG = new JPanel();

        for (int i = 1; i <= 50; i++) {
            box1.addItem(i);
            box2.addItem(i);
            box3.addItem(i);
            box4.addItem(i);
            box5.addItem(i);
            box6.addItem(i);
            box7.addItem(i);
            box8.addItem(i);
        }

        LimparP.addActionListener(this);
        VisualizaP.addActionListener(this);
        ConfirmaP.addActionListener(this);
        Batata.addActionListener(this);
        Hamburger.addActionListener(this);
        Pizza.addActionListener(this);
        Taco.addActionListener(this);
        Café.addActionListener(this);
        LaranjaS.addActionListener(this);
        Cerveja.addActionListener(this);
        Sorvete.addActionListener(this);
        PedidoComanda.setFont(new Font("Sans Serif", Font.BOLD, 15));
        VisualP.setText("Visualização do pedido:");
        VisualP.setFont(new Font("Sans Serif", Font.BOLD, 20));
        VisualP.setForeground(Color.white);
        PedidoN.setText("Pedido n°:");
        PedidoN.setFont(new Font("Sans Serif", Font.BOLD, 15));
        PedidoN.setForeground(Color.white);
        PedidoIN.setFont(new Font("Sans Serif", Font.BOLD, 15));
        PlacaCar.setText("Placa Do Carro :");
        PlacaCar.setFont(new Font("Sans Serif", Font.BOLD, 15));
        PlacaCar.setForeground(Color.white);
        PlacaCarroIN.setFont(new Font("Sans Serif", Font.BOLD, 15));
        BG.setBackground(java.awt.Color.darkGray);
        Lanches.setText("Lanches:");
        Lanches.setForeground(Color.white);
        Lanches.setFont(new Font("Sans Serif", Font.BOLD, 20));
        Bebidas.setText("Bebidas:");
        Bebidas.setForeground(Color.white);
        Bebidas.setFont(new Font("Sans Serif", Font.BOLD, 20));
        Qtd1.setText("Qtd:");
        Qtd1.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Qtd1.setForeground(Color.white);
        Qtd2.setText("Qtd:");
        Qtd2.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Qtd2.setForeground(Color.white);
        Qtd3.setText("Qtd:");
        Qtd3.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Qtd3.setForeground(Color.white);
        Qtd4.setText("Qtd:");
        Qtd4.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Qtd4.setForeground(Color.white);
        Qtd5.setText("Qtd:");
        Qtd5.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Qtd5.setForeground(Color.white);
        Qtd6.setText("Qtd:");
        Qtd6.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Qtd6.setForeground(Color.white);
        Qtd7.setText("Qtd:");
        Qtd7.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Qtd7.setForeground(Color.white);
        Qtd8.setText("Qtd:");
        Qtd8.setFont(new Font("Sans Serif", Font.BOLD, 15));
        Qtd8.setForeground(Color.white);
        Batata.setBackground(Color.lightGray);
        Batata.setText("BatataFrita");
        Hamburger.setBackground(Color.lightGray);
        Hamburger.setText("Hamburger");
        Pizza.setBackground(Color.lightGray);
        Pizza.setText("Pizza");
        Taco.setBackground(Color.lightGray);
        Taco.setText("Taco");
        Café.setBackground(Color.lightGray);
        Café.setText("Café");
        LaranjaS.setBackground(Color.lightGray);
        LaranjaS.setText("Suco De Laranja");
        Cerveja.setBackground(Color.lightGray);
        Cerveja.setText("Cerveja");
        Sorvete.setBackground(Color.lightGray);
        Sorvete.setText("Sorvete");
        VisualizaP.setBackground(Color.gray);
        ConfirmaP.setBackground(Color.gray);
        LimparP.setBackground(Color.gray);
        VisualizaP.setForeground(Color.white);
        ConfirmaP.setForeground(Color.white);
        LimparP.setForeground(Color.white);
        VisualizaP.setFont(new Font("Sans Serif", Font.BOLD, 15));
        ConfirmaP.setFont(new Font("Sans Serif", Font.BOLD, 15));
        LimparP.setFont(new Font("Sans Serif", Font.BOLD, 15));
        ValorTotal.setFont(new Font("Sans Serif", Font.BOLD, 15));
        ValorTotal.setText("ValorTotal: ");
        ValorTotal.setForeground(Color.red);
        LimparP.setText("Limpar");
        ConfirmaP.setText("Confirmar Pedido");
        VisualizaP.setText("Visualizar Pedido");
        Check1.addActionListener(this);
        Check2.addActionListener(this);
        Check4.addActionListener(this);
        Check3.addActionListener(this);
        Check5.addActionListener(this);
        Check6.addActionListener(this);
        Check7.addActionListener(this);
        Check8.addActionListener(this);
        Check1.setBackground(Color.darkGray);
        Check2.setBackground(Color.darkGray);
        Check4.setBackground(Color.darkGray);
        Check3.setBackground(Color.darkGray);
        Check5.setBackground(Color.darkGray);
        Check6.setBackground(Color.darkGray);
        Check7.setBackground(Color.darkGray);
        Check8.setBackground(Color.darkGray);
        ImageIcon imgChecks = new ImageIcon("Atividade/Source/IMGs/VC32.png");
        Check1.setIcon(imgChecks);
        Check2.setIcon(imgChecks);
        Check4.setIcon(imgChecks);
        Check3.setIcon(imgChecks);
        Check5.setIcon(imgChecks);
        Check6.setIcon(imgChecks);
        Check7.setIcon(imgChecks);
        Check8.setIcon(imgChecks);

        ValorTotal.setBounds(600, 650, 200, 15);
        PedidoComanda.setBounds(520, 150, 340, 470);
        LimparP.setBounds(100, 680, 150, 50);
        VisualizaP.setBounds(335, 680, 200, 50);
        ConfirmaP.setBounds(600, 680, 200, 50);
        VisualP.setBounds(500, 100, 300, 25);
        Check1.setBounds(203, 185, 50, 32);
        Check2.setBounds(203, 320, 50, 32);
        Check3.setBounds(203, 445, 50, 32);
        Check4.setBounds(203, 570, 50, 32);
        Check5.setBounds(453, 185, 50, 32);
        Check6.setBounds(453, 320, 50, 32);
        Check7.setBounds(453, 445, 50, 32);
        Check8.setBounds(453, 570, 50, 32);
        Qtd1.setBounds(17, 185, 90, 15);
        Qtd2.setBounds(17, 320, 90, 15);
        Qtd3.setBounds(17, 445, 90, 15);
        Qtd4.setBounds(17, 570, 90, 15);
        Qtd5.setBounds(267, 185, 50, 15);
        Qtd6.setBounds(267, 320, 50, 15);
        Qtd7.setBounds(267, 445, 50, 15);
        Qtd8.setBounds(267, 570, 50, 15);
        PedidoN.setBounds(25, 25, 100, 16);
        PedidoIN.setBounds(100, 25, 150, 20);
        PlacaCar.setBounds(300, 25, 115, 16);
        PlacaCarroIN.setBounds(416, 25, 150, 20);
        Lanches.setBounds(100, 100, 100, 16);
        Bebidas.setBounds(350, 100, 100, 16);
        Batata.setBounds(100, 150, 100, 100);
        Hamburger.setBounds(100, 275, 100, 100);
        Pizza.setBounds(100, 400, 100, 100);
        Taco.setBounds(100, 525, 100, 100);
        Café.setBounds(350, 150, 100, 100);
        LaranjaS.setBounds(350, 275, 100, 100);
        Cerveja.setBounds(350, 400, 100, 100);
        Sorvete.setBounds(350, 525, 100, 100);
        box1.setBounds(50, 180, 40, 25);
        box2.setBounds(50, 315, 40, 25);
        box3.setBounds(50, 440, 40, 25);
        box4.setBounds(50, 565, 40, 25);
        box5.setBounds(300, 180, 40, 25);
        box6.setBounds(300, 315, 40, 25);
        box7.setBounds(300, 440, 40, 25);
        box8.setBounds(300, 565, 40, 25);
        BG.setBounds(0, 0, 900, 800);

        this.add(ValorTotal);
        this.add(ConfirmaP);
        this.add(VisualizaP);
        this.add(LimparP);
        this.add(PedidoComanda);
        this.add(VisualP);
        this.add(Check1);
        this.add(Check2);
        this.add(Check3);
        this.add(Check4);
        this.add(Check5);
        this.add(Check6);
        this.add(Check7);
        this.add(Check8);
        this.add(Qtd1);
        this.add(Qtd2);
        this.add(Qtd3);
        this.add(Qtd4);
        this.add(Qtd5);
        this.add(Qtd6);
        this.add(Qtd7);
        this.add(Qtd8);
        this.add(Qtd1);
        this.add(box1);
        this.add(box2);
        this.add(box3);
        this.add(box4);
        this.add(box5);
        this.add(box6);
        this.add(box7);
        this.add(box8);
        this.add(Café);
        this.add(LaranjaS);
        this.add(Cerveja);
        this.add(Sorvete);
        this.add(Taco);
        this.add(Pizza);
        this.add(Hamburger);
        this.add(Batata);
        this.add(Bebidas);
        this.add(Lanches);
        this.add(PlacaCarroIN);
        this.add(PlacaCar);
        this.add(PedidoN);
        this.add(PedidoIN);
        this.add(BG);

        this.setTitle("EFP");
        this.setSize(900, 800);
        this.setLayout(null);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        double[] precos =    { 2.50, 5.00, 10.50, 6.00, 1.50, 2.00, 3.00, 5.00 };
        JButton[] Botoes =   { Batata, Hamburger, Pizza, Taco, Café, LaranjaS, Cerveja, Sorvete };
        JCheckBox[] Checks = { Check1, Check2, Check3, Check4, Check5, Check6, Check7, Check8 };
        JComboBox[] Combos = { box1, box2, box3, box4, box5, box6, box7, box8 };

        if (e.getSource() == LimparP) {
            System.out.println("Botão Limpar clicado");
            PedidoComanda.setText("");
            PedidoIN.setText("");
            PlacaCarroIN.setText("");
            Comanda.clear();
            for (int i = 0; i < 8; i++) {
                Checks[i].setIcon(new ImageIcon("Atividade/Source/IMGs/VC32.png"));
                Checks[i].setSelected(false);
                Combos[i].setSelectedItem(1);
            }
        }
        if (e.getSource() == VisualizaP) {
            double total = 0;
            PedidoComanda.setText(""); // Limpa o texto anterior
            for (int i = 0; i < Comanda.size(); i++) {
                Produtos produtoT = Comanda.get(i);
                total += (produtoT.getPreco() * produtoT.getQuantidade());
                PedidoComanda.append(produtoT.getNome() + "| Qtd-" + produtoT.getQuantidade() + "| Preço R$-"
                        + String.format("%.2f", (produtoT.getPreco() * produtoT.getQuantidade())) + "\n");
            }
            ValorTotal.setText(String.format("ValorTotal: R$%.2f", total));
        }
        if (e.getSource() == ConfirmaP) {
            System.out.println("Botão ComfirmaP clicado");
        }

        if ((PedidoIN.getText().isEmpty()) || (PlacaCarroIN.getText().isEmpty())) {
            System.out.println("Campos de Input Vazio");
        } else {
            for (int i = 0; i < 8; i++) {
                JButton botaoTemp = Botoes[i];
                JCheckBox checkBoxTemp = Checks[i];

                if ((checkBoxTemp.isSelected() == true)) {
                    if ((e.getSource().equals(checkBoxTemp))) {
                        checkBoxTemp.setIcon(new ImageIcon("Atividade/Source/IMGs/CH32.png"));
                    }
                    if (e.getSource().equals(botaoTemp)) {
                        produto = new Produtos();
                        System.out.println("Checkbox " + (i + 1) + " selecionado - " + botaoTemp.getText());
                        produto.setNome(botaoTemp.getText());
                        produto.setQuantidade((Combos[i].getSelectedIndex()) + 1);
                        produto.setPreco(precos[i]);
                        Comanda.add(produto);
                    }
                } else {
                    checkBoxTemp.setIcon(new ImageIcon("Atividade/Source/IMGs/VC32.png"));
                }
            }
        }
    }
}