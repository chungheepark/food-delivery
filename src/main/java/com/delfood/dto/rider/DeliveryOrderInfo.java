package com.delfood.dto.rider;

import com.delfood.dto.order.OrderDTO.OrderStatus;
import lombok.Getter;

@Getter
public class DeliveryOrderInfo {
  private Long orderId;
  private Long deliveryCost;
  private OrderStatus orderStatus;
  
}
