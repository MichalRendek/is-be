package sk.stuba.sdg.isbe.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import sk.stuba.sdg.isbe.domain.model.Module;

public interface CollectionRepository extends MongoRepository<Module, String> {

}
