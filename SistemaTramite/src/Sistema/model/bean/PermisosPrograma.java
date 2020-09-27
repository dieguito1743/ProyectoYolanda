package Sistema.model.bean;

public class PermisosPrograma {
     private int idPermisos;
     private int idPrograma;
     private String Programa;
     private String Descripcion;
     private int idUsuario;
     private String Username;
     private int Registro;
     private int Actualiza;
     private int Elimina;

    public int getIdPermisos() {
        return idPermisos;
    }

    public void setIdPermisos(int idPermisos) {
        this.idPermisos = idPermisos;
    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public int getRegistro() {
        return Registro;
    }

    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }

    public int getActualiza() {
        return Actualiza;
    }

    public void setActualiza(int Actualiza) {
        this.Actualiza = Actualiza;
    }

    public int getElimina() {
        return Elimina;
    }

    public void setElimina(int Elimina) {
        this.Elimina = Elimina;
    }
     
}
