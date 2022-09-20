package pqTrabajo;

public class Mecanico extends Empleado{
    int añosExp;
    String especialidadDomina;

    public Mecanico(String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
    }

    public Mecanico(String nombre, String apellidoPaterno, String apellidoMaterno, int añosAntiguedad, float salarioBase) {
        super(nombre, apellidoPaterno, apellidoMaterno, añosAntiguedad, salarioBase);

    }
    //Metodos
    @Override
    public void calcularComision() {
        /*
        Si monto por servicios es mayor o igual a 35000, comisión = monto por servicios * 10%
        Si monto por servicios es mayor o igual a 25000, comisión = monto por servicios * 8%
        Si monto por servicios es mayor o igual a 15000, comisión = monto por servicios * 6%
         */
        if (montoServiciosGenerados>=35000){
            comision=getMontoServiciosGenerados()*0.10F;
        } else if (montoServiciosGenerados>=25000) {
            comision=getMontoServiciosGenerados()*0.8F;
        } else if (montoServiciosGenerados>=15000) {
            comision=getMontoServiciosGenerados()*0.6F;
        }
    }

    @Override
    public void mostrarEmpleado() {
        super.mostrarEmpleado();
        String a="";
        a+="\nAños de Experiencia: "+getAñosExp();
        a+="\nEspecilidad que Domina: "+getEspecialidadDomina();
        System.out.print(a);
    }
    //Metodo que retorna el valor del Salerio Neto.
    public float calcularSalarioNeto(){
        //salario neto = salario base + prima de antigüedad + comisión.
         float salerioNeto=salarioBase+primaAntiguedad+comision;
         return salerioNeto;
    }
    //Getts y Setts

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    public String getEspecialidadDomina() {
        return especialidadDomina;
    }

    public void setEspecialidadDomina(String especialidadDomina) {
        this.especialidadDomina = especialidadDomina;
    }
}
