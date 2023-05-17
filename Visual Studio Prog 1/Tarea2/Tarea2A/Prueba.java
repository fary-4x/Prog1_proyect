package Tarea2.Tarea2A;

public class Prueba {
    
    public static void main(String[] args) {
        
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        Tv tv3 = new Tv();

        tv1.marca = "LG";
        tv1.precio = "30,000";
        tv1.resolucion = "4K";
        tv1.color = "NEGRA";

        tv2.marca = "SAMSUNG";
        tv2.precio = "35,000";
        tv2.resolucion = "4K";
        tv2.color = "GRIS";

        tv3.marca = "TLC";
        tv3.precio = "18,000";
        tv3.resolucion = "4K";
        tv3.color = "PLATEADA";

        tv1.encender();
        tv1.apagar();
        tv1.cambiar();
        tv1.navegar();

        System.out.println("LA TELEVISION " + tv2.marca + " ESTA "+ tv1.encender());
        System.out.println("");
        System.out.println("LA TELEVISION " + tv1.marca + " COSTO " + tv2.precio +" Y ESTA " + tv1.apagar());
        System.out.println("");
        System.out.println(tv1.cambiar()+ " DE LA TV " + tv3.marca);
        System.out.println("");
        System.out.println(tv1.navegar()+ " EN "+ tv1.resolucion +" EN LA TELEVISION " + tv3.color + " " + tv3.marca );
        System.out.println("");
    }
}

