
package Sistema.model.bean;

public class Derivacion {
    private int idDerivacion;
    private String Derivacion;
    private String Fecha;
    private int idDocumento;
    private String Remitente;
    private String MotivoDerivacion;
    private int Prioridad;
    private String Observacion;

    public int getIdDerivacion() {
        return idDerivacion;
    }

    public void setIdDerivacion(int idDerivacion) {
        this.idDerivacion = idDerivacion;
    }

    public String getDerivacion() {
        return Derivacion;
    }

    public void setDerivacion(String Derivacion) {
        this.Derivacion = Derivacion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getRemitente() {
        return Remitente;
    }

    public void setRemitente(String Remitente) {
        this.Remitente = Remitente;
    }

    public String getMotivoDerivacion() {
        return MotivoDerivacion;
    }

    public void setMotivoDerivacion(String MotivoDerivacion) {
        this.MotivoDerivacion = MotivoDerivacion;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int Prioridad) {
        this.Prioridad = Prioridad;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

   
}
