/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.estudio.pkg2.pkg0;

/**
 *
 * @author ander
 */
public class Grupo {
    Movimiento[] movimientos;

public Grupo(int tamaño) {
 movimientos = new Movimiento[tamaño];

class Movimiento {

   String name; 
   double Monto; 

   public Movimiento(String nombre, double Monto) {
   this.name = nombre;
   this.Monto = Monto;
            }
        }
    }

    public void agregarMovimiento(String name, double Monto) {
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] == null) {
                movimientos[i] = new Movimiento(name, Monto);
                break;
            }
        }
    }

    public void calcularSaldoTotal() {
        String name = movimientos[0].name;
        double total = 0;

        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] != null && movimientos[i].name.equals(name)) {
                total += movimientos[i].Monto;
            }
        }

        System.out.println("El total de deudas de " + name + " es de: " + total + " dolares.");
    }
}
    

