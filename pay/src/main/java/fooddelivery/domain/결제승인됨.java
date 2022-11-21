package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 결제승인됨 extends AbstractEvent {

    private Long id;
    private String orderId;
    private Double 금액;

    public 결제승인됨(결제이력 aggregate){
        super(aggregate);
    }
    public 결제승인됨(){
        super();
    }
}
