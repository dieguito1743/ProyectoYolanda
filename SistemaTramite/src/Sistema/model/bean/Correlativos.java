package Sistema.model.bean;

public class Correlativos {

    private int idCorrelativo;
    private int idDocumento;
    private String correlativo;
    private int anio;
    private int estado;

    public int getIdCorrelativo() {
        return idCorrelativo;
    }

    public void setIdCorrelativo(int idCorrelativo) {
        this.idCorrelativo = idCorrelativo;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
