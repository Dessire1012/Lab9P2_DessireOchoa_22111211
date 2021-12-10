
package Chat;

public class Usuarios {
    private String usuario;
    private String nombre;
    private String contraseña;
    private int edad;
    private String tipo;

    public Usuarios() {
    }

    public Usuarios(String usuario, String nombre, String contraseña, int edad, String tipo) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", edad=" + edad + ", tipo=" + tipo + '}';
    }
    
    
    
}
