package TrabalhoArrayList.Gui;

import java.awt.Color;
import java.net.CookieStore;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class PainelAdd extends JPanel {
    JTextArea inputNome;
    JTextArea inputTelefone;
    JTextArea Celular;
    JTextArea Telefone;
    JTextArea Email;
    JRadioButton TelPrincipal;
    JRadioButton CelPrincipal;
    JComboBox<String> Combo;
    JLabel NomeLabel;
    JLabel TelefoneLabel;
    JLabel CelularLabel;
    JLabel EmailLabel;
    JLabel GrupoLabel;
    JButton Salvar;
    JButton Cancelar;
    JButton Apagar;
    JLabel titulo;
    
    public PainelAdd(){

        Salvar = new JButton();
        Cancelar = new JButton();
        Apagar = new JButton();
        inputNome = new JTextArea();
        inputTelefone= new JTextArea();
        Celular = new JTextArea();
        CelPrincipal = new JRadioButton();
        TelPrincipal = new JRadioButton();
        Combo = new JComboBox<String>();
        Email = new JTextArea();
        Telefone = new JTextArea();
        Email = new JTextArea();
        EmailLabel = new JLabel();
        GrupoLabel = new JLabel();
        CelularLabel = new JLabel();
        TelefoneLabel = new JLabel();
        NomeLabel = new JLabel();
        titulo = new JLabel();

        this.add(Salvar);
        this.add(Apagar);
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

        Combo.addItem("Nenhum");
        Combo.addItem("Amigos");
        Combo.addItem("Familia");
        Combo.addItem("AmigosIntimos");
        Combo.addItem("Trabalho");
        Combo.addItem("Faculdade");
        NomeLabel.setText("Nome:");
        TelefoneLabel.setText("Telefone:");
        CelularLabel.setText("Celular");
        EmailLabel.setText("E-mail");
        GrupoLabel.setText("Grupo");
        NomeLabel.setText("Nome:");
        TelefoneLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 13));
        CelularLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 13));
        EmailLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 13));
        GrupoLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 13));
        titulo.setText("Novo Contato");
        titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        titulo.setForeground(Color.white);
        NomeLabel.setForeground(Color.white);   
        TelefoneLabel.setForeground(Color.white);
        CelularLabel.setForeground(Color.white);
        EmailLabel.setForeground(Color.white);
        GrupoLabel.setForeground(Color.white);
        Salvar.setBackground(Color.lightGray);
        Apagar.setBackground(Color.lightGray);
        Cancelar.setBackground(Color.lightGray);

        titulo.setBounds(25,0,150,50);
        inputNome.setBounds(100, 100, 250, 15);
        inputTelefone.setBounds(100, 150, 210, 15);
        Celular.setBounds(100, 200, 210, 15);
        Email.setBounds(100, 250, 250, 15);
        Combo.setBounds(100, 300, 250, 20);
        CelPrincipal.setBounds(150, 200, 20, 20);


        this.setBackground(java.awt.Color.darkGray);
        this.setLayout(null);
        this.setVisible(true);
    }
}