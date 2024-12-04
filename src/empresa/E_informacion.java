package empresa;

public class E_informacion {
    private String nombres;
    private int RUC;
    private String direccion;
    private String email;

    public E_informacion(String nombres, int RUC, String direccion, String email) {
        this.nombres = nombres;
        this.RUC = RUC;
        this.direccion = direccion;
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public int getRUC() {
        return RUC;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
