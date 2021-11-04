public class Ballena extends AnimalAcuatico{
    private int largo;

    public Ballena() {}
    public Ballena(int largo) {
        this.largo = largo;
    }

    public int getLargo() {
        return this.largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public void pelearConPinocho(){
        System.out.println("Estoy peleando con Pinocho");
    }

    @Override
    public String toString() {
        return super.toString()+"Ballena{" +
            " largo='" + getLargo() + "'" +
            "}";
    }
}