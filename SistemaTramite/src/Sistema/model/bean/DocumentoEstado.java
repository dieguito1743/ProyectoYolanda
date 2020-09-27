package Sistema.model.bean;

public class DocumentoEstado {
    private int idEstadoDocumento;
    private String estadoDocumento;
    private int activo;

    public int getIdEstadoDocumento() {
        return idEstadoDocumento;
    }

    public void setIdEstadoDocumento(int idEstadoDocumento) {
        this.idEstadoDocumento = idEstadoDocumento;
    }

    public String getEstadoDocumento() {
        return estadoDocumento;
    }

    public void setEstadoDocumento(String estadoDocumento) {
        this.estadoDocumento = estadoDocumento;
    }

    public int getactivo() {
        return activo;
    }

    public void setactivo(int activo) {
        this.activo = activo;
    }
    @Override
    public String toString(){
        return this.estadoDocumento;
    }    
}
