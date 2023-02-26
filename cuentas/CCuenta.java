package cuentas;

public class CCuenta {
/**
 * @author tatiana
 * @version 2.0
 * Clase sirve para crear cuenta 
 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }
/**
 * Crear objeto de tipo cuenta. 
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * devuelve saldo actual de la cuenta
 * @return
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * metodo que ingresa x cantidad en la cuenta, comprobando que no sea negativa
 * @param cantidad
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * metodo para retirar de la cuenta, comprobando que no sea negativa
 * @param cantidad
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * metodo que devuelve el nombre de la cuenta
 * @return
 */
	private String getNombre() {
		return nombre;
	}
/**
 * setter para establecer el nombre de la cuenta
 * @param nombre
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * metodo que devuelve el saldo de la cuenta
 * @return
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * setter para establecer el saldo de la cuenta
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * metodo que devuelve intereses de la cuenta
 * @return
 */
	private double getTipoInteres() {
		return tipoInteres;
	}
/**
 * setter para establecer el tipo de intereses de la cuenta
 * @param tipoInteres
 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
