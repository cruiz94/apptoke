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
public class Familia {
    
    private String hijo;
    private String padre;
    
   
    
    public Familia( String hijo, String padre){
        
        this.hijo= hijo;
        this.padre=padre;
    }

    public String getHijo() {
        return hijo;
    }

    public void setHijo(String hijo) {
        this.hijo = hijo;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }
    
}
