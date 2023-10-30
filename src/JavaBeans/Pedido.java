
package JavaBeans;

import Exceptions.PlacaVaziaException;
import java.util.ArrayList;

public class Pedido {
    private String placa;
    private Boolean status;
    private ArrayList itensDoPedido;
    private double valorTotal;
    private String numeroPedido;

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws PlacaVaziaException {
        if (!placa.contains("_")) 
            this.placa = placa;
        else throw new PlacaVaziaException();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ArrayList getItensDoPedido() {
        return itensDoPedido;
    }

    public void setItensDoPedido(ArrayList itensDoPedido) {
        this.itensDoPedido = itensDoPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
}
