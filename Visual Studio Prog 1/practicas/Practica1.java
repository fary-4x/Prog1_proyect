package practicas;
//1-Mostrar en pantalla los números pares del 1 al 200.

public class Practica1 {

    public static void main(String[] args) {
       
        int i = 2; 
        for(i = 2; i <= 200; i+=2){
            System.out.println(i);
        }

       while( i<= 200){
            i+=2;
            System.out.println(i);

        }
        
        do{
            System.out.println(i);
            i+=2;
        }while(i<=200);

    }

}
