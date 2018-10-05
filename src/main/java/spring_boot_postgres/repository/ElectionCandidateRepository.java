package spring_boot_postgres.repository;

import spring_boot_postgres.model.ElectionCandidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionCandidateRepository extends JpaRepository<ElectionCandidate, Long> {
}
