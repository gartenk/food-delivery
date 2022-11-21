package fooddelivery.domain;

import fooddelivery.domain.결제승인됨;
import fooddelivery.domain.결제승인됨;
import fooddelivery.domain.결제취소됨;
import fooddelivery.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="결제이력_table")
@Data

public class 결제이력  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private Double 금액;

    @PrePersist
    public void onPrePersist(){


        결제승인됨 결제승인됨 = new 결제승인됨(this);
        결제승인됨.publishAfterCommit();



        결제승인됨 결제승인됨 = new 결제승인됨(this);
        결제승인됨.publishAfterCommit();



        결제취소됨 결제취소됨 = new 결제취소됨(this);
        결제취소됨.publishAfterCommit();

    }

    public static 결제이력Repository repository(){
        결제이력Repository 결제이력Repository = PayApplication.applicationContext.getBean(결제이력Repository.class);
        return 결제이력Repository;
    }




    public static void 결재취소함(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        결제이력 결제이력 = new 결제이력();
        repository().save(결제이력);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(결제이력->{
            
            결제이력 // do something
            repository().save(결제이력);


         });
        */

        
    }


}
