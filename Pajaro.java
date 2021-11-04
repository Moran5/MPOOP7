public class Pajaro extends AnimalAereo{
    private String tipoPico;

    public Pajaro() {}
    public Pajaro(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public String getTipoPico() {
        return this.tipoPico;
    }
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas");
    }

    @Override
    public String toString() {
        return super.toString()+"Pajaro{" +
            " tipoPico='" + getTipoPico() + "'" +
            "}";
    }

}