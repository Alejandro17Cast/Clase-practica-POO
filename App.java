public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\tHello, Fuck*ng World!");

        empleado Empleado[] = new empleado[2];
        Empleado[0] = new Mediotiempo("Luis", "220109", "Marketing y Publicidad", "Esteban Acevedo", 40000, 6);

        Empleado[1] = new tiempocompleto("Gabriel", "223366", "Derechos Humanos", "Diego Vivas", 32000, 8);

        System.out.println("\t\t Foreach");
        for (empleado empleado : Empleado) {
            System.out.println("\tArea de trabajo: " + empleado.getNombredelArea());
            System.out.println("\tNombre del jefe de Area: " + empleado.getJefedelArea());
            System.out.println("\tEmpleado: " + empleado.getNombre());
            System.out.println("\tSalario mensual: " + empleado.calcularSalario());
            System.out.println("                                                  ");
        }

        System.out.println("\t\t For");
        for (int i = 0; i < Empleado.length; i++) {
            System.out.println("\tArea de trabajo: " + Empleado[i].getNombredelArea());
            System.out.println("\tNombre del jefe de Area: " + Empleado[i].getJefedelArea());
            System.out.println("\tEmpleado: " + Empleado[i].getNombre());
            System.out.println("\tSalario mensual: " + Empleado[i].calcularSalario());
            System.out.println("                                                  ");
        }

        

    }
}
