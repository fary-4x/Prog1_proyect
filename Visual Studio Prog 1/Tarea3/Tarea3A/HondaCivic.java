package Tarea3.Tarea3A;

public class HondaCivic extends AutoMovil{

    public  HondaCivic(){
        System.out.println("");
        System.out.println("Constructor HondaCivic");
        System.out.println("");
    }
    
    public void arrancar(){
        super.arrancar();
        System.out.println("Rapido");
    }

    public void encender(){
        super.encender();
        System.out.println("Lentamente");
    }

}
