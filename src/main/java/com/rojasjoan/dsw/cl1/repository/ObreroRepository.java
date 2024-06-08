package com.rojasjoan.dsw.cl1.repository;

import org.springframework.stereotype.Component;
import pe.cl1.joan_rojas.ws.objects.Obrero;

import java.util.HashMap;
import java.util.Map;

@Component
public class ObreroRepository {
    private Map<String, Obrero> obreros = new HashMap<>();


    public Obrero calcularSalario(int horasTrabajadas) {
        Obrero obrero = new Obrero();
        obrero.setHoras(horasTrabajadas);
        int horasLimite = 40;
        int horasExtra = 0;
        double salarioHora = 16;
        double salarioHoraextra = 20;
        double salarioFinal;

        if (horasTrabajadas <= horasLimite) {
            salarioFinal = salarioHora * horasTrabajadas;
        } else {
            horasExtra = horasTrabajadas - horasLimite;
            salarioFinal = (salarioHora * horasLimite) + (salarioHoraextra * horasExtra);
            obrero.setHorasExtra(horasExtra);
            obrero.setSalarioHoraextra(salarioHoraextra * horasExtra);
        }
        obrero.setSalarioFinal(salarioFinal);
        return obrero;
    }


}
