package empresa;

import java.util.ArrayList;
import java.util.List;

public class empleados {

    private static int getcedula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private String nombres;
    private String cedula;
    private String salarios;

    public empleados(String nombres, String cedula, String salarios) {
        this.nombres = nombres;
        this.cedula = cedula;
        this.salarios = salarios;
    }

    public String getNombres() {
        return nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public String getSalarios() {
        return salarios;
    }
     public String toString() {
        return "Empleado{" +
                "Nombre='" + nombres + '\'' +
                ", Cedula=" + cedula +
                ", Salario=" + salarios +
                '}';
    }
               
     public static class Aempleados {
        private List<empleados> listaempleados;
         
        public Aempleados(){
             this.listaempleados = new ArrayList<>();
         }
        public void agregarempleados (empleados Empleados){
             listaempleados.add(Empleados);
             System.out.println("Empleado agregado: " + Empleados.getNombres());
         }
        public empleados buscarempleadocedula(int codigo) {
            for (empleados Empleados : listaempleados) {
                if (empleados.getcedula() == codigo) {
                    return Empleados;
                }
            }
            return null; 
            
        }
        
        public boolean eliminarEmpleadocedula(int cedula) {
            empleados Empleados = buscarempleadocedula(cedula);
            if (Empleados != null) {
                listaempleados.remove(Empleados);
                System.out.println("Empleado eliminado: " + Empleados.getNombres());
                return true;
            }
            return false;
        }
        
        public void mostrarempleados() {
            if (listaempleados.isEmpty()) {
                System.out.println("No hay empleados en la lista.");
            } else {
                System.out.println("Lista de empleados:");
                for (empleados empleado : listaempleados) {
                    System.out.println(empleado);
                }
            }
        }
    }  
}
         
        
    
   

   