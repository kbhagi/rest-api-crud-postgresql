package spring_boot_postgres.service;

import spring_boot_postgres.model.ElectionsCandidatesView;

import java.util.List;

public interface ElectionsCandidatesViewService {

    Iterable<ElectionsCandidatesView> findAll();

    List<ElectionsCandidatesView> findByElection(String election);

    List<ElectionsCandidatesView> findByFirstName(String firstName);

    List<ElectionsCandidatesView> findByLastName(String lastName);
}
