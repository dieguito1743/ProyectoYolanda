package Sistema.model.bean;

public class Cargo {

    private int idCargo;
    private int idDocumento;
    private String Fecha;
    private String Hora;
    private String Area;
    private String Recepcionista;
    private String numeroCargo;
    private int    estadoCargo;
    private String fechaEstadoCargo;
    private String UsuarioEstadoCargo;
    private String Obs;
    private String FechaRegistro;
    private String UsuarioRegistra;
    private String HostName;
    private String UserName;

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

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getRecepcionista() {
        return Recepcionista;
    }

    public void setRecepcionista(String Recepcionista) {
        this.Recepcionista = Recepcionista;
    }

    public String getNumeroCargo() {
        return numeroCargo;
    }

    public void setNumeroCargo(String numeroCargo) {
        this.numeroCargo = numeroCargo;
    }

    public int getEstadoCargo() {
        return estadoCargo;
    }

    public void setEstadoCargo(int estadoCargo) {
        this.estadoCargo = estadoCargo;
    }

    public String getFechaEstadoCargo() {
        return fechaEstadoCargo;
    }

    public void setFechaEstadoCargo(String fechaEstadoCargo) {
        this.fechaEstadoCargo = fechaEstadoCargo;
    }
    public String getUsuarioEstadoCargo() {
        return UsuarioEstadoCargo;
    }

    public void setUsuarioEstadoCargo(String UsuarioEstadoCargo) {
        this.UsuarioEstadoCargo = UsuarioEstadoCargo;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public String getUsuarioRegistra() {
        return UsuarioRegistra;
    }

    public void setUsuarioRegistra(String UsuarioRegistra) {
        this.UsuarioRegistra = UsuarioRegistra;
    }

    public String getHostName() {
        return HostName;
    }

    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
    }
