package Sistema.model.bean;

public class vCargo {
    private int idCargo;
    private int idDocumento;
    private String numeroDocumento;
    private String Destinatario;
    private String Documento;
    private String FechCargo;
    private String HoraCargo;
    private String AreaCargo;
    private String Asunto;
    private String Institucion;
    private String Recepcionista;
    private int estadoCargo;

// c.idCargo, c.idDocumento, c.Fecha, c.Hora, c.Area, c.Recepcionista,c.FechaRegistro,   
//c.numeroCargo,c.estadoCargo,c.fechaEstadoCargo, c.usuarioEstadoCargo,c.Obs, c.UsuarioRegistra,c.HostName,c.UserName,  
//d.numeroDocumento, d.Destinatario, d.Documento, d.asunto, d.Institucion    
    
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getFechCargo() {
        return FechCargo;
    }

    public void setFechCargo(String FechCargo) {
        this.FechCargo = FechCargo;
    }

    public String getHoraCargo() {
        return HoraCargo;
    }

    public void setHoraCargo(String HoraCargo) {
        this.HoraCargo = HoraCargo;
    }

    public String getAreaCargo() {
        return AreaCargo;
    }

    public void setAreaCargo(String AreaCargo) {
        this.AreaCargo = AreaCargo;
    }

    public int getEstadoCargo() {
        return estadoCargo;
    }

    public void setEstadoCargo(int estadoCargo) {
        this.estadoCargo = estadoCargo;
    }

    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String Institucion) {
        this.Institucion = Institucion;
    }

    public String getRecepcionista() {
        return Recepcionista;
    }

    public void setRecepcionista(String Recepcionista) {
        this.Recepcionista = Recepcionista;
    }
    
}