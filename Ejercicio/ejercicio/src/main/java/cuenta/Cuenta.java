package cuenta;

public class Cuenta {
    private int nroCta;
    private String titular;
    private double saldo;
    private String tipoCuenta;

    public Cuenta(){}

    /*
    * @param nroCta Bro de cuenta bancaria.
    * @param titular
    * @param saldo
    */
    
    public Cuenta(int nroCta, String titular, double saldo, String tipoCuenta) {
        this.nroCta = nroCta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNroCta() {
        return nroCta;
    }

    public void setNroCta(int nroCta) {
        this.nroCta = nroCta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    
}
