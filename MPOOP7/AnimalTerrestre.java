package MPOOP7;
public class AnimalTerrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrestre() {}
    public AnimalTerrestre(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return this.numeroPatas;
    }
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void correr(){
        System.out.println("Estoy correr");
    }
    @Override
    public void comer(){
        System.out.println("Estoy comiendo carne");
    }

    @Override
    public String toString() {
        return super.toString()+"Animal Terrestre{" +
            " numeroPatas='" + getNumeroPatas() + "'" +
            "}";
    }


}