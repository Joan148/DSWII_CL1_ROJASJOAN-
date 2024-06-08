package com.rojasjoan.dsw.cl1.endpoint;

import com.rojasjoan.dsw.cl1.repository.NumeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cl1.joan_rojas.ws.objects.NumeroRequest;
import pe.cl1.joan_rojas.ws.objects.NumeroResponse;

@AllArgsConstructor
@Endpoint
public class NumeroEndpoint {
    private static final String NAMESPACE_URL = "http://www.joan-rojas.cl1.pe/ws/objects";
    private final NumeroRepository numeroRepository;

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "NumeroRequest")
    @ResponsePayload
    public NumeroResponse calcularSuma(@RequestPayload NumeroRequest request) {
        int suma = numeroRepository.calcularSuma(request.getLimite());
        NumeroResponse response = new NumeroResponse();
        response.setSuma(suma);
        return response;
    }

}
