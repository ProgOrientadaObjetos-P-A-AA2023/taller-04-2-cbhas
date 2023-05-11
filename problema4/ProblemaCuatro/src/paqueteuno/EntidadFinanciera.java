package paqueteuno;

import paquetedos.*;

public class EntidadFinanciera {

    private Cliente cliente;
    private Banco banco;
    private double valorC;
    private double comision;

    public EntidadFinanciera() {
        valorC = 2000;
    }

    public EntidadFinanciera(Cliente c, Banco b, double vC) {
        cliente = c;
        banco = b;
        valorC = vC;
    }

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public void establecerBanco(Banco b) {
        banco = b;
    }

    public void calcularVCheque(double vC) {
        valorC = vC;
    }

    public void calcularComision() {
        comision = 0.00003 * valorC;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public Banco obtenerBanco() {
        return banco;
    }

    public double obtenerVCheque() {
        return valorC;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       Nombres: %s
                                       Apellidos: %s
                                       Cédula: %s
                                       Nombre del Banco: %s
                                       Número de Sucursales: %d
                                       Valor del Cheque: %.2f
                                       Comisión: %.2f
                                       """,
                obtenerCliente().obtenerNombres(),
                obtenerCliente().obtenerApellidos(),
                obtenerCliente().obtenerCedula(),
                obtenerBanco().obtenerNombre(),
                obtenerBanco().obtenerNSucursales(),
                valorC,
                comision);
        return mensaje;
    }
    
}

// @cbhas
