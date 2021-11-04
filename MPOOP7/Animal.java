package MPOOP7;
public class Animal{
    private String nombre;
    private String lugarDeOrigen;
    private String color;

    public Animal() {}
    public Animal(String nombre, String lugarDeOrigen, String color) {
        this.nombre = nombre;
        this.lugarDeOrigen = lugarDeOrigen;
        this.color = color;
    }


    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getLugarDeOrigen() {
        return this.lugarDeOrigen;
    }
    public void setLugarDeOrigen(String lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void sonido(String sonido){
        System.out.println("Estoy haciendo un sonido"+sonido);
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    @Override
    public String toString() {
        return "Animal{" +
            " nombre='" + getNombre() + "'" +
            ", lugarDeOrigen='" + getLugarDeOrigen() + "'" +
            ", color='" + getColor() + "'" +
            "}";
    }

}