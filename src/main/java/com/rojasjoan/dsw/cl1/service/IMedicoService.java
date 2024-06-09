package com.rojasjoan.dsw.cl1.service;

import pe.cl1.joan_rojas.ws.objects.Medicows;

import java.util.List;

public interface IMedicoService {
    List<Medicows> listarMedicos();
    Medicows obtenerMedicoxId(int id);
    Medicows registrarActualizarMedico(Medicows medico);
}
