package com.itchain.samplemsa.samplemsa.delivery.domain.event;

import com.itchain.samplemsa.samplemsa.common.Event;
import lombok.Getter;

import java.util.UUID;

@Getter
public class DeliveryInfoCreatedEvent implements Event {

    private String id;
    private String productId;
    private String buyerId;
    private String buyDate;
    private String startDate;
    public DeliveryInfoCreatedEvent(String productId, String buyerId, String buyDate,String startDate){
        this.id = UUID.randomUUID().toString();
        this.productId = productId;
        this.buyerId= buyerId;
        this.buyDate = buyDate;
        this.startDate= startDate;
    }
    @Override
    public String GetID() {
        return id;
    }

}
