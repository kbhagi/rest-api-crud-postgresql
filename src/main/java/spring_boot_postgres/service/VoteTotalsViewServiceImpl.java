package spring_boot_postgres.service;

import spring_boot_postgres.model.VoteTotalsView;
import spring_boot_postgres.repository.VoteTotalsViewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteTotalsViewServiceImpl implements VoteTotalsViewService {

    private final VoteTotalsViewRepository voteTotalsViewRepository;

    public VoteTotalsViewServiceImpl(VoteTotalsViewRepository voteTotalsViewRepository) {
        this.voteTotalsViewRepository = voteTotalsViewRepository;
    }

    @Override
    public Iterable<VoteTotalsView> findAll() {
        return voteTotalsViewRepository.findAll();
    }

    @Override
    public List<VoteTotalsView> findByElection(String election) {
        return voteTotalsViewRepository.findByElectionContains(election);
    }

    @Override
    public List<VoteTotalsView> findByCandidate(String candidate) {
        return voteTotalsViewRepository.findByCandidateContains(candidate);
    }

}
