package spring_boot_postgres.service;

import spring_boot_postgres.model.VoteTotalsView;

import java.util.List;

public interface VoteTotalsViewService {

    Iterable<VoteTotalsView> findAll();

    List<VoteTotalsView> findByElection(String election);

    List<VoteTotalsView> findByCandidate(String candidate);
}
