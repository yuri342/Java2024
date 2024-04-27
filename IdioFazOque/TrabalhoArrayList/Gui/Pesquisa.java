package TrabalhoArrayList.Gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Pesquisa extends JPanel implements ActionListener {
    JTextArea inputNome;
    JTextArea inputTelefone;
    JTextArea Celular;
    JTextArea Telefone;
    JTextArea Email;
    JRadioButton TelPrincipal;
    JRadioButton CelPrincipal;
    JTextArea Combo;
    JLabel NomeLabel;
    JLabel TelefoneLabel;
    JLabel CelularLabel;
    JLabel EmailLabel;
    JLabel GrupoLabel;
    JButton Fechar;
    JButton Cancelar;
    JButton Excluir;
    JLabel titulo;
    JTextArea Pesquisa;
    JLabel PesquisaLabel;
    JLabel Nome;
    JLabel Cell;
    JButton PesquisarButton;
    
    public Pesquisa(){
        PesquisarButton = new JButton();
        Cell = new JLabel(); 
        Nome = new JLabel();
        PesquisaLabel = new JLabel();
        Pesquisa = new JTextArea();
        Fechar = new JButton();
        Cancelar = new JButton();
        Excluir = new JButton();
        inputNome = new JTextArea();
        inputTelefone= new JTextArea();
        Celular = new JTextArea();
        CelPrincipal = new JRadioButton();
        TelPrincipal = new JRadioButton();
        Combo = new JTextArea();
        Email = new JTextArea();
        Telefone = new JTextArea();
        Email = new JTextArea();
        EmailLabel = new JLabel();
        GrupoLabel = new JLabel();
        CelularLabel = new JLabel();
        TelefoneLabel = new JLabel();
        NomeLabel = new JLabel();
        titulo = new JLabel();

        this.add(PesquisarButton);
        this.add(PesquisaLabel);
        this.add(Pesquisa);
        this.add(Fechar);
        this.add(Excluir);
        this.add(Cancelar);
        this.add(inputNome);
        this.add(inputTelefone);
        this.add(Celular);
        this.add(CelPrincipal);
        this.add(TelPrincipal);
        this.add(Combo);
        this.add(Email);
        this.add(Telefone);
        this.add(GrupoLabel);
        this.add(EmailLabel);
        this.add(CelularLabel);
        this.add(TelefoneLabel);
        this.add(NomeLabel);
        this.add(titulo);
        this.add(Nome);
        this.add(Cell);

        NomeLabel.setText("Nome:");
        TelefoneLabel.setText("Telefone:");
        CelularLabel.setText("Celular:");
        EmailLabel.setText("E-mail:");
        GrupoLabel.setText("Grupo:");
        Nome.setText("Nome");
        Cell.setText("Celular");
        Nome.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        Cell.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        Nome.setForeground(Color.white);
        Cell.setForeground(Color.white);
        PesquisaLabel.setText("Pesquisar Por:");
        PesquisaLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        PesquisaLabel.setForeground(Color.white);
        NomeLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        TelefoneLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        CelularLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        EmailLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        GrupoLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 11));
        titulo.setText("Pesquisar");
        titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        titulo.setForeground(Color.white);
        NomeLabel.setForeground(Color.white);   
        TelefoneLabel.setForeground(Color.white);
        CelularLabel.setForeground(Color.white);
        EmailLabel.setForeground(Color.white);
        GrupoLabel.setForeground(Color.white);
        PesquisarButton.setText("Pesquisar");
        Fechar.setText("Editar");
        Excluir.setText("Excluir");
        Cancelar.setText("Cancelar");
        PesquisarButton.setForeground(Color.black);
        Fechar.setForeground(Color.black);
        Excluir.setForeground(Color.black);
        Cancelar.setForeground(Color.black);
        PesquisarButton.setBackground(Color.lightGray);
        Fechar.setBackground(Color.lightGray);
        Excluir.setBackground(Color.lightGray);
        Cancelar.setBackground(Color.lightGray);
        Fechar.addActionListener(this);
        Excluir.addActionListener(this);
        Cancelar.addActionListener(this);
        PesquisarButton.addActionListener(this);
        CelPrincipal.setBackground(Color.darkGray);
        TelPrincipal.setBackground(Color.darkGray);

        titulo.setBounds(25,0,150,50);
        inputNome.setBounds(100, 100, 250, 15);
        inputTelefone.setBounds(100, 150, 210, 15);
        Celular.setBounds(100, 200, 210, 15);
        Email.setBounds(100, 250, 250, 15);
        Combo.setBounds(100, 300, 250, 15);
        CelPrincipal.setBounds(260, 34, 20, 20);
        TelPrincipal.setBounds(200, 34, 20, 20);
        NomeLabel.setBounds(55,100,50,10);
        TelefoneLabel.setBounds(40,150,60,10);
        CelularLabel.setBounds(45,200,50,10);
        EmailLabel.setBounds(45,250,50,10);
        GrupoLabel.setBounds(45,305,50,10);
        Fechar.setBounds(50,350,100,50);
        Excluir.setBounds(160,350,100,50);
        Cancelar.setBounds(270,350,100,50);
        Pesquisa.setBounds(100,60,200,18);
        PesquisaLabel.setBounds(100,20,100,50);
        Nome.setBounds(220,38,50,10);
        Cell.setBounds(280,38,50,10);
        PesquisarButton.setBounds(310,57,100,25);




        this.setBackground(java.awt.Color.darkGray);
        this.setLayout(null);
        this.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}