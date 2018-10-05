package spring_boot_postgres.service;

import spring_boot_postgres.model.ElectionsCandidatesView;
import spring_boot_postgres.repository.ElectionsCandidatesViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectionsCandidatesViewServiceImpl implements ElectionsCandidatesViewService {

    private final ElectionsCandidatesViewRepository electionsCandidatesViewRepository;

    @Autowired
    public ElectionsCandidatesViewServiceImpl(ElectionsCandidatesViewRepository electionsCandidatesViewRepository) {
        this.electionsCandidatesViewRepository = electionsCandidatesViewRepository;
    }

    @Override
    public Iterable<ElectionsCandidatesView> findAll() {
        return electionsCandidatesViewRepository.findAll();
    }

    @Override
    public List<ElectionsCandidatesView> findByFirstName(String firstName) {
        return electionsCandidatesViewRepository.findByFirstName(firstName);
    }

    @Override
    public List<ElectionsCandidatesView> findByLastName(String lastName) {
        return electionsCandidatesViewRepository.findByLastName(lastName);
    }

    @Override
    public List<ElectionsCandidatesView> findByElection(String election) {
        return electionsCandidatesViewRepository.findByElectionContains(election);
    }

}
