package fin.repositories;
import fin.models.Bond;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BondRepository extends CrudRepository<Bond, Long> {
    boolean existsByFinAssetId(Long id);
}

