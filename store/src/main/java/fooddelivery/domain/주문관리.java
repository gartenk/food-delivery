package fooddelivery.domain;

import fooddelivery.domain.배달시작됨;
import fooddelivery.domain.배달시작됨;
import fooddelivery.domain.쿠폰발행됨;
import fooddelivery.domain.쿠폰발행됨;
import fooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="주문관리_table")
@Data

public class 주문관리  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();



        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){


        쿠폰발행됨 쿠폰발행됨 = new 쿠폰발행됨(this);
        쿠폰발행됨.publishAfterCommit();



        쿠폰발행됨 쿠폰발행됨 = new 쿠폰발행됨(this);
        쿠폰발행됨.publishAfterCommit();

    }
    @PreUpdate
    public void onPreUpdate(){
    }

    public static 주문관리Repository repository(){
        주문관리Repository 주문관리Repository = StoreApplication.applicationContext.getBean(주문관리Repository.class);
        return 주문관리Repository;
    }




    public static void 주문정보받음(결제승인됨 결제승인됨){

        /** Example 1:  new item 
        주문관리 주문관리 = new 주문관리();
        repository().save(주문관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(결제승인됨.get???()).ifPresent(주문관리->{
            
            주문관리 // do something
            repository().save(주문관리);


         });
        */

        
    }
    public static void 주문취소처리(결제취소됨 결제취소됨){

        /** Example 1:  new item 
        주문관리 주문관리 = new 주문관리();
        repository().save(주문관리);

        */

        /** Example 2:  finding and process
        
        repository().findById(결제취소됨.get???()).ifPresent(주문관리->{
            
            주문관리 // do something
            repository().save(주문관리);


         });
        */

        
    }


}
