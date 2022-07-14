package ec.edu.espe.listaobservados.dao;

import ec.edu.espe.listaobservados.model.Narcotraficantes;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface NarcotraficantesRepository extends MongoRepository<Narcotraficantes, String> {

    Optional<Narcotraficantes> findByNombreCompleto(String nombreCompleto);
}
