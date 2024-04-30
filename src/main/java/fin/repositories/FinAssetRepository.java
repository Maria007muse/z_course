package fin.repositories;
import fin.models.FinAsset;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinAssetRepository extends CrudRepository<FinAsset, Long> {

    boolean existsByTikerId(Long id);

}

