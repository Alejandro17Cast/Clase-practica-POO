abstract public class empleado {

    private String nombre;
    private String numIdentificacion;
    private String nombredelArea; 
    private String jefedelArea; 
   

    public empleado(String nombre, String numIdentificacion, String nombredelArea, String jefedelArea) {
        this.nombre = nombre;
        this.numIdentificacion = numIdentificacion;
        this.nombredelArea= nombredelArea; 
        this.jefedelArea= jefedelArea; 
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public String getNombredelArea() {
        return nombredelArea;
    }

    public String getJefedelArea() {
        return jefedelArea;
    }

    public abstract double calcularSalario();

}
