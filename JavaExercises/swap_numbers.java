package JavaExercises;

public class swap_numbers {

    // 2 formas de poder hacer un "swap" con numeros

    // 1ra forma, sumando y retando cada uno de los valores
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    
    // 2da forma, creando una variable adicional "temp" para poder igualarla con cada uno de los valores.

        int x = 10;
        int y = 20;
        int temp = x;

        x = y;
        y = temp;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    
    }
}
