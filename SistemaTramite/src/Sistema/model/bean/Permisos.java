
package Sistema.model.bean;

public class Permisos {
        private int idPermisos;
	private int idPrograma;
	private int idUsuario;
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
