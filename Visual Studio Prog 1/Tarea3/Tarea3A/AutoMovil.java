package Tarea3.Tarea3A;

public class AutoMovil {
    
    //Atributos
    private String color;
    private String clasificacion;
    private String modelo;
    private String año;
     
    //Constructor
    public AutoMovil(){
        System.out.println("Constructor AutoMovil");
        System.out.println("");
    }
    
    //Metodos
    public void encender(){
        System.out.println("Encendido");
    }
    public void apagar(){
        System.out.println("Apagado");
    }
    public void arrancar(){
        System.out.println("Arrancando");
    }
    public void detener(){
        System.out.println("Detenido");
    }


                  //Encapsulacion
    //setter
    public void setColor(String color){
        this.color = color;
    }
    public void setClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAño(String año){
        this.año = año;
    }
   
    //getter
    public String getColor(){
        return color;
    }
    public String getClasificacion(){
        return clasificacion;
    }
    public String getModelo(){
        return modelo;
    }
    public String getAño(){
        return año;
    }


//MAIN
    public static void main(String[] args) {
        
        AutoMovil auto = new AutoMovil();

        auto.setColor("Rojo");
        auto.setClasificacion("Deportivo");
        auto.setModelo("F12 Berlinetta");
        auto.setAño("2012");


        System.out.println("Color: " + auto.getColor());
        System.out.println("Clasificacion: " +auto.getClasificacion());
        System.out.println("Modelo: " +auto.getModelo());
        System.out.println("Año: " +auto.getAño());


        HondaCivic honda = new HondaCivic();

        honda.arrancar();
        honda.encender();


    }
    
}
