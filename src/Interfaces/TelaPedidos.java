
package Interfaces;

import Exceptions.PlacaVaziaException;
import JavaBeans.Fila;
import JavaBeans.Pedido;
import JavaBeans.Produtos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.text.MaskFormatter;

public class TelaPedidos extends JPanel implements ActionListener{
    Integer n1, nPedido = 1;
    JCheckBox check0, check1, check2, check3, check4, check5, check6, check7; //checkBox dos produtos
    JTextField tPlacaCarro;
    JButton bLimpar, bAdicionar, bConfirmar, bRemover, bVoltar;
    JLabel lPedido, placaCarro, lanches, bebidas;
    JLabel img0, img1, img2, img3, img4, img5, img6, img7;          //imagem dos produtos
    JLabel preco0, preco1, preco2, preco3, preco4, preco5, preco6, preco7;          //preço dos produtos
    JSpinner spinner0, spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7;       //quantidade dos produtos
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    MaskFormatter maskPlaca;
    double dPreco[] = {6, 6.5, 18, 7, 4.5, 4, 6, 4.5};
    PedidoView painel;
    Fila fila;
    TelaMenu tela;
    
    public TelaPedidos(TelaMenu frame, Fila fila) {
        this.fila = fila;
        try {
            maskPlaca = new MaskFormatter("UUU-####");
            maskPlaca.setPlaceholderCharacter('_');
        } catch(ParseException ex){}
        
        //<editor-fold defaultstate="collapsed" desc="imgN, checkN, comboN, precoN">
        ImageIcon icone = new ImageIcon("imagens/big/prod0.png");
        img0 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod1.png");
        img1 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod2.png");
        img2 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod3.png");
        img3 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod4.png");
        img4 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod5.png");
        img5 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod6.png");
        img6 = new JLabel(icone);
        icone = new ImageIcon("imagens/big/prod7.png");
        img7 = new JLabel(icone);
        this.add(img0);
        this.add(img1);
        this.add(img2);
        this.add(img3);
        this.add(img4);
        this.add(img5);
        this.add(img6);
        this.add(img7);
        check0 = new JCheckBox();
        check1 = new JCheckBox();
        check2 = new JCheckBox();
        check3 = new JCheckBox();
        check4 = new JCheckBox();
        check5 = new JCheckBox();
        check6 = new JCheckBox();
        check7 = new JCheckBox();
        this.add(check0);
        this.add(check1);
        this.add(check2);
        this.add(check3);
        this.add(check4);
        this.add(check5);
        this.add(check6);
        this.add(check7);
        SpinnerModel model0 = new SpinnerNumberModel(1, 1, 99, 1);
        SpinnerModel model1 = new SpinnerNumberModel(1, 1, 99, 1);
        SpinnerModel model2 = new SpinnerNumberModel(1, 1, 99, 1);
        SpinnerModel model3 = new SpinnerNumberModel(1, 1, 99, 1);
        SpinnerModel model4 = new SpinnerNumberModel(1, 1, 99, 1);
        SpinnerModel model5 = new SpinnerNumberModel(1, 1, 99, 1);
        SpinnerModel model6 = new SpinnerNumberModel(1, 1, 99, 1);
        SpinnerModel model7 = new SpinnerNumberModel(1, 1, 99, 1);
        spinner0 = new JSpinner(model0);
        spinner1 = new JSpinner(model1);
        spinner2 = new JSpinner(model2);
        spinner3 = new JSpinner(model3);
        spinner4 = new JSpinner(model4);
        spinner5 = new JSpinner(model5);
        spinner6 = new JSpinner(model6);
        spinner7 = new JSpinner(model7);
        this.add(spinner0);
        this.add(spinner1);
        this.add(spinner2);
        this.add(spinner3);
        this.add(spinner4);
        this.add(spinner5);
        this.add(spinner6);
        this.add(spinner7);
        preco0 = new JLabel(df.format(dPreco[0]));
        preco1 = new JLabel(df.format(dPreco[1]));
        preco2 = new JLabel(df.format(dPreco[2]));
        preco3 = new JLabel(df.format(dPreco[3]));
        preco4 = new JLabel(df.format(dPreco[4]));
        preco5 = new JLabel(df.format(dPreco[5]));
        preco6 = new JLabel(df.format(dPreco[6]));
        preco7 = new JLabel(df.format(dPreco[7]));
        this.add(preco0);
        this.add(preco1);
        this.add(preco2);
        this.add(preco3);
        this.add(preco4);
        this.add(preco5);
        this.add(preco6);
        this.add(preco7);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Bounds do i, cb, b e p">
        img0.setBounds(60, 80, 60, 60);
        img1.setBounds(60, 145, 60, 60);
        img2.setBounds(60, 210, 60, 60);
        img3.setBounds(60, 275, 60, 60);
        img4.setBounds(300, 80, 60, 60);
        img5.setBounds(300, 145, 60, 60);
        img6.setBounds(300, 210, 60, 60);
        img7.setBounds(300, 275, 60, 60);
        
        check0.setBounds(30, 100, 20, 20);
        check1.setBounds(30, 165, 20, 20);
        check2.setBounds(30, 230, 20, 20);
        check3.setBounds(30, 295, 20, 20);
        check4.setBounds(270, 100, 20, 20);
        check5.setBounds(270, 165, 20, 20);
        check6.setBounds(270, 230, 20, 20);
        check7.setBounds(270, 295, 20, 20);
        
        preco0.setBounds(130, 100, 60, 20);
        preco1.setBounds(130, 165, 60, 20);
        preco2.setBounds(130, 230, 60, 20);
        preco3.setBounds(130, 295, 60, 20);
        preco4.setBounds(370, 100, 60, 20);
        preco5.setBounds(370, 165, 60, 20);
        preco6.setBounds(370, 230, 60, 20);
        preco7.setBounds(370, 295, 60, 20);
        
        
        spinner0.setBounds(130, 90, 60, 20);
        spinner1.setBounds(130, 155, 60, 20);
        spinner2.setBounds(130, 220, 60, 20);
        spinner3.setBounds(130, 285, 60, 20);
        spinner4.setBounds(370, 90, 60, 20);
        spinner5.setBounds(370, 155, 60, 20);
        spinner6.setBounds(370, 220, 60, 20);
        spinner7.setBounds(370, 285, 60, 20);
        
        spinner0.setVisible(false);
        spinner1.setVisible(false);
        spinner2.setVisible(false);
        spinner3.setVisible(false);
        spinner4.setVisible(false);
        spinner5.setVisible(false);
        spinner6.setVisible(false);
        spinner7.setVisible(false);
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="O resto">
        painel = new PedidoView();
        
        lPedido = new JLabel("Pedido Nº: " + nPedido);
        placaCarro = new JLabel("Placa do Carro:");
        tPlacaCarro = new JFormattedTextField(maskPlaca);
        lanches = new JLabel("Lanches");
        bebidas = new JLabel("Bebidas");
        
        bAdicionar = new JButton("Adicionar ao carrinho");
        bConfirmar = new JButton("<html> <p style=\"text-align:center;\">Confirmar<br>Pedido</p></html>");
        bLimpar = new JButton("<html> <p style=\"text-align:center;\">Remover<br>Tudo</p></html>");
        bRemover = new JButton("<html> <p style=\"text-align:center;\">Remover<br>Selecionados</p></html>");
        this.add(painel);
        this.add(lPedido);
        this.add(placaCarro);
        this.add(tPlacaCarro);
        this.add(lanches);
        this.add(bebidas);
        this.add(bAdicionar);
        this.add(bConfirmar);
        this.add(bLimpar);
        this.add(bRemover);
        
        bVoltar = new JButton("Menu inicial");
        this.add(bVoltar);
        bVoltar.setBounds(650, 10, 130, 20);
        bVoltar.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            frame.setSize(640, 480);
            frame.tela.setVisible(true);
            frame.setTitle("Rodf Lanches");
            frame.setLocationRelativeTo(null);
            bVoltar.setBounds(650, 10, 130, 20);
        });
        
        lPedido.setBounds(100, 10, 100, 20);
        placaCarro.setBounds(300, 10, 90, 20);
        tPlacaCarro.setBounds(394, 12, 70, 20);
        lanches.setBounds(63, 47, 60, 20);
        bebidas.setBounds(305, 47, 60, 20);
        bAdicionar.setBounds(180, 350, 170, 30);
        bRemover.setBounds(675, 100, 100, 40);
        bLimpar.setBounds(675, 150, 100, 40);
        bConfirmar.setBounds(675, 300, 100, 100);
//</editor-fold>

        //<editor-fold defaultstate="collapsed" desc="ActionListener dos JCheckBox">
        check0.addActionListener((ActionEvent e) -> {
            if (check0.isSelected()) {
                spinner0.setVisible(true);
                n1 = 10;
            }
            else {
                spinner0.setVisible(false);
                n1 = 0;
                spinner0.setValue(1);
                preco0.setText(df.format(dPreco[0]));
            }
            preco0.setBounds(130, 100 + n1, 100, 20);
        });
        
        check1.addActionListener((ActionEvent e) -> {
            if (check1.isSelected()) {
                spinner1.setVisible(true);
                n1 = 10;
            }
            else {
                spinner1.setVisible(false);
                n1 = 0;
                spinner1.setValue(1);
                preco1.setText(df.format(dPreco[1]));
            }
            preco1.setBounds(130, 165 + n1, 100, 20);
        });
        check2.addActionListener((ActionEvent e) -> {
            if (check2.isSelected()) {
                spinner2.setVisible(true);
                n1 = 10;
            }
            else {
                spinner2.setVisible(false);
                n1 = 0;
                spinner2.setValue(1);
                preco2.setText(df.format(dPreco[2]));
            }
            preco2.setBounds(130, 230 + n1, 100, 20);
        });
        check3.addActionListener((ActionEvent e) -> {
            if (check3.isSelected()) {
                spinner3.setVisible(true);
                n1 = 10;
            }
            else {
                spinner3.setVisible(false);
                n1 = 0;
                spinner3.setValue(1);
                preco3.setText(df.format(dPreco[3]));
            }
            preco3.setBounds(130, 295 + n1, 100, 20);
        });
        check4.addActionListener((ActionEvent e) -> {
            if (check4.isSelected()) {
                spinner4.setVisible(true);
                n1 = 10;
            }
            else {
                spinner4.setVisible(false);
                n1 = 0;
                spinner4.setValue(1);
                preco4.setText(df.format(dPreco[4]));
            }
            preco4.setBounds(370, 100 + n1, 100, 20);
        });
        check5.addActionListener((ActionEvent e) -> {
            if (check5.isSelected()) {
                spinner5.setVisible(true);
                n1 = 10;
            }
            else {
                spinner5.setVisible(false);
                n1 = 0;
                spinner5.setValue(1);
                preco5.setText(df.format(dPreco[5]));
            }
            preco5.setBounds(370, 165 + n1, 100, 20);
        });
        check6.addActionListener((ActionEvent e) -> {
            if (check6.isSelected()) {
                spinner6.setVisible(true);
                n1 = 10;
            }
            else {
                spinner6.setVisible(false);
                n1 = 0;
                spinner6.setValue(1);
                preco6.setText(df.format(dPreco[6]));
            }
            preco6.setBounds(370, 230 + n1, 100, 20); 
        });
        check7.addActionListener((ActionEvent e) -> {
            if (check7.isSelected()) {
                spinner7.setVisible(true);
                n1 = 10;
            }
            else {
                spinner7.setVisible(false);
                n1 = 0;
                spinner7.setValue(1);
                preco7.setText(df.format(dPreco[7]));
            }
            preco7.setBounds(370, 295 + n1, 100, 20); 
        });
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="EventListener dos JComboBox"> 
        
        spinner0.addChangeListener((ChangeEvent e) -> {
            if ((int)spinner0.getValue() > 1) preco0.setText("Total: " + df.format(dPreco[0] * (int) spinner0.getValue()));
            else preco0.setText(df.format(dPreco[0]));
        });
        spinner1.addChangeListener((ChangeEvent e) -> {
            if ((int)spinner1.getValue() > 1) preco1.setText("Total: " + df.format(dPreco[1] * (int) spinner1.getValue()));
            else preco1.setText(df.format(dPreco[1]));
        });
        spinner2.addChangeListener((ChangeEvent e) -> {
            if ((int)spinner2.getValue() > 1) preco2.setText("Total: " + df.format(dPreco[2] * (int) spinner2.getValue()));
            else preco2.setText(df.format(dPreco[2]));
        });
        spinner3.addChangeListener((ChangeEvent e) -> {
            if ((int)spinner3.getValue() > 1) preco3.setText("Total: " + df.format(dPreco[3] * (int) spinner3.getValue()));
            else preco3.setText(df.format(dPreco[3]));
        });
        spinner4.addChangeListener((ChangeEvent e) -> {
            if ((int)spinner4.getValue() > 1) preco4.setText("Total: " + df.format(dPreco[4] * (int) spinner4.getValue()));
            else preco4.setText(df.format(dPreco[4]));
        });
        spinner5.addChangeListener((ChangeEvent e) -> {
            if ((int)spinner5.getValue() > 1) preco5.setText("Total: " + df.format(dPreco[5] * (int) spinner5.getValue()));
            else preco5.setText(df.format(dPreco[5]));
        });
        spinner6.addChangeListener((ChangeEvent e) -> {
            if ((int)spinner6.getValue() > 1) preco6.setText("Total: " + df.format(dPreco[6] * (int) spinner6.getValue()));
            else preco6.setText(df.format(dPreco[6]));
        });
        spinner7.addChangeListener((ChangeEvent e) -> {
            if ((int)spinner7.getValue() > 1) preco7.setText("Total: " + df.format(dPreco[7] * (int) spinner7.getValue()));
            else preco7.setText(df.format(dPreco[7]));
        });
        
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="adicionar.addActionListener">
        bAdicionar.addActionListener((ActionEvent e) -> {
            if (check0.isSelected()) {
                painel.AddProd0((int)spinner0.getValue());
                check0.doClick();
            }
            if (check1.isSelected()) {
                painel.AddProd1((int)spinner1.getValue());
                check1.doClick();
            }
            if (check2.isSelected()) {
                painel.AddProd2((int)spinner2.getValue());
                check2.doClick();
            }
            if (check3.isSelected()) {
                painel.AddProd3((int)spinner3.getValue());
                check3.doClick();
            }
            if (check4.isSelected()) {
                painel.AddProd4((int)spinner4.getValue());
                check4.doClick();
            }
            if (check5.isSelected()) {
                painel.AddProd5((int)spinner5.getValue());
                check5.doClick();
            }
            if (check6.isSelected()) {
                painel.AddProd6((int)spinner6.getValue());
                check6.doClick();
            }
            if (check7.isSelected()) {
                painel.AddProd7((int)spinner7.getValue());
                check7.doClick();
            }
        });
//</editor-fold>
        bRemover.addActionListener((ActionEvent e) -> {
            //<editor-fold defaultstate="collapsed" desc="If painel.check0.isSelected()">
            int y;
            if (painel.check0.isSelected()) {
                painel.check0.setSelected(false);
                y = painel.prod0.getY();
                painel.total -= painel.dPreco[0] * painel.quant[0];
                painel.prod0.setVisible(false);
                painel.remove(painel.prod0);
                painel.bool[0] = false;
                painel.quant[0] = 0;
                painel.x -= 35;
                try {
                    if (painel.prod0.getY() > y) painel.prod0.setBounds(0, painel.prod0.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod1.getY() > y) painel.prod1.setBounds(0, painel.prod1.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod2.getY() > y) painel.prod2.setBounds(0, painel.prod2.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod3.getY() > y) painel.prod3.setBounds(0, painel.prod3.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod4.getY() > y) painel.prod4.setBounds(0, painel.prod4.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod5.getY() > y) painel.prod5.setBounds(0, painel.prod5.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod6.getY() > y) painel.prod6.setBounds(0, painel.prod6.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod7.getY() > y) painel.prod7.setBounds(0, painel.prod7.getY()-35, 300, 30);
                } catch(Exception ex){}
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="If painel.check1.isSelected()">
            if (painel.check1.isSelected()) {
                painel.check1.setSelected(false);
                y = painel.prod1.getY();
                painel.total -= painel.dPreco[1] * painel.quant[1];
                painel.prod1.setVisible(false);
                painel.remove(painel.prod1);
                painel.bool[1] = false;
                painel.quant[1] = 0;
                painel.x -= 35;
                try {
                    if (painel.prod0.getY() > y) painel.prod0.setBounds(0, painel.prod0.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod1.getY() > y) painel.prod1.setBounds(0, painel.prod1.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod2.getY() > y) painel.prod2.setBounds(0, painel.prod2.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod3.getY() > y) painel.prod3.setBounds(0, painel.prod3.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod4.getY() > y) painel.prod4.setBounds(0, painel.prod4.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod5.getY() > y) painel.prod5.setBounds(0, painel.prod5.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod6.getY() > y) painel.prod6.setBounds(0, painel.prod6.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod7.getY() > y) painel.prod7.setBounds(0, painel.prod7.getY()-35, 300, 30);
                } catch(Exception ex){}
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="If painel.check2.isSelected()">
            if (painel.check2.isSelected()) {
                painel.check2.setSelected(false);
                y = painel.prod2.getY();
                painel.total -= painel.dPreco[2] * painel.quant[2];
                painel.prod2.setVisible(false);
                painel.remove(painel.prod2);
                painel.bool[2] = false;
                painel.quant[2] = 0;
                painel.x -= 35;
                try {
                    if (painel.prod0.getY() > y) painel.prod0.setBounds(0, painel.prod0.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod1.getY() > y) painel.prod1.setBounds(0, painel.prod1.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod2.getY() > y) painel.prod2.setBounds(0, painel.prod2.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod3.getY() > y) painel.prod3.setBounds(0, painel.prod3.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod4.getY() > y) painel.prod4.setBounds(0, painel.prod4.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod5.getY() > y) painel.prod5.setBounds(0, painel.prod5.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod6.getY() > y) painel.prod6.setBounds(0, painel.prod6.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod7.getY() > y) painel.prod7.setBounds(0, painel.prod7.getY()-35, 300, 30);
                } catch(Exception ex){}
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="If painel.check3.isSelected()">
            if (painel.check3.isSelected()) {
                painel.check3.setSelected(false);
                y = painel.prod3.getY();
                painel.total -= painel.dPreco[3] * painel.quant[3];
                painel.prod3.setVisible(false);
                painel.remove(painel.prod3);
                painel.bool[3] = false;
                painel.quant[3] = 0;
                painel.x -= 35;
                try {
                    if (painel.prod0.getY() > y) painel.prod0.setBounds(0, painel.prod0.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod1.getY() > y) painel.prod1.setBounds(0, painel.prod1.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod2.getY() > y) painel.prod2.setBounds(0, painel.prod2.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod3.getY() > y) painel.prod3.setBounds(0, painel.prod3.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod4.getY() > y) painel.prod4.setBounds(0, painel.prod4.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod5.getY() > y) painel.prod5.setBounds(0, painel.prod5.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod6.getY() > y) painel.prod6.setBounds(0, painel.prod6.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod7.getY() > y) painel.prod7.setBounds(0, painel.prod7.getY()-35, 300, 30);
                } catch(Exception ex){}
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="If painel.check4.isSelected()">
            if (painel.check4.isSelected()) {
                painel.check4.setSelected(false);
                y = painel.prod4.getY();
                painel.total -= painel.dPreco[4] * painel.quant[4];
                painel.prod4.setVisible(false);
                painel.remove(painel.prod4);
                painel.bool[4] = false;
                painel.quant[4] = 0;
                painel.x -= 35;try {
                    if (painel.prod0.getY() > y) painel.prod0.setBounds(0, painel.prod0.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod1.getY() > y) painel.prod1.setBounds(0, painel.prod1.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod2.getY() > y) painel.prod2.setBounds(0, painel.prod2.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod3.getY() > y) painel.prod3.setBounds(0, painel.prod3.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod4.getY() > y) painel.prod4.setBounds(0, painel.prod4.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod5.getY() > y) painel.prod5.setBounds(0, painel.prod5.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod6.getY() > y) painel.prod6.setBounds(0, painel.prod6.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod7.getY() > y) painel.prod7.setBounds(0, painel.prod7.getY()-35, 300, 30);
                } catch(Exception ex){}
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="If painel.check5.isSelected()">
            if (painel.check5.isSelected()) {
                painel.check5.setSelected(false);
                y = painel.prod5.getY();
                painel.total -= painel.dPreco[5] * painel.quant[5];
                painel.prod5.setVisible(false);
                painel.remove(painel.prod5);
                painel.bool[5] = false;
                painel.quant[5] = 0;
                painel.x -= 35;
                try {
                    if (painel.prod0.getY() > y) painel.prod0.setBounds(0, painel.prod0.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod1.getY() > y) painel.prod1.setBounds(0, painel.prod1.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod2.getY() > y) painel.prod2.setBounds(0, painel.prod2.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod3.getY() > y) painel.prod3.setBounds(0, painel.prod3.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod4.getY() > y) painel.prod4.setBounds(0, painel.prod4.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod5.getY() > y) painel.prod5.setBounds(0, painel.prod5.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod6.getY() > y) painel.prod6.setBounds(0, painel.prod6.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod7.getY() > y) painel.prod7.setBounds(0, painel.prod7.getY()-35, 300, 30);
                } catch(Exception ex){}
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="If painel.check6.isSelected()">
            if (painel.check6.isSelected()) {
                painel.check6.setSelected(false);
                painel.total -= painel.dPreco[6] * painel.quant[6];
                y = painel.prod6.getY();
                painel.prod6.setVisible(false);
                painel.remove(painel.prod6);
                painel.bool[6] = false;
                painel.quant[6] = 0;
                painel.x -= 35;
                try {
                    if (painel.prod0.getY() > y) painel.prod0.setBounds(0, painel.prod0.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod1.getY() > y) painel.prod1.setBounds(0, painel.prod1.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod2.getY() > y) painel.prod2.setBounds(0, painel.prod2.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod3.getY() > y) painel.prod3.setBounds(0, painel.prod3.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod4.getY() > y) painel.prod4.setBounds(0, painel.prod4.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod5.getY() > y) painel.prod5.setBounds(0, painel.prod5.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod6.getY() > y) painel.prod6.setBounds(0, painel.prod6.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod7.getY() > y) painel.prod7.setBounds(0, painel.prod7.getY()-35, 300, 30);
                } catch(Exception ex){}
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="If painel.check7.isSelected()">
            if (painel.check7.isSelected()) {
                painel.check7.setSelected(false);
                y = painel.prod7.getY();
                painel.total -= painel.dPreco[7] * painel.quant[7];
                painel.prod7.setVisible(false);
                painel.remove(painel.prod7);
                painel.bool[7] = false;
                painel.quant[7] = 0;
                painel.x -= 35;
                try {
                    if (painel.prod0.getY() > y) painel.prod0.setBounds(0, painel.prod0.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod1.getY() > y) painel.prod1.setBounds(0, painel.prod1.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod2.getY() > y) painel.prod2.setBounds(0, painel.prod2.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod3.getY() > y) painel.prod3.setBounds(0, painel.prod3.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod4.getY() > y) painel.prod4.setBounds(0, painel.prod4.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod5.getY() > y) painel.prod5.setBounds(0, painel.prod5.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod6.getY() > y) painel.prod6.setBounds(0, painel.prod6.getY()-35, 300, 30);
                } catch(Exception ex){}
                try {
                    if (painel.prod7.getY() > y) painel.prod7.setBounds(0, painel.prod7.getY()-35, 300, 30);
                } catch(Exception ex){}
            }
            painel.texttotal.setText("Total: " + df.format(painel.total));
            //</editor-fold>
        });
        bLimpar.addActionListener((ActionEvent e) -> {
            //<editor-fold defaultstate="collapsed" desc="limpar">
            try {
                painel.check0.setSelected(false);
            } catch(Exception ex) {}
            try {
                painel.check1.setSelected(false);
            } catch(Exception ex) {}
            try {
                painel.check2.setSelected(false);
            } catch(Exception ex) {}
            try {
                painel.check3.setSelected(false);
            } catch(Exception ex) {}
            try {
                painel.check4.setSelected(false);
            } catch(Exception ex) {}
            try {
                painel.check5.setSelected(false);
            } catch(Exception ex) {}
            try {
                painel.check6.setSelected(false);
            } catch(Exception ex) {}
            try {
                painel.check7.setSelected(false);
            } catch(Exception ex) {}
            
            try {
                painel.prod0.setVisible(false);
            } catch(Exception ex) {}
            try {
                painel.prod1.setVisible(false);
            } catch(Exception ex) {}
            try {
                painel.prod2.setVisible(false);
            } catch(Exception ex) {}
            try {
                painel.prod3.setVisible(false);
            } catch(Exception ex) {}
            try {
                painel.prod4.setVisible(false);
            } catch(Exception ex) {}
            try {
                painel.prod5.setVisible(false);
            } catch(Exception ex) {}
            try {
                painel.prod6.setVisible(false);
            } catch(Exception ex) {}
            try {
                painel.prod7.setVisible(false);
            } catch(Exception ex) {}
            try {
                painel.remove(painel.prod0);
            } catch(Exception ex) {}
            try {
                painel.remove(painel.prod1);
            } catch(Exception ex) {}
            try {
                painel.remove(painel.prod2);
            } catch(Exception ex) {}
            try {
                painel.remove(painel.prod3);
            } catch(Exception ex) {}
            try {
                painel.remove(painel.prod4);
            } catch(Exception ex) {}
            try {
                painel.remove(painel.prod5);
            } catch(Exception ex) {}
            try {
                painel.remove(painel.prod6);
            } catch(Exception ex) {}
            try {
                painel.remove(painel.prod7);
            } catch(Exception ex) {}
            
            painel.x = 25;
            for (int i = 0; i < 8; i++) {
                painel.bool[i] = false;
                painel.quant[i] = 0;
            }
            painel.total = 0;
            painel.texttotal.setText("Total: " + df.format(painel.total));
            tPlacaCarro.setText("");
            //</editor-fold>
        });
        bConfirmar.addActionListener(this);
        
        this.setLayout(null);
        this.setBounds(0,0,800,450);
        this.setVisible(false);
        this.setBackground(Color.decode("#dddddd"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int j = JOptionPane.showOptionDialog(null, "Você deseja finalizar o pedido?", "", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, 2);
        switch(j) {
            case 0:
                try {
                    ArrayList aProdutos = new ArrayList();
                    Pedido aPedido = new Pedido();
                    aPedido.setPlaca(tPlacaCarro.getText());        
                    aPedido.setValorTotal(painel.total);
                    aPedido.setStatus(false);
                    aPedido.setNumeroPedido(""+ nPedido);
                    String fim = "Número: " + nPedido + "\nPlaca do Carro: " + tPlacaCarro.getText() + "\nItens: \n";

                    for (int i = 0; i < 8; i++) {
                        try {
                            if (painel.quant[i] > 0) {
                                Produtos produto = new Produtos();
                                produto.setNome("" + i);
                                produto.setQuantidade(painel.quant[i]);
                                aProdutos.add(produto);
                                fim += painel.quant[i] + "x "+df.format(dPreco[i]) + "\n";
                            }
                        } catch(Exception ex) {}
                    }
                    fim += "\nTotal: " + df.format(painel.total);
                    aPedido.setItensDoPedido(aProdutos);
                    aPedido.setValorTotal(painel.total);
                    fila.queue(aPedido);
                    nPedido++;
                    lPedido.setText("Pedido Nº: " + nPedido);
                    bLimpar.doClick();
                    JOptionPane.showMessageDialog(null, fim, "Pedido Finalizado", JOptionPane.PLAIN_MESSAGE);
                    break;
                } catch (PlacaVaziaException ex) {JOptionPane.showMessageDialog(null, "Insira uma placa válida do veículo.", "ERRO", JOptionPane.ERROR_MESSAGE);}
        }
    }
}