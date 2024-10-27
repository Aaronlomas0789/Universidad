public class Universidad {
    private String Nombre;
    private String Direccion;
  private String precio;

    public Universidad() {
    }

    public Universidad(String nombre, String direccion, String precio) {
        Nombre = nombre;
        Direccion = direccion;
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String datalleUni(){

        return "El nombre de la univerisdad :" + this.Nombre + ("\n") +
                "La direccion es :" + this.Direccion + ("\n") +
                "El precio es: " + this.precio + ("\n");
    }
}
