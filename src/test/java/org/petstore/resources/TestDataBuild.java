package org.petstore.resources;

import org.petstore.pojo.Order;

import java.time.Instant;
import java.util.Date;

public class TestDataBuild {

    public Order postOrderPayLoad(Integer id,Integer petId,Integer quantity) {
        Order order = new Order();
        order.setId(id);
        order.setPetId(petId);
        order.setQuantity(quantity);
        Date today = new Date();
        Instant instant = today.toInstant();
        order.setShipDate(instant.toString());
        order.setStatus("placed");
        order.setComplete(true);

        return order;
    }
}
