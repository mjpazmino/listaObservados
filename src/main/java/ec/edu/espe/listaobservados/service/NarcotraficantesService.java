package ec.edu.espe.listaobservados.service;

import ec.edu.espe.listaobservados.dao.NarcotraficantesRepository;
import ec.edu.espe.listaobservados.exception.ConflictException;
import ec.edu.espe.listaobservados.model.Narcotraficantes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NarcotraficantesService {

    private final NarcotraficantesRepository narcotraficantesRepository;

    private Narcotraficantes consultaListaObservados (String nombreCompleto){
        return narcotraficantesRepository
                .findByNombreCompletoAAndAndSancionado(nombreCompleto, "No")
                .orElseThrow(() -> new ConflictException("El usuario se encuentra sancionado"));
    }
}
