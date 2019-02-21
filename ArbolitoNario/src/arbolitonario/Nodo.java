/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolitonario;

/**
 *
 * @author a10
 */
public class Nodo 
{
    String info;
    int noHijos;
    Nodo hijos[];
    Nodo hijosT[];
    
    public Nodo(String dato)
    {
        info = dato;
        this.noHijos = 0;
    }
    
    public void copiarHijos()
    {
        //aumenta en 1 los hijos con el arreglo temporal
        hijosT = new Nodo[noHijos+1];
        for (int i = 0; i < this.noHijos; i++) 
        {
            hijosT[i] = hijos[i];
        }
    }
    
    public void aumentarHijo(Nodo nodo)
    {
        copiarHijos();
        hijosT[this.noHijos] = nodo;
        hijos = hijosT;
        this.noHijos++;
    }
    
    public String getDato()
    {
        return info;
    }
    
    public void setDato(String dato)
    {
        info = dato;
    }

    public String verDato() {
        return "" + info ;
    }
    
    public void otroVer()
    {
         System.out.println("" + info );
    }
    
    
    
}
