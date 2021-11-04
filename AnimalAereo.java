public class AnimalAereo extends Animal{
    private int numeroAlas;


    public AnimalAereo() {}
    public AnimalAereo(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return this.numeroAlas;
    }
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public void volar(){
        System.out.println("Estoy volando");
    }

    @Override
    public void comer(){
        System.out.println("Estoy comiendo insectos");
    }

    @Override
    public String toString() {
        return super.toString()+"Animal Aereo{" +
            " numeroAlas='" + getNumeroAlas() + "'" +
            "}";
    }

}