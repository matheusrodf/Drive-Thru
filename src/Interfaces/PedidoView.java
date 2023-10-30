
package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import static javax.swing.BorderFactory.createEmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PedidoView extends JPanel {
    Integer x = 25;     //determina a posição dos itens no carrinho
    ImageIcon icone;
    JCheckBox check0, check1, check2, check3, check4, check5, check6, check7;
    JLabel produto0, produto1, produto2, produto3, produto4, produto5, produto6, produto7; 
    JLabel imagem0, imagem1, imagem2, imagem3, imagem4, imagem5, imagem6, imagem7;
    JLabel texttotal;
    Boolean bool[] = {false, false, false, false, false, false, false, false};     //se cada produto ja foi pedido
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    double dPreco[] = {6, 6.5, 18, 7, 4.5, 4, 6, 4.5};
    Integer quant[] = {0, 0, 0, 0, 0, 0, 0, 0};
    double total;
    JPanel prod0, prod1, prod2, prod3, prod4, prod5, prod6, prod7; 
    
    public PedidoView(){
                
        //<editor-fold defaultstate="collapsed" desc="Criar todos objetos">
        check0 = new JCheckBox();
        check1 = new JCheckBox();
        check2 = new JCheckBox();
        check3 = new JCheckBox();
        check4 = new JCheckBox();
        check5 = new JCheckBox();
        check6 = new JCheckBox();
        check7 = new JCheckBox();
        
        produto0 = new JLabel();
        produto1 = new JLabel();
        produto2 = new JLabel();
        produto3 = new JLabel();
        produto4 = new JLabel();
        produto5 = new JLabel();
        produto6 = new JLabel();
        produto7 = new JLabel();
        
        icone = new ImageIcon("imagens/small/prod0.png");
        imagem0 = new JLabel(icone);
        icone = new ImageIcon("imagens/small/prod1.png");
        imagem1 = new JLabel(icone);
        icone = new ImageIcon("imagens/small/prod2.png");
        imagem2 = new JLabel(icone);
        icone = new ImageIcon("imagens/small/prod3.png");
        imagem3 = new JLabel(icone);
        icone = new ImageIcon("imagens/small/prod4.png");
        imagem4 = new JLabel(icone);
        icone = new ImageIcon("imagens/small/prod5.png");
        imagem5 = new JLabel(icone);
        icone = new ImageIcon("imagens/small/prod6.png");
        imagem6 = new JLabel(icone);
        icone = new ImageIcon("imagens/small/prod7.png");
        imagem7 = new JLabel(icone);
        
        texttotal = new JLabel("Total: " + df.format(total));
        texttotal.setFont(new Font("Arial",Font.BOLD,20));
        this.add(texttotal);
        texttotal.setBounds(2, 300, 200, 30);
//</editor-fold>
        
        this.setBorder(BorderFactory.createTitledBorder(createEmptyBorder(), "Visualização do pedido"));
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setBounds(470, 47, 200, 335);
    }
    public void AddProd0(int quant) {
        if (!this.bool[0]) {
            this.quant[0] += quant;
            prod0 = new JPanel();
            produto0.setText("Fritas x" + this.quant[0] + " = " + df.format(dPreco[0] * this.quant[0]));
            this.add(prod0);
            prod0.add(produto0);
            prod0.add(check0);
            prod0.add(imagem0);
            check0.setBounds(1, 5, 20, 20);
            produto0.setBounds(60, 5, 200, 20);
            imagem0.setBounds(25, 0, 30, 30);
            check0.setBackground(Color.white);

            prod0.setBounds(0, x, 300, 30);
            prod0.setBackground(Color.white);
            prod0.setLayout(null);
            this.bool[0] = true;
            this.x += 35;
        }
        else {
            this.quant[0] += quant;
            produto0.setText("Fritas x" + this.quant[0] + " = " + df.format(dPreco[0] * this.quant[0]));
        }
        AtualizaPreco(quant * dPreco[0]);
    }
    public void AddProd1(int quant) {
        if (!this.bool[1]) {
            this.quant[1] += quant;
            prod1 = new JPanel();
            produto1.setText("Xis x" + this.quant[1] + " = " + df.format(dPreco[1] * this.quant[1]));
            this.add(prod1);
            prod1.add(produto1);
            prod1.add(check1);
            prod1.add(imagem1);
            check1.setBounds(1, 5, 20, 20);
            produto1.setBounds(60, 5, 200, 20);
            imagem1.setBounds(25, 0, 30, 30);
            check1.setBackground(Color.white);

            prod1.setBounds(0, x, 300, 30);
            prod1.setBackground(Color.white);
            prod1.setLayout(null);
            this.bool[1] = true;
            this.x += 35;
        }
        else {
            this.quant[1] += quant;
            produto1.setText("Xis x" + this.quant[1] + " = " + df.format(dPreco[1] * this.quant[1]));
        }
        AtualizaPreco(quant * dPreco[1]);
    }
    public void AddProd2(int quant) {
        if (!this.bool[2]) {
            this.quant[2] += quant;
            prod2 = new JPanel();
            produto2.setText("Pizza x" + this.quant[2] + " = " + df.format(dPreco[2] * this.quant[2]));
            this.add(prod2);
            prod2.add(produto2);
            prod2.add(check2);
            prod2.add(imagem2);
            check2.setBounds(1, 5, 20, 20);
            produto2.setBounds(60, 5, 200, 20);
            imagem2.setBounds(25, 0, 30, 30);
            check2.setBackground(Color.white);

            prod2.setBounds(0, x, 300, 30);
            prod2.setBackground(Color.white);
            prod2.setLayout(null);
            this.bool[2] = true;
            this.x += 35;
        }
        else {
            this.quant[2] += quant;
            produto2.setText("Pizza x" + this.quant[2] + " = " + df.format(dPreco[2] * this.quant[2]));
        }
        AtualizaPreco(quant * dPreco[2]);
    }
    public void AddProd3(int quant) {
        if (!this.bool[3]) {
            this.quant[3] += quant;
            prod3 = new JPanel();
            produto3.setText("Taco x" + this.quant[3] + " = " + df.format(dPreco[3] * this.quant[3]));
            this.add(prod3);
            prod3.add(produto3);
            prod3.add(check3);
            prod3.add(imagem3);
            check3.setBounds(1, 5, 20, 20);
            produto3.setBounds(60, 5, 200, 20);
            imagem3.setBounds(25, 0, 30, 30);
            check3.setBackground(Color.white);

            prod3.setBounds(0, x, 300, 30);
            prod3.setBackground(Color.white);
            prod3.setLayout(null);
            this.bool[3] = true;
            this.x += 35;
        }
        else {
            this.quant[3] += quant;
            produto3.setText("Taco x" + this.quant[3] + " = " + df.format(dPreco[3] * this.quant[3]));
        }
        AtualizaPreco(quant * dPreco[3]);
    }
    public void AddProd4(int quant) {
        if (!this.bool[4]) {
            this.quant[4] += quant;
            prod4 = new JPanel();
            produto4.setText("Café x" + this.quant[4] + " = " + df.format(dPreco[4] * this.quant[4]));
            this.add(prod4);
            prod4.add(produto4);
            prod4.add(check4);
            prod4.add(imagem4);
            check4.setBounds(1, 5, 20, 20);
            produto4.setBounds(60, 5, 200, 20);
            imagem4.setBounds(25, 0, 30, 30);
            check4.setBackground(Color.white);

            prod4.setBounds(0, x, 300, 30);
            prod4.setBackground(Color.white);
            prod4.setLayout(null);
            this.bool[4] = true;
            this.x += 35;
        }
        else {
            this.quant[4] += quant;
            produto4.setText("Café x" + this.quant[4] + " = " + df.format(dPreco[4] * this.quant[4]));
        }
        AtualizaPreco(quant * dPreco[4]);
    }
    public void AddProd5(int quant) {
        if (!this.bool[5]) {
            this.quant[5] += quant;
            prod5 = new JPanel();
            produto5.setText("Suco x" + this.quant[5] + " = " + df.format(dPreco[5] * this.quant[5]));
            this.add(prod5);
            prod5.add(produto5);
            prod5.add(check5);
            prod5.add(imagem5);
            check5.setBounds(1, 5, 20, 20);
            produto5.setBounds(60, 5, 200, 20);
            imagem5.setBounds(25, 0, 30, 30);
            check5.setBackground(Color.white);

            prod5.setBounds(0, x, 300, 30);
            prod5.setBackground(Color.white);
            prod5.setLayout(null);
            this.bool[5] = true;
            this.x += 35;
        }
        else {
            this.quant[5] += quant;
            produto5.setText("Suco x" + this.quant[5] + " = " + df.format(dPreco[5] * this.quant[5]));
        }
        AtualizaPreco(quant * dPreco[5]);
    }
    public void AddProd6(int quant) {
        if (!this.bool[6]) {
            this.quant[6] += quant;
            prod6 = new JPanel();
            produto6.setText("Chopp x" + this.quant[6] + " = " + df.format(dPreco[6] * this.quant[6]));
            this.add(prod6);
            prod6.add(produto6);
            prod6.add(check6);
            prod6.add(imagem6);
            check6.setBounds(1, 5, 20, 20);
            produto6.setBounds(60, 5, 200, 20);
            imagem6.setBounds(25, 0, 30, 30);
            check6.setBackground(Color.white);

            prod6.setBounds(0, x, 300, 30);
            prod6.setBackground(Color.white);
            prod6.setLayout(null);
            this.bool[6] = true;
            this.x += 35;
        }
        else {
            this.quant[6] += quant;
            produto6.setText("Chopp x" + this.quant[6] + " = " + df.format(dPreco[6] * this.quant[6]));
        }
        AtualizaPreco(quant * dPreco[6]);
    }
    public void AddProd7(int quant) {
        if (!this.bool[7]) {
            this.quant[7] += quant;
            prod7 = new JPanel();
            produto7.setText("Sundae x" + this.quant[7] + " = " + df.format(dPreco[7] * this.quant[7]));
            this.add(prod7);
            prod7.add(produto7);
            prod7.add(check7);
            prod7.add(imagem7);
            check7.setBounds(1, 5, 20, 20);
            produto7.setBounds(60, 5, 200, 20);
            imagem7.setBounds(25, 0, 30, 30);
            check7.setBackground(Color.white);

            prod7.setBounds(0, x, 300, 30);
            prod7.setBackground(Color.white);
            prod7.setLayout(null);
            this.bool[7] = true;
            this.x += 35;
        }
        else {
            this.quant[7] += quant;
            produto7.setText("Sundae x" + this.quant[7] + " = " + df.format(dPreco[7] * this.quant[7]));
        }
        AtualizaPreco(quant * dPreco[7]);
    }
    public void AtualizaPreco(double total) {
        this.total += total;
        texttotal.setText("Total: " + df.format(this.total));
    }
}
