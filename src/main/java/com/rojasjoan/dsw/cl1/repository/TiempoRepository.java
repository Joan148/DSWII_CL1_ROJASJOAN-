package com.rojasjoan.dsw.cl1.repository;

import org.springframework.stereotype.Component;

@Component
public class TiempoRepository {

    public int calcularSegundos(int minutos) {
        return minutos * 60;
    }
}

