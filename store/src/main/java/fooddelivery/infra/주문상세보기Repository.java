package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="주문상세보기", path="주문상세보기")
public interface 주문상세보기Repository extends PagingAndSortingRepository<주문상세보기, Long> {

    

    
}
