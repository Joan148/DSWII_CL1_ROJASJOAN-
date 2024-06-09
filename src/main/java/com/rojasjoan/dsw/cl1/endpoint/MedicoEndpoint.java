package com.rojasjoan.dsw.cl1.endpoint;

import com.rojasjoan.dsw.cl1.exception.NotFoundException;
import com.rojasjoan.dsw.cl1.service.MedicoService;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cl1.joan_rojas.ws.objects.*;

@AllArgsConstructor
@Endpoint
public class MedicoEndpoint {

    private MedicoService medicoService;
    private static final String NAMESPACE_URL = "http://www.joan-rojas.cl1.pe/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMedicosRequest")
    @ResponsePayload
    public GetMedicosResponse getMedicos(@RequestPayload GetMedicosRequest request){
        GetMedicosResponse response = new GetMedicosResponse();
        response.getMedicos().addAll(medicoService.listarMedicos());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getMedicoRequest")
    @ResponsePayload
    public GetMedicoResponse getMedico(@RequestPayload
                                       GetMedicoRequest request){
        GetMedicoResponse response = new GetMedicoResponse();
        Medicows medicows = medicoService.obtenerMedicoxId(request.getId());
        if(medicows == null)
            throw new NotFoundException("El medico con el ID " + request.getId()+" no existe!");
        response.setMedico(medicows);
        return response;
    }
    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postMedicoRequest")
    @ResponsePayload
    public PostMedicoResponse saveMedico(@RequestPayload PostMedicoRequest request){
        PostMedicoResponse response = new PostMedicoResponse();
        response.setMedico(medicoService.registrarActualizarMedico(request.getMedico()));
        return response;
    }
}