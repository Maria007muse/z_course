package fin.repositories;
import fin.models.Tiker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TikerRepository extends CrudRepository<Tiker, Long> {

}

