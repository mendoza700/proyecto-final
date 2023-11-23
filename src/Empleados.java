public class Empleados {
    int id;
    String Nombre;
    String Puesto;

    public Empleados() {

    }

    public Empleados(int id, String nombre, String puesto) {
        this.id = id;
        Nombre = nombre;
        Puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }
}
