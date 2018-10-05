package spring_boot_postgres.repository;

import spring_boot_postgres.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}