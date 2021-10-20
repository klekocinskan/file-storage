package pl.klekocinska.filesstorage.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.klekocinska.filesstorage.DAO.entity.File;

@Repository
public interface FileRepository extends CrudRepository<File,Long> {
}
