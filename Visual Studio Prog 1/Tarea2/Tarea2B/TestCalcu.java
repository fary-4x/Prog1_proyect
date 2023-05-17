package Tarea2.Tarea2B;

public class TestCalcu {
    
    public static void main(String[] args) {
        
    Calculadora calc = new Calculadora();
    
    //SUMA
    int resultado1 = calc.sumar(3, 6);
    int resultado2 = calc.sumar(3, 5, 10);
    int resultado3 = calc.sumar(1, 1, 6, 8);
    
    System.out.println("Suma");
    System.out.println(resultado1);
    System.out.println(resultado2);
    System.out.println(resultado3);
    System.out.println("");
    
    //RESTA
    int resultado4 = calc.restar(9, 4);
    int resultado5 = calc.restar(200, 20, 7);
    int resultado6 = calc.restar(20, 3, 6, 4);
    
    System.out.println("Resta");
    System.out.println(resultado4);
    System.out.println(resultado5);
    System.out.println(resultado6);
    System.out.println("");
    
    //MULTIPLICACION
    int resultado7 = calc.multiplicar(2, 5);
    int resultado8 = calc.multiplicar(3, 3, 3);
    int resultado9 = calc.multiplicar(4, 4, 4, 4);
    
    System.out.println("Multiplicacion");
    System.out.println(resultado7);
    System.out.println(resultado8);
    System.out.println(resultado9);
    System.out.println("");
    
    //DIVISION
    int resultado10 = calc.dividir(10, 5);
    
    System.out.println("Divicion");
    System.out.println(resultado10);
    System.out.println("");
    
    }
    }
    