package com.rojasjoan.dsw.cl1.repository;

import org.springframework.stereotype.Component;
import pe.cl1.joan_rojas.ws.objects.Obrero;

import java.util.HashMap;
import java.util.Map;

@Component
public class ObreroRepository {
    private Map<String, Obrero> obreros = new HashMap<>();

    public ObreroRepository(){
        Obrero obrero = new Obrero();
        //OBRERO1
        obrero.setHoras(40);
        obreros.put("Obrero1", obrero);
        //OBRERO2
        obrero = new Obrero();
        obrero.setHoras(45);
        obreros.put("Obrero2", obrero);
    }

    public double calcularSalario(Obrero obrero) {
        int horas = obrero.getHoras();
        int horasLimite = obrero.getHorasLimite();
        int horasExtra = 0;
        double salarioHora = 16;
        double salarioHoraextra = 20;
        double salarioFinal;

        if(horas <= horasLimite) {
            salarioFinal = salarioHora * horas;
        } else {
            horasExtra = horas - horasLimite;
            salarioFinal = (salarioHora * horasLimite) + (salarioHoraextra * horasExtra);
            obrero.setHorasExtra(horasExtra);
            obrero.setSalarioHoraextra(salarioHoraextra * horasExtra);
        }
        obrero.setSalarioFinal(salarioFinal);
        return salarioFinal;
    }

}
