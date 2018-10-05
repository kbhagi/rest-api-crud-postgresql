package spring_boot_postgres.repository;

import spring_boot_postgres.model.ElectionsCandidatesView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "election-candidates")
public interface ElectionsCandidatesViewRepository extends CrudRepository<ElectionsCandidatesView, Long> {

    List<ElectionsCandidatesView> findByFirstName(String firstName);

    List<ElectionsCandidatesView> findByLastName(String lastName);

    List<ElectionsCandidatesView> findByElectionContains(String election);

}
