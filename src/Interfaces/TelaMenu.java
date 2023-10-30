
package Interfaces;

import JavaBeans.Fila;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaMenu extends JFrame implements ActionListener{
    JButton bPedir, bEntregar, bSair;
    JLabel lTexto, lImagem;
    TelaPedidos telaPedidos;
    EntregaPedido entregaPedidos;
    Fila fila;
    JPanel tela;
    
    public TelaMenu() {
        fila = new Fila();
        telaPedidos = new TelaPedidos(this, fila);
        entregaPedidos = new EntregaPedido(this, fila);
        tela = new JPanel();
        tela.setLayout(null);
        tela.setBounds(0, 0, 640, 480);
        this.add(telaPedidos);
        this.add(entregaPedidos);
        this.add(tela);
        ImageIcon icone = new ImageIcon("imagens/menu.png");
        bPedir = new JButton("Efetuar Pedido");
        bEntregar = new JButton("Entregar Pedido");
        bSair = new JButton("Sair");
        lTexto = new JLabel("Rodf Lanches - Drive Thru");
        lImagem = new JLabel(icone);
        
        lTexto.setFont(new Font("Comic Sans MS",Font.BOLD,30));
        bPedir.setBackground(Color.white);
        bEntregar.setBackground(Color.white);
        bSair.setBackground(Color.white);
        lTexto.setBounds(100, 50, 600, 60);
        bPedir.setBounds(20, 200, 130, 30);
        bEntregar.setBounds(20, 250, 130, 30);
        bSair.setBounds(20, 300, 130, 30);
        lImagem.setBounds(250, 100, 300, 300);
        
        tela.add(bPedir);
        tela.add(bEntregar);
        tela.add(bSair);
        tela.add(lTexto);
        tela.add(lImagem);
        tela.setBackground(Color.decode("#dddddd"));
        
        bPedir.addActionListener(this);
        bEntregar.addActionListener(this);
        bSair.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        this.setLayout(null);
        this.setTitle("Rodf Lanches");
        this.setSize(640,480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(bPedir)) {
            this.setSize(800, 450);
            
            tela.setVisible(false);
            
            telaPedidos.setVisible(true);
            this.setTitle("Pedidos");
        }
        if (e.getSource().equals(bEntregar)) {
            this.setSize(480, 640);
            this.setTitle("Entrega dos Pedidos");
            this.setLocationRelativeTo(null);
            entregaPedidos.setVisible(true);
            tela.setVisible(false);
        }
    }
    
}
