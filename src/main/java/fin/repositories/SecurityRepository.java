package fin.repositories;
import fin.models.Security;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityRepository extends CrudRepository<Security, Long> {
    boolean existsByFinAssetId(Long id);
}

