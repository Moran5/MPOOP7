package MPOOP7;
public class Perro extends AnimalTerrestre{
    private String colorCollar;

    public Perro() {}
    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public String getColorCollar() {
        return this.colorCollar;
    }
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public void hacerTrucos(){
        System.out.println("Estoy haciendo trucos");
    }


    @Override
    public String toString() {
        return super.toString()+"Perro{" +
            " colorCollar='" + getColorCollar() + "'" +
            "}";
    }

}
