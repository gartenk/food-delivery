package fooddelivery.domain;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="주문관리", path="주문관리")
public interface 주문관리Repository extends PagingAndSortingRepository<주문관리, Long>{

}
