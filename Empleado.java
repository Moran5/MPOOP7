public class Empleado{
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    public Empleado() {}
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumEmpleado() {
        return this.numEmpleado;
    }
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    public int getSueldo() {
        return this.sueldo;
    }
    public void setSueldo(int sueldo) {
        if(sueldo>=0)
            this.sueldo = sueldo;
        else
            this.sueldo =0;
    }

    public void aumentarSueldo(int porcentaje){
        sueldo += (sueldo*(porcentaje/100));
    }
    @Override
    public String toString() {
        return "Empleado{" +
            " nombre='" + getNombre() + "'" +
            ", numEmpleado='" + getNumEmpleado() + "'" +
            ", sueldo='" + getSueldo() + "'" +
            "}";
    }

}