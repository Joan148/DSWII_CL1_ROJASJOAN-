package com.rojasjoan.dsw.cl1.endpoint;

import com.rojasjoan.dsw.cl1.repository.ObreroRepository;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cl1.joan_rojas.ws.objects.CalcularSalarioRequest;
import pe.cl1.joan_rojas.ws.objects.CalcularSalarioResponse;
import pe.cl1.joan_rojas.ws.objects.Obrero;

@AllArgsConstructor
@Endpoint
public class ObreroEndpoint {
    private static final String NAMESPACE_URL = "http://www.joan-rojas.cl1.pe/ws/objects";
    private ObreroRepository obreroRepository;

    @PayloadRoot(namespace = NAMESPACE_URL,
            localPart = "calcularSalarioRequest")
    @ResponsePayload
    public CalcularSalarioResponse getSalary(@RequestPayload CalcularSalarioRequest request){
        CalcularSalarioResponse response = new CalcularSalarioResponse();
        Obrero obrero = obreroRepository.calcularSalario(request.getHoras());
        response.setObrero(obrero);
        return response;
    }

}
