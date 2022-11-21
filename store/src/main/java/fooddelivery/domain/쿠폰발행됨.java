package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 쿠폰발행됨 extends AbstractEvent {

    private Long id;
    private String 요리종류;
    private String 배달지주소;
    private String orderId;

    public 쿠폰발행됨(주문관리 aggregate){
        super(aggregate);
    }
    public 쿠폰발행됨(){
        super();
    }
}
