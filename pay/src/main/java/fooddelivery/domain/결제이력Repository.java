package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="결제이력", path="결제이력")
public interface 결제이력Repository extends PagingAndSortingRepository<결제이력, Long>{

}
