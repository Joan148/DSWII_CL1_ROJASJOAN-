package com.rojasjoan.dsw.cl1.endpoint;

import com.rojasjoan.dsw.cl1.repository.EstudianteRepository;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cl1.joan_rojas.ws.objects.Estudiante;
import pe.cl1.joan_rojas.ws.objects.EstudianteRequest;
import pe.cl1.joan_rojas.ws.objects.EstudianteResponse;

@AllArgsConstructor
@Endpoint
public class EstudianteEndpoint {
    private static final String NAMESPACE_URL = "http://www.joan-rojas.cl1.pe/ws/objects";
    private final EstudianteRepository estudianteRepository;

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "EstudianteRequest")
    @ResponsePayload
    public EstudianteResponse calcularPromedio(@RequestPayload EstudianteRequest request) {
        Estudiante estudiante = estudianteRepository.calcularNotas(
                request.getNota1(), request.getNota2(), request.getNota3(), request.getNota4());

        EstudianteResponse response = new EstudianteResponse();
        response.setNotaMenor(estudiante.getNotaMenor());
        response.setPromedio(estudiante.getPromedio());

        return response;
    }
}
