package pqTrabajo;
    /*

     */
public class Empleado extends Persona{
   //Atributo
    String clave;
    int añosAntiguedad;
    float salarioBase;
    float primaAntiguedad;
    float comision;
    float montoServiciosGenerados;

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
    }
    //Constructor
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int añosAntiguedad, float salarioBase) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.añosAntiguedad = añosAntiguedad;
        this.salarioBase = salarioBase;
    }

    //Metodos;
    public void calcularPrimaAntiguedad(){
        /*
        Si antigüedad es mayor o igual a 25: prima de antigüedad = salario base * 15%
        Si antigüedad es mayor o igual a 15: prima de antigüedad = salario base * 7.5%
        Si antigüedad es mayor o igual a 5: prima de antigüedad = salario base * 2.5%
         */
        if(añosAntiguedad>=25){
            primaAntiguedad=getSalarioBase()*0.15F;
        }else if (añosAntiguedad>=15){
            primaAntiguedad=getSalarioBase()*0.075F;
        } else if (añosAntiguedad>=5) {
            primaAntiguedad=getSalarioBase()*0.025F;

        }

    }
    public void calcularComision(){
        /*
        Si monto por servicios es mayor o igual a 30000, comisión = monto por servicios * 6%
        Si monto por servicios es mayor o igual a 20000, comisión = monto por servicios * 4%
        Si monto por servicios es mayor o igual a 10000, comisión = monto por servicios * 2%
        */
        if (montoServiciosGenerados>=30000){
            comision=getMontoServiciosGenerados()*0.6F;
        } else if (montoServiciosGenerados>=20000) {
            comision=getMontoServiciosGenerados()*0.4F;
        } else if (montoServiciosGenerados>=10000) {
            comision=getMontoServiciosGenerados()*0.2F;
        }

    }
    public void incrementarMontoServicios(float a){
        /*
        que reciba como parámetro un monto (flotante) y lo sume al
        monto de los servicios realizados por el empleado.
         */
         montoServiciosGenerados=montoServiciosGenerados+a;
    }
    public void mostrarEmpleado(){
        String a="";
        a+="\nNombre Empleado: "+getNombre()+" "+getApellidoPaterno()+" "+getApellidoMaterno();
        a+="\nAños de Antiguedad: "+getAñosAntiguedad();
        a+="\nSalario base: "+getSalarioBase();
        a+="\nPrima de Antiguedad: "+getPrimaAntiguedad();
        a+="\nComisión: "+getComision();
        a+="\nMonto por servicio generado:"+getMontoServiciosGenerados();
        System.out.println(a);
    }
    //Getter y Setter

    public String getClave() {
        return clave;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public float getPrimaAntiguedad() {
        return primaAntiguedad;
    }

    public float getComision() {
        return comision;
    }

    public float getMontoServiciosGenerados() {
        return montoServiciosGenerados;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
}
