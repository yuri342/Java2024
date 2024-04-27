package TrabalhoArrayList.Gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Mainframe extends JFrame implements ActionListener {
    JButton B1;
    JButton B2;
    JLabel Titulo;
    PainelAdd painelAdd;
    Pesquisa PainelPequisa;
    public Mainframe(){
        //Instancias
        Titulo = new JLabel();
        B1 = new JButton();
        B2 = new JButton();
        painelAdd = new PainelAdd();
        PainelPequisa = new Pesquisa();
        //Adds
        this.add(B1);
        this.add(B2);
        this.add(Titulo);
        this.add(painelAdd);
        this.add(PainelPequisa);

        Titulo.setText("Agenda De Contatos");
        Titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        B1.setBackground(java.awt.Color.darkGray);
        B2.setBackground(java.awt.Color.darkGray);
        B1.setForeground(java.awt.Color.white);
        B2.setForeground(java.awt.Color.white);
        B1.setText("Adicionar");
        B2.setText("Pequsisar");
        B1.addActionListener(this);
        B2.addActionListener(this);

        Titulo.setBounds(150,10,200,50);
        B1.setBounds(100, 100, 100, 50);
        B2.setBounds(300, 100, 100, 50);
        painelAdd.setBounds(35,180,430,480);
        PainelPequisa.setBounds(35,180,430,480);

        this.setSize(500, 700);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Trabalho Yuri Array List");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(B1)) {
            painelAdd.setVisible(true);
            PainelPequisa.setVisible(false);
        }
        
        if (e.getSource().equals(B2)) {
            PainelPequisa.setVisible(true);
            painelAdd.setVisible(false);
        }
    }
}
