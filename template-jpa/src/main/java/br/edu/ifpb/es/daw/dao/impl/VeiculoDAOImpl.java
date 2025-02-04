package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.VeiculoDAO;
import br.edu.ifpb.es.daw.entities.Veículo.Veiculo;
import jakarta.persistence.EntityManagerFactory;

public class VeiculoDAOImpl extends AbstractDAOImpl<Veiculo, Long> implements VeiculoDAO {

    public VeiculoDAOImpl(EntityManagerFactory emf) {
        super(Veiculo.class, emf);
    }
    
}
