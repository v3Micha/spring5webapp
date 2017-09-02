package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created on 8/30/2017.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
