package mpclase_11_02;


import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 51930
 */
public class VectorReales {
    
    
    private double vector[];
    private int totalElementos;

    public int getTotalElementos() {
        return totalElementos;
    }

    public double devolverElemento(int i){
        return vector[i];
    }
    
    
    public VectorReales() {
        vector = new double[50];
        totalElementos = 0;
    }

    public VectorReales(int limite) {
        vector = new double[limite];
        totalElementos = 0;
    }
    
    public boolean agregar(double valor) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = valor;
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

   public double sumar(VectorReales vector1)
   {
       
       int i;
       double pos=0;
       for ( i = 0; i < totalElementos; i++) {
           
       
           pos = vector[i]+vector1.vector[i];
           
       }
          return pos;
       
   }             

    
    public void mostrar(DefaultListModel modelo) {
        int i;
        modelo.removeAllElements();
        for (i = 0; i < totalElementos; i++) {
            modelo.addElement("[" + vector[i] + "]");
        }

    }

    
}
