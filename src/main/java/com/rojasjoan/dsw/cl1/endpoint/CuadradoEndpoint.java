package com.rojasjoan.dsw.cl1.endpoint;

import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cl1.joan_rojas.ws.objects.CuadradoResponse;

@AllArgsConstructor
@Endpoint
public class CuadradoEndpoint {
    private static final String NAMESPACE_URI = "http://www.joan-rojas.cl1.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CuadradoRequest")
    @ResponsePayload
    public CuadradoResponse calculateNumbers() {
        CuadradoResponse response = new CuadradoResponse();
        for (int i = 15; i <= 70; i++) {
            CuadradoResponse.Numeros nums = new CuadradoResponse.Numeros();
            nums.setNumero(i);
            nums.setCuadrado(i * i);
            nums.setMitad(i / 2.0);
            response.getNumeros().add(nums);
        }
        return response;
    }
}
