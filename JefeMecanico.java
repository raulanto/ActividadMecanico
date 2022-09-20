package pqTrabajo;

public class JefeMecanico extends Empleado{
    int numeroMecanicoBajoMando;
    String areaDirije;
    //Constructor
    public JefeMecanico(String nombre, String apellidoPaterno, String apellidoMaterno, int añosAntiguedad, float salarioBase) {
        super(nombre, apellidoPaterno, apellidoMaterno, añosAntiguedad, salarioBase);
    }
    //Metodos
    @Override
    public void calcularPrimaAntiguedad() {
        super.calcularPrimaAntiguedad();
        /*
        Si antigüedad es mayor o igual a 25: prima de antigüedad = salario base * antigüedad * 3.0%
        Si antigüedad es mayor o igual a 15: prima de antigüedad = salario base * antigüedad * 2.5%
        Si antigüedad es mayor o igual a 5: prima de antigüedad = salario base * antigüedad * 2.0%
         */
        if(añosAntiguedad>=25){
            primaAntiguedad=getSalarioBase()*0.038F;
        }else if (añosAntiguedad>=15){
            primaAntiguedad=getSalarioBase()*0.025F;
        } else if (añosAntiguedad>=5) {
            primaAntiguedad=getSalarioBase()*0.02F;

        }
    }

    @Override
    public void calcularComision() {
        super.calcularComision();
        comision = comision + (montoServiciosGenerados * 0.065F);
    }

    @Override
    public void mostrarEmpleado() {
        super.mostrarEmpleado();
        String a="\nNumero de Mecanicos bajo mando: "+getNumeroMecanicoBajoMando();
        a+="\nArea que dirije: "+getAreaDirije();
    }

    //getts y setts

    public int getNumeroMecanicoBajoMando() {
        return numeroMecanicoBajoMando;
    }

    public void setNumeroMecanicoBajoMando(int numeroMecanicoBajoMando) {
        this.numeroMecanicoBajoMando = numeroMecanicoBajoMando;
    }

    public String getAreaDirije() {
        return areaDirije;
    }

    public void setAreaDirije(String areaDirije) {
        this.areaDirije = areaDirije;
    }
}
