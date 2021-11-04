package MPOOP7;
public class AnimalAcuatico extends Animal{
    private int numeroAletas;

    public AnimalAcuatico() {}
    public AnimalAcuatico(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    public int getNumeroAletas() {
        return this.numeroAletas;
    }
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    public void nadar(){
        System.out.println("Estoy haciendo un nadando");
    }
    @Override
    public void comer(){
        System.out.println("Estoy comiendo peces");
    }

    @Override
    public String toString() {
        return super.toString()+"Animal Acuatico{" +
            " numeroAletas='" + getNumeroAletas() + "'" +
            "}";
    }

}