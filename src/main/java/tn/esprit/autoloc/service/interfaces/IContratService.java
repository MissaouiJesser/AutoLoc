package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Contrat;

import java.util.Set;

public interface IContratService {

    Set<Contrat> retrieveAllContrats();

    Contrat retrieveContrat(Long contratId);

    Contrat addContrat(Contrat contrat);

    void removeContrat(Long contratId);

    Contrat modifyContrat(Contrat contrat);
}