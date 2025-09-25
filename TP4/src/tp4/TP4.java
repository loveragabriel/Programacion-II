/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

/**
 *
 * @author Gabriel
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado empleado1 = new Empleado(100, "Gabriel Lovera", "Desarrollador", 1500);
        Empleado empleado2 = new Empleado("Eduardo Pantoja", "Desarrollador");

        empleado1.actualizarSalario(0.10);
        empleado2.actualizarSalario(500);
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println("Total de empleado es de " + Empleado.mostrarTotalEmpleados());
    }

    static class Empleado {
        private int id;
        private String nombre;
        private String puesto;
        private double salario;
        private static int totalEmpleados = 0;

        private static int autoID = 1;
        
        //Constructor 
        public Empleado(int id, String nombre, String puesto, double salario) {
            this.id = id;
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = salario;
            totalEmpleados++;
        }
        
        //Constructor SObreacargado
        public Empleado(String nombre, String puesto) {
            this.id = autoID++;
            this.nombre = nombre;
            this.puesto = puesto;
            this.salario = 1200;
            totalEmpleados++;
        }
        
        public void actualizarSalario (double porcentaje){
            salario = salario + (salario * porcentaje);
        }
        
        public void actualizarSalario (int cantidad){
            salario = salario + cantidad;
        }
        
        @Override
        public String toString(){
            return "Empleado:{" + "id=" + id
                    + ", nombre=" + nombre 
                    + ", puesto=" + puesto
                    + ", salario=" + salario + "}";
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPuesto(String puesto) {
            this.puesto = puesto;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public int getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public String getPuesto() {
            return puesto;
        }

        public double getSalario() {
            return salario;
        }
        
        public static int mostrarTotalEmpleados(){
            return totalEmpleados;
        }
    }
}
