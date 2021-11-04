package MPOOP7;
/**
 *@author Moran Duque, Jose Alejandro
 */
class Main {
  public static void main(String[] args) {
    Gerente gerente = new Gerente();
    System.out.println(gerente);
    gerente.setNombre("Romina Perez");
    gerente.setNumEmpleado(205);
    gerente.setSueldo(20000);
    gerente.setPresupuesto(100000);
    System.out.println(gerente);
    Gerente gerente2 = new Gerente("Jose luis",207,30000,70000);
    System.out.println(gerente2);
    Ballena ballena = new Ballena();
    ballena.setNombre("Moby dick");
    System.out.println(ballena.getNombre());
  }
}