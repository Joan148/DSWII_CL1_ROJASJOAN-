package com.rojasjoan.dsw.cl1.repository;

import org.springframework.stereotype.Component;

@Component
public class NumeroRepository {
    public int calcularSuma(int limite) {
        int suma = 0;
        for (int i = 1; i <= limite; i++) {
            suma += i;
        }
        return suma;
    }
}
