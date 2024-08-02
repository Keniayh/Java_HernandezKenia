package com.ejercicio;

import java.text.MessageFormat;
import cuenta.*;

public class Main {
    public static void main(String[] args) {
        Cuenta ctaA = new Cuenta();
        Cuenta ctaB = new Cuenta(1234, "Johlver", 324, "Ahorros");

        System.out.println(MessageFormat.format("Nro Cta {0} titular : ·{1} Saldo {2} Tipo de cuenta {3}", ctaB.getNroCta(), ctaB.getTitular(),ctaB.getSaldo(),ctaB.getTipoCuenta()));
    }
}