public class tiempocompleto extends empleado {
    private int salarioporhora=200; 
    private double salarioAnual;
    private int horasExtras; 


    public tiempocompleto(String nombre, String numIdentificacion, String nombredelArea, String jefedelArea, double salarioAnual, int horasExtras) {
        super(nombre, numIdentificacion, nombredelArea,jefedelArea);
        this.salarioAnual = salarioAnual;
        this.horasExtras=horasExtras; 
    }

    @Override
    public double calcularSalario() {
        return salarioAnual+(horasExtras*salarioporhora);
    
    }


}
