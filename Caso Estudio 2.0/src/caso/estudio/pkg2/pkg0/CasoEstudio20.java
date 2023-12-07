/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.estudio.pkg2.pkg0;

import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class CasoEstudio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Amigo[] amigos = new Amigo[4];
        amigos[0] = new Amigo("Junito");
        amigos[1] = new Amigo("Andrea");
        amigos[2] = new Amigo("Andres");
        amigos[3] = new Amigo("Carlos");
 
        
        amigos[0].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite los gastos de Juanito:")));
        amigos[1].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite los gastos de Andrea:")));
        amigos[2].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite los gastos de Andres:")));
        amigos[3].agregarGasto(Integer.parseInt(JOptionPane.showInputDialog("Digite los gastos de Carlos:")));
 
        
        double gastoTotal = 0;
        for (Amigo amigo : amigos) {
            gastoTotal += amigo.getDineroGastado();
        }
 
        
        for (Amigo amigo : amigos) {
            System.out.println("El gasto de " + amigo.getname() + " es: " + (amigo.getDineroGastado() / gastoTotal) * 100 + "%");
        }
        
        Grupo grupo = new Grupo(4);

        grupo.agregarMovimiento("Juanito", -5);
        grupo.agregarMovimiento("Andrea", -20);
        grupo.agregarMovimiento("Andres", 115);
        grupo.agregarMovimiento("Carlos", -60);

        grupo.calcularSaldoTotal();
    }
}
    
    

