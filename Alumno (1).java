package Tarea_No_8;

class Alumno {
    String carnet;
    String nombreAlumno;
    int edad, edad2;

    public Alumno(String carnet, String nombreAlumno, int edad) {
        this.carnet = carnet;
        this.nombreAlumno = nombreAlumno;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
