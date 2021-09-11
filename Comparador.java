package Tarea_No_8;

public class Comparador {
    double precio2;
    int edad2;

    public Comparador(double precio2) {
        this.precio2 = precio2;
    }

    public Comparador(int edad2){
        this.edad2 = edad2;
    }

    //Metodos para producto
    public boolean igualQuePrecio(Object p1){
        Producto p2 = (Producto) p1;
        return p2.getPrecio() == precio2;
    }
    public boolean mayorQuePrecio(Object p1){
        Producto p2 = (Producto) p1;
        return p2.getPrecio() > precio2;
    }
    public boolean mayoroigualQuePrecio(Object p1){
        Producto p2 = (Producto) p1;
        return p2.getPrecio() >= precio2;
    }
    public boolean menorQuePrecio(Object p1){
        Producto p2 = (Producto) p1;
        return p2.getPrecio() < precio2;
    }
    public boolean menoroigualQuePrecio(Object p1){
        Producto p2 = (Producto) p1;
        return p2.getPrecio() <= precio2;
    }

    //Metodos Alumno

    public boolean igualQueAlumno(Object p1){
        Alumno p3 = (Alumno) p1;
        return p3.getEdad() == edad2;
    }

    public boolean mayorQueAlumno(Object p1){
        Alumno p3 = (Alumno) p1;
        return p3.getEdad() > edad2;
    }

    public boolean mayoroigualQueAlumno(Object p1){
        Alumno p3 = (Alumno) p1;
        return p3.getEdad() >= edad2;
    }
    public boolean menorQueAlumno(Object p1){
        Alumno p3 = (Alumno) p1;
        return p3.getEdad() < edad2;
    }
    public boolean menoroigualQueAlumno(Object p1){
        Alumno p3 = (Alumno) p1;
        return p3.getEdad() <= edad2;
    }

}
