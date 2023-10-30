
package JavaBeans;

import java.util.ArrayList;

public class Fila{
    ArrayList dados;
    
    public Fila() {
        dados=new ArrayList();
    }
    
    public void queue(Object obj) {
        dados.add (obj);
    }
    
    public Object dequeue() {
        Object temp = dados.get(0);
        dados.remove(0);
        return temp;
    }
    
    public boolean isEmpty () {
        return dados.isEmpty();
    }
    
    public int size () {
        return dados.size ();
    }
    
    public boolean hasMoreElements () {
        return dados.size () >0;
    }
}