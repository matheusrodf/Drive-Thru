
package Interfaces;

import Exceptions.NaoConfirmadoException;
import JavaBeans.Fila;
import JavaBeans.Pedido;
import JavaBeans.Produtos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EntregaPedido extends JPanel implements ActionListener{
    JLabel numPedido, placa, status, total;
    JButton bVoltar, bEntregar, bVerifica, bNext;
    Fila fila;
    Pedido array;
    PedidosEntregaPedidos painel;
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    
    public EntregaPedido(TelaMenu frame, Fila fila){
        this.fila = fila;
        painel = new PedidosEntregaPedidos();
        this.add(painel);
        painel.setBounds(5, 150, 460, 290);
        
        
        JPanel infoCima = new JPanel();
        //<editor-fold desc="InfoCima">
        this.add(infoCima);
        infoCima.setBounds(5, 10, 460, 130);
        infoCima.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        infoCima.setLayout(null);
        infoCima.setBackground(Color.decode("#dddddd"));
        
        
        bVoltar = new JButton("Voltar");
        infoCima.add(bVoltar);
        bVoltar.setBounds(5, 5, 90, 30);
        
        bEntregar = new JButton("<html> <p style=\"text-align:center;\">Confirmar<br>Entrega</p></html>");
        infoCima.add(bEntregar);
        bEntregar.setBounds(40, 40, 100, 70);
        bEntregar.setBackground(Color.white);
        
        bVerifica = new JButton("<html> <p style=\"text-align:center;\">Verificar<br>Pedidos</p></html");
        infoCima.add(bVerifica);
        bVerifica.setBounds(180, 40, 100, 70);
        bVerifica.setBackground(Color.white);
        
        bNext = new JButton("<html> <p style=\"text-align:center;\">Próximo<br>Pedido</p></html>");
        infoCima.add(bNext);
        bNext.setBounds(320, 40, 100, 70);
        bNext.setBackground(Color.white);
        //</editor-fold>
        
        JPanel infoBaixo = new JPanel();
        //<editor-fold desc="infoBaixo">
        this.add(infoBaixo);
        infoBaixo.setBounds(5, 460, 460, 130);
        infoBaixo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        infoBaixo.setLayout(null);
        infoBaixo.setBackground(Color.decode("#dddddd"));
        
        numPedido = new JLabel("Número do pedido: ");
        infoBaixo.add(numPedido);
        numPedido.setBounds(20, 22, 200, 15);
        
        placa = new JLabel("Placa do carro: ");
        infoBaixo.add(placa);
        placa.setBounds(20, 59, 200, 15);
        
        status = new JLabel("Status do pedido: ");
        infoBaixo.add(status);
        status.setBounds(20, 94, 200, 15);
        
        total = new JLabel("<html> <p style=\"text-align:center;\">Total:<br>R$ 0,00</p></html>");
        infoBaixo.add(total);
        total.setBounds(250, 15, 160, 100);
        total.setFont(new Font("Arial",Font.BOLD,30));
        //</editor-fold>
        
        bVerifica.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null,"Existem " + fila.size() + " pedidos na fila.");
        });
        
        bEntregar.addActionListener(this);
        bNext.addActionListener(this);
        
        bVoltar.addActionListener((ActionEvent e) -> {
            this.setVisible(false);
            frame.setSize(640, 480);
            frame.tela.setVisible(true);
            frame.setTitle("Rodf Lanches");
            frame.setLocationRelativeTo(null);
        });
        
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setBounds(0,0,480,640);
        this.setVisible(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(bNext)){
            try {
                try{
                    Exception(array.getStatus());
                } catch (NullPointerException a) {}
                array = (Pedido) fila.dequeue();
                painel.RemoveAll();
                numPedido.setText("Número do pedido: " + array.getNumeroPedido());
                placa.setText("Placa do carro: " + array.getPlaca());
                status.setText("Status do pedido: Em andamento.");
                total.setText("<html> <p style=\"text-align:center;\">Total:<br>" + df.format(array.getValorTotal()) + "</p></html>");
                
                //Se for false, a posição X do AddProd é 29
                //Se for true, a posição X do AddProd é 235 e o Y aumenta 66
                boolean x = false;
                int y = 20;
                
                ArrayList itens = array.getItensDoPedido();
                Iterator it = itens.iterator();
                
                while (it.hasNext()) {
                    Produtos temp = (Produtos) it.next();
                
                    if (temp.getNome().equals("0")) {
                        if (!x) {
                            x = true;
                            painel.AddProd0(29, y, temp.getQuantidade());
                        }
                        else {
                            x = false;
                            painel.AddProd0(235, y, temp.getQuantidade());
                            y += 66;
                        }
                    }
                    
                    if (temp.getNome().equals("1")) {
                        if (!x) {
                            x = true;
                            painel.AddProd1(29, y, temp.getQuantidade());
                        }
                        else {
                            x = false;
                            painel.AddProd1(235, y, temp.getQuantidade());
                            y += 66;
                        }
                    }
                    
                    if (temp.getNome().equals("2")) {
                        if (!x) {
                            x = true;
                            painel.AddProd2(29, y, temp.getQuantidade());
                        }
                        else {
                            x = false;
                            painel.AddProd2(235, y, temp.getQuantidade());
                            y += 66;
                        }
                    }
                    
                    if (temp.getNome().equals("3")) {
                        if (!x) {
                            x = true;
                            painel.AddProd3(29, y, temp.getQuantidade());
                        }
                        else {
                            x = false;
                            painel.AddProd3(235, y, temp.getQuantidade());
                            y += 66;
                        }
                    }
                    
                    if (temp.getNome().equals("4")) {
                        if (!x) {
                            x = true;
                            painel.AddProd4(29, y, temp.getQuantidade());
                        }
                        else {
                            x = false;
                            painel.AddProd4(235, y, temp.getQuantidade());
                            y += 66;
                        }
                    }
                    
                    if (temp.getNome().equals("5")) {
                        if (!x) {
                            x = true;
                            painel.AddProd5(29, y, temp.getQuantidade());
                        }
                        else {
                            x = false;
                            painel.AddProd5(235, y, temp.getQuantidade());
                            y += 66;
                        }
                    }
                    
                    if (temp.getNome().equals("6")) {
                        if (!x) {
                            x = true;
                            painel.AddProd6(29, y, temp.getQuantidade());
                        }
                        else {
                            x = false;
                            painel.AddProd6(235, y, temp.getQuantidade());
                            y += 66;
                        }
                    }
                    
                    if (temp.getNome().equals("7")) {
                        if (!x) {
                            x = true;
                            painel.AddProd7(29, y, temp.getQuantidade());
                        }
                        else {
                            x = false;
                            painel.AddProd7(235, y, temp.getQuantidade());
                            y += 66;
                        }
                    }
                }
                   
            } catch (IndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "Não tem mais pedidos.", "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (NaoConfirmadoException exc) {
                JOptionPane.showMessageDialog(null, "Confirme o pedido atual\nantes de prosseguir.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource().equals(bEntregar)) {
            try {
                array.setStatus(true);
                status.setText("Status do pedido: Entregue.");
                
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Nenhum pedido selecionado.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void Exception(boolean confirm) throws NaoConfirmadoException{
        if (!confirm)
            throw new NaoConfirmadoException();
    }
}
