
package Sistema.model.bean;

public class DocumentoDestinatario {
    
   private int idDocDestinatario ;
   private int idTipoDocumento;
   private String NumeroDocumento;
   private String Destinatario;

    public int getIdDocDestinatario() {
        return idDocDestinatario;
    }

    public void setIdDocDestinatario(int idDocDestinatario) {
        this.idDocDestinatario = idDocDestinatario;
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

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }
   
   
   
}
