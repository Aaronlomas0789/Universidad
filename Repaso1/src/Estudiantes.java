public class Estudiantes {
    private String Nombre;
    private String Carrera;
    private String Correo;
    private String saldototal;

    public Estudiantes() {
    }


    public Estudiantes(String nombre, String carrera, String correo) {
        this.Nombre = nombre;
        this.Carrera = carrera;
        this.Correo = correo;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String detalleEstu (){
        return "El nombre de el estudiante es :" + this.Nombre + ("\n") +
                "La carrera del estudiante es :" + this.Carrera + ("\n")+
                "El correo de del estudiante es " + this.Correo + ("\n");

    }
}

