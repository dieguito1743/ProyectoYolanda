
package Sistema.model.bean;


public class DocumentoArchivo {
    private int DocumentoArchivo;
    private int idTipoDocumento;
    private String NumeroDocumento;
    private String Origen;
    private String Destino;

    public int getDocumentoArchivo() {
        return DocumentoArchivo;
    }

    public void setDocumentoArchivo(int DocumentoArchivo) {
        this.DocumentoArchivo = DocumentoArchivo;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }
    
    
}
