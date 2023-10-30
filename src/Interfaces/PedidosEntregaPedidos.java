
package Interfaces;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PedidosEntregaPedidos extends JPanel {
    
    ImageIcon icone;
    JLabel produto0, produto1, produto2, produto3, produto4, produto5, produto6, produto7; 
    JLabel imagem0, imagem1, imagem2, imagem3, imagem4, imagem5, imagem6, imagem7;
    JPanel prod0, prod1, prod2, prod3, prod4, prod5, prod6, prod7;
    Font fonte;
    
    public PedidosEntregaPedidos() {
        produto0 = new JLabel();
        produto1 = new JLabel();
        produto2 = new JLabel();
        produto3 = new JLabel();
        produto4 = new JLabel();
        produto5 = new JLabel();
        produto6 = new JLabel();
        produto7 = new JLabel();
        
        icone = new ImageIcon("imagens/big/prod0.png");
        imagem0 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod1.png");
        imagem1 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod2.png");
        imagem2 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod3.png");
        imagem3 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod4.png");
        imagem4 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod5.png");
        imagem5 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod6.png");
        imagem6 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod7.png");
        imagem7 = new JLabel(icone);
        
        fonte = new Font("Arial",Font.BOLD,25);
        
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK),"Visualização do pedido"));
            
    }
    public void AddProd0(int x, int y, int quant) {
        prod0 = new JPanel();
        produto0.setText("<html> <p style=\"text-align:center;\">Fritas<br>x" + quant + "</p></html>");
        produto0.setFont(fonte);
        this.add(prod0);
        prod0.add(imagem0);
        prod0.add(produto0);
        prod0.setLayout(null);
        
        prod0.setBorder(BorderFactory.createLineBorder(Color.black));

        
        prod0.setBounds(x, y, 200, 60);
        imagem0.setBounds(0, 0, 60, 60);
        produto0.setBounds(90, 0, 100, 60);
        
        prod0.setBackground(Color.white);
    }
    public void AddProd1(int x, int y, int quant) {
        prod1 = new JPanel();
        produto1.setText("<html> <p style=\"text-align:center;\">Xis<br>x" + quant + "</p></html>");
        produto1.setFont(fonte);
        this.add(prod1);
        prod1.add(imagem1);
        prod1.add(produto1);
        prod1.setLayout(null);
        
        prod1.setBorder(BorderFactory.createLineBorder(Color.black));

        
        prod1.setBounds(x, y, 200, 60);
        imagem1.setBounds(0, 0, 60, 60);
        produto1.setBounds(90, 0, 150, 60);
        
        prod1.setBackground(Color.white);
    }
    public void AddProd2(int x, int y, int quant) {
        prod2 = new JPanel();
        produto2.setText("<html> <p style=\"text-align:center;\">Pizza<br>x" + quant + "</p></html>");
        produto2.setFont(fonte);
        this.add(prod2);
        prod2.add(imagem2);
        prod2.add(produto2);
        prod2.setLayout(null);
        
        prod2.setBorder(BorderFactory.createLineBorder(Color.black));

        
        prod2.setBounds(x, y, 200, 60);
        imagem2.setBounds(0, 0, 60, 60);
        produto2.setBounds(90, 0, 150, 60);
        
        prod2.setBackground(Color.white);
    }
    public void AddProd3(int x, int y, int quant) {
        prod3 = new JPanel();
        produto3.setText("<html> <p style=\"text-align:center;\">Taco<br>x" + quant + "</p></html>");
        produto3.setFont(fonte);
        this.add(prod3);
        prod3.add(imagem3);
        prod3.add(produto3);
        prod3.setLayout(null);
        
        prod3.setBorder(BorderFactory.createLineBorder(Color.black));

        
        prod3.setBounds(x, y, 200, 60);
        imagem3.setBounds(0, 0, 60, 60);
        produto3.setBounds(90, 0, 150, 60);
       
        prod3.setBackground(Color.white);
    }
    public void AddProd4(int x, int y, int quant) {
        prod4 = new JPanel();
        produto4.setText("<html> <p style=\"text-align:center;\">Café<br>x" + quant + "</p></html>");
        produto4.setFont(fonte);
        this.add(prod4);
        prod4.add(imagem4);
        prod4.add(produto4);
        prod4.setLayout(null);
        
        prod4.setBorder(BorderFactory.createLineBorder(Color.black));

        
        prod4.setBounds(x, y, 200, 60);
        imagem4.setBounds(0, 0, 60, 60);
        produto4.setBounds(90, 0, 150, 60);
        
        prod4.setBackground(Color.white);
    }
    public void AddProd5(int x, int y, int quant) {
        prod5 = new JPanel();
        produto5.setText("<html> <p style=\"text-align:center;\">Suco<br>x" + quant + "</p></html>");
        produto5.setFont(fonte);
        this.add(prod5);
        prod5.add(imagem5);
        prod5.add(produto5);
        prod5.setLayout(null);
        
        prod5.setBorder(BorderFactory.createLineBorder(Color.black));

        
        prod5.setBounds(x, y, 200, 60);
        imagem5.setBounds(0, 0, 60, 60);
        produto5.setBounds(90, 0, 150, 60);
       
        prod5.setBackground(Color.white);
    }
    public void AddProd6(int x, int y, int quant) {
        prod6 = new JPanel();
        produto6.setText("<html> <p style=\"text-align:center;\">Chopp<br>x" + quant + "</p></html>");
        produto6.setFont(fonte);
        this.add(prod6);
        prod6.add(imagem6);
        prod6.add(produto6);
        prod6.setLayout(null);
        
        prod6.setBorder(BorderFactory.createLineBorder(Color.black));

        
        prod6.setBounds(x, y, 200, 60);
        imagem6.setBounds(0, 0, 60, 60);
        produto6.setBounds(90, 0, 150, 60);
        
        prod6.setBackground(Color.white);
    }
    public void AddProd7(int x, int y, int quant) {
        prod7 = new JPanel();
        produto7.setText("<html> <p style=\"text-align:center;\">Sundae<br>x" + quant + "</p></html>");
        produto7.setFont(fonte);
        this.add(prod7);
        prod7.add(imagem7);
        prod7.add(produto7);
        prod7.setLayout(null);
        
        prod7.setBorder(BorderFactory.createLineBorder(Color.black));

        
        prod7.setBounds(x, y, 200, 60);
        imagem7.setBounds(0, 0, 60, 60);
        produto7.setBounds(90, 0, 150, 60);
       
        prod7.setBackground(Color.white);
    }
    public void RemoveAll() {
        try {
            prod0.setVisible(false);
            this.remove(prod0);
        } catch (Exception ex) {}
        try {
            prod1.setVisible(false);
            this.remove(prod1);
        } catch (Exception ex) {}
        try {
            prod2.setVisible(false);
            this.remove(prod2);
        } catch (Exception ex) {}
        try {
            prod3.setVisible(false);
            this.remove(prod3);
        } catch (Exception ex) {}
        try {
            prod4.setVisible(false);
            this.remove(prod4);
        } catch (Exception ex) {}
        try {
            prod5.setVisible(false);
            this.remove(prod5);
        } catch (Exception ex) {}
        try {
            prod6.setVisible(false);
            this.remove(prod6);
        } catch (Exception ex) {}
        try {
            prod7.setVisible(false);
            this.remove(prod7);
        } catch (Exception ex) {}
        
    }
}
