package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class 주문관리HateoasProcessor implements RepresentationModelProcessor<EntityModel<주문관리>>  {

    @Override
    public EntityModel<주문관리> process(EntityModel<주문관리> model) {

        
        return model;
    }
    
}
