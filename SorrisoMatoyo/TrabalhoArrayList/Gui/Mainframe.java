package TrabalhoArrayList.Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




public class Mainframe extends JFrame {
    JButton B1;
    JButton B2;
    JLabel Titulo;
    PainelAdd painelAdd;
    public Mainframe(){
        //Instancias
        Titulo = new JLabel();
        B1 = new JButton();
        B2 = new JButton();
        painelAdd = new PainelAdd();
        //Adds
        this.add(B1);
        this.add(B2);
        this.add(Titulo);
        this.add(painelAdd);

        Titulo.setText("Agenda De Contatos");
        Titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        B1.setBackground(java.awt.Color.darkGray);
        B2.setBackground(java.awt.Color.darkGray);
        B1.setForeground(java.awt.Color.white);
        B2.setForeground(java.awt.Color.white);
        B1.setText("Adicionar");
        B2.setText("Pequsisar");


        Titulo.setBounds(150,10,200,50);
        B1.setBounds(100, 100, 100, 50);
        B2.setBounds(300, 100, 100, 50);
        painelAdd.setBounds(35,180,430,480);

        this.setSize(500, 700);
        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("Trabalho Yuri Array List");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
