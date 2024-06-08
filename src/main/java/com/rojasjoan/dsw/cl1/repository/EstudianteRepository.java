package com.rojasjoan.dsw.cl1.repository;

import org.springframework.stereotype.Component;
import pe.cl1.joan_rojas.ws.objects.Estudiante;

@Component
public class EstudianteRepository {
    public Estudiante calcularNotas(int nota1, int nota2, int nota3, int nota4) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);
        estudiante.setNota4(nota4);

        estudiante.setNotaMenor(calcularNotaMenor(nota1, nota2, nota3, nota4));
        estudiante.setPromedio(calcularPromedio(nota1, nota2, nota3, nota4, estudiante.getNotaMenor()));

        return estudiante;
    }

    private int calcularNotaMenor(int nota1, int nota2, int nota3, int nota4) {
        return Math.min(Math.min(nota1, nota2), Math.min(nota3, nota4));
    }

    private double calcularPromedio(int nota1, int nota2, int nota3, int nota4, int notaMenor) {
        int suma = nota1 + nota2 + nota3 + nota4;
        suma -= notaMenor;
        return suma / 3.0;
    }
}
