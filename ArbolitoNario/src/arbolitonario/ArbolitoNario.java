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

//class NarioP{
//    Nodo raiz;
//    public Nodo insertarRaiz(String dato)
//    {
//        raiz = new Nodo(dato);
//        return raiz;
//    }
//    
//    public void verHijosRecursivo(Nodo nodo)
//    {
//        //se inicia con los padres
//        for (int i = 0; i < nodo.noHijos; i++) 
//        {
//            nodo.hijos[i].verNodo();
//            // se hace lo mismo con los nodos hijos
//            verHijosRecursivo(nodo.hijos[i]);
//        }
//    }
//    
//    public void InsertarRecursivo(Nodo nodo, String dato, String padre)
//    {
//        Nodo nuevo = new Nodo(dato);
//        //si el padre es la raiz
//        if(nodo.getDato().equals(padre))
//        {
//            nodo.aumentarHijo(nuevo);
//        }
//        else
//        {
//            //si el padre es alguno de los hijos
//            for (int i = 0; i < nodo.noHijos; i++) 
//            {
//                if(nodo.hijos[i].getDato().equals(padre))
//                {
//                    //se coloca el hijo en el nodo
//                    nodo.hijos[i].aumentarHijo(nuevo);
//                }
//                else
//                {
//                    InsertarRecursivo(nodo.hijos[i], dato, padre);
//                }                
//            }
//        }
//    }
//}
public class ArbolitoNario {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolitoPrueba menu = new ArbolitoPrueba();
        menu.setVisible(true);
        
        
//        NarioP arbol = new NarioP();
//        Nodo nodo =  arbol.insertarRaiz("Mi familia");
//        arbol.raiz.verNodo();
        
//        arbol.InsertarRecursivo(nodo, "Paterna", "Mi familia");
//        arbol.InsertarRecursivo(nodo, "Materna", "Mi familia");
//        
//        arbol.InsertarRecursivo(nodo,"[carlos castellanos] ,[esmeralda garcia rojas]","Paterna");
//        
//        arbol.InsertarRecursivo(nodo, "carlos castellanos", "Paterna");
//        arbol.InsertarRecursivo(nodo, "brenda castellanos", "Paterna");
//        arbol.InsertarRecursivo(nodo, "ricardo castellanos", "Paterna");
//        arbol.InsertarRecursivo(nodo, "omar castellanos", "Paterna");
//        arbol.InsertarRecursivo(nodo, "edgar castellanos", "Paterna");
//        arbol.InsertarRecursivo(nodo, "esmeralda castellanos", "Paterna");
//  
//        arbol.verHijosRecursivo(nodo);
    }
       
}
