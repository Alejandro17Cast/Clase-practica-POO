public class Mediotiempo extends empleado {
    private double salarioporHora;
    private int horastrabajadas;
    
    

    public Mediotiempo(String nombre, String numIdentificacion, String nombredelArea, String jefedelArea,  double salarioporHora, int horastrabajadas) {
        super(nombre, numIdentificacion,nombredelArea,jefedelArea);
        this.salarioporHora = salarioporHora;
        this.horastrabajadas = horastrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioporHora * horastrabajadas * 4;
    }

}
