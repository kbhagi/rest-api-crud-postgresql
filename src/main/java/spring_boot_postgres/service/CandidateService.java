package spring_boot_postgres.service;

import spring_boot_postgres.model.Candidate;

import java.util.List;

public interface CandidateService {

    List<Candidate> findAll();

}
