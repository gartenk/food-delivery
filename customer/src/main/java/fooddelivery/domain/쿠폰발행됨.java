package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class 쿠폰발행됨 extends AbstractEvent {

    private Long id;
    private String 요리종류;
    private String 배달지주소;
    private String orderId;
}


