package Tarea_No_8;

import java.util.Scanner;

public class Test_Main {
    public static void main(String[]args){
        Scanner comparar = new Scanner(System.in);
        int opcinoElejida, a1 = 0;
        //Variables Producto
        int identificador;
        String nombreProducto;
        double precio, precio2;
        //Variables Alumno
        String carnet;
        String nombreAlumno;
        int edad, edad2;

        while (a1 == 0) {
        System.out.println("Elija una opcion: ");
        System.out.println("1) Ingreso precio de producto");
        System.out.println("2) Ingreso edad de alumno");
        System.out.println("3) Salir");
        System.out.println();
        System.out.println();
        System.out.println();
        opcinoElejida = comparar.nextInt() ;

            switch (opcinoElejida) {
                case 1:
                    System.out.println("Codigo: ");
                    identificador = comparar.nextInt();
                    comparar.nextLine();                    System.out.println("Nombre: ");
                    nombreProducto = comparar.nextLine();
                    System.out.println("Precio: ");
                    precio = comparar.nextDouble();
                    Producto k1 = new Producto(identificador, nombreProducto, precio);
                    System.out.println("Precio 2:");
                    precio2 = comparar.nextDouble();
                    Comparador k2 = new Comparador(precio2);
                    System.out.println();
                    System.out.println();
                    if (k2.igualQuePrecio(k1) == true){
                        System.out.println("Los preciospara el prodcuto (" + nombreProducto +") son iguales");
                    }
                    if (k2.mayorQuePrecio(k1) == true){
                        System.out.println("El precio 1 del prodcuto (" + nombreProducto +") es mayor que el precio 2");
                    }
                    if (k2.mayoroigualQuePrecio(k1) == true) {
                        System.out.println("El precio 1 del prodcuto (" + nombreProducto + ") es mayor o igual que el precio 2");
                    }
                    if (k2.menorQuePrecio(k1) == true) {
                        System.out.println("El precio 1 del prodcuto (" + nombreProducto + ") es menor que el precio 2");
                    }
                    if (k2.menoroigualQuePrecio(k1) == true) {
                        System.out.println("El precio 1 del prodcuto (" + nombreProducto + ") es menor o igual que el precio 2");
                    }
                    System.out.println();
                    System.out.println();
                break;

                case 2:
                    System.out.println("Carnet: ");
                    carnet = comparar.nextLine();
                    comparar.nextLine() ;
                    System.out.println("Nombre: ");
                    nombreAlumno = comparar.nextLine();
                    System.out.println("Edad 1:");
                    edad = comparar.nextInt();
                    Alumno k3 = new Alumno(carnet, nombreAlumno,edad);
                    System.out.println("Edad 2:");
                    edad2 = comparar.nextInt();
                    Comparador k4 = new Comparador(edad2);
                    System.out.println();
                    System.out.println();
                    if (k4.igualQueAlumno(k3)==true){
                        System.out.println("La edades son iguales");
                    }
                    if (k4.mayorQueAlumno(k3)==true){
                        System.out.println("La edad 1 es mayor que la edad 2");
                    }
                    if (k4.mayoroigualQueAlumno(k3)==true){
                        System.out.println("La edad 1 es mayor o igual que la edad 2");
                    }
                    if (k4.menorQueAlumno(k3)==true){
                        System.out.println("La edad 1 es menor que la edad 2");
                    }
                    if (k4.menoroigualQueAlumno(k3)==true){
                        System.out.println("La edad 1 es menor o igual que la edad 2");
                    }
                    System.out.println();
                    System.out.println();
                break;
                case 3:
                    a1 = 1;
                    System.out.println("GRACIAS, VUELVA PRONTO");
                break;
            } //Switch
        }//While
    }
}
