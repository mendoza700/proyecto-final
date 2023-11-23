public class Clientes {
    int id;
    String Nombre;
    String Contacto;

    public Clientes(){
    }

    public Clientes(int id, String nombre, String contacto) {
        this.id = id;
        Nombre = nombre;
        Contacto = contacto;
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

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String contacto) {
        Contacto = contacto;
    }
}
