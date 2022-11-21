package fooddelivery.domain;

import fooddelivery.domain.주문됨;
import fooddelivery.domain.Ordered;
import fooddelivery.domain.주문취소됨;
import fooddelivery.domain.OrderCanceled;
import fooddelivery.AppApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Order_table")
@Data

public class Order  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String item;
    
    
    
    
    
    private Integer qty;

    @PostPersist
    public void onPostPersist(){

        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        fooddelivery.external.결제이력 결제이력 = new fooddelivery.external.결제이력();
        // mappings goes here
        Application.applicationContext.getBean(fooddelivery.external.결제이력Service.class)
            .결제(결제이력);


        주문됨 주문됨 = new 주문됨(this);
        주문됨.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        fooddelivery.external.결제이력 결제이력 = new fooddelivery.external.결제이력();
        // mappings goes here
        AppApplication.applicationContext.getBean(fooddelivery.external.결제이력Service.class)
            .결제(결제이력);


        Ordered ordered = new Ordered(this);
        ordered.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){


        주문취소됨 주문취소됨 = new 주문취소됨(this);
        주문취소됨.publishAfterCommit();



        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = AppApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }




    public static void changeOrderState(배달시작됨 배달시작됨){

        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(배달시작됨.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

        
    }


}
