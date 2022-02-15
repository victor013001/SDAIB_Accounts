package co.edu.udea.SDAIB.model;

public abstract class Cuenta {

    protected String numeroCuenta;
    protected String titular;
    protected String documentoTitular;
    protected float saldo;
    protected boolean activa;

    //Construtor
    public Cuenta(String numeroCuenta, String titular, String documentoTitular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.documentoTitular = documentoTitular;
        this.saldo = 0;
        this.activa = true;
    }

    //getters y setters

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getDocumentoTitular() {
        return documentoTitular;
    }

    public void setDocumentoTitular(String documentoTitular) {
        this.documentoTitular = documentoTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
