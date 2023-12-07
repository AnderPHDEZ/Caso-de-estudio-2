/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.estudio.pkg2.pkg0;

/**
 *
 * @author ander
 */
public class Amigo {
    private final String Name;
    private double dineroGastado;

    public Amigo(String Name) {
        this.Name = Name;
        this.dineroGastado = 0;
    }

    public void agregarGasto(double gasto) {
        this.dineroGastado += gasto;
    }

    public String getname() {
        return Name;
    }

    public double getDineroGastado() {
        return dineroGastado;
    }
    
}
