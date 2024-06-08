package com.rojasjoan.dsw.cl1.endpoint;

import com.rojasjoan.dsw.cl1.repository.TiempoRepository;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cl1.joan_rojas.ws.objects.TiempoRequest;
import pe.cl1.joan_rojas.ws.objects.TiempoResponse;

@Endpoint
@AllArgsConstructor
public class TiempoEndpoint {

    private static final String NAMESPACE_URL = "http://www.joan-rojas.cl1.pe/ws/objects";
    private final TiempoRepository tiempoRepository;

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "TiempoRequest")
    @ResponsePayload
    public TiempoResponse calcularSegundos(@RequestPayload TiempoRequest request) {
        int segundos = tiempoRepository.calcularSegundos(request.getMinutos());
        TiempoResponse response = new TiempoResponse();
        response.setSegundos(segundos);
        return response;
    }
}
