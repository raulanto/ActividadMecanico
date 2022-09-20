package pqTrabajo;

public class Administrativo extends  Empleado{
    //Atributos
    String puesto;
    String AreaLaboral;
    //Constructor
    public Administrativo(String nombre, String apellidoPaterno, String apellidoMaterno, int añosAntiguedad, float salarioBase) {
        super(nombre, apellidoPaterno, apellidoMaterno, añosAntiguedad, salarioBase);
    }
    //Metodos
    @Override
    public void mostrarEmpleado() {
        super.mostrarEmpleado();
        String a="\n Puesto: "+getPuesto();
        a+="\nArea Laboral"+getAreaLaboral();
        System.out.print(a);
    }

    //Gettss y Setts
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAreaLaboral() {
        return AreaLaboral;
    }

    public void setAreaLaboral(String areaLaboral) {
        AreaLaboral = areaLaboral;
    }
}
