package com.ecom.order.model.response;

import com.ecom.order.entity.Order;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Response DTO for order summary (used in order history lists)
 */
public record OrderSummaryResponse(
    UUID id,
    
    @JsonProperty("order_number")
    String orderNumber,
    
    Order.OrderStatus status,
    
    BigDecimal total,
    
    String currency,
    
    @JsonProperty("item_count")
    Integer itemCount,
    
    @JsonProperty("created_at")
    LocalDateTime createdAt
) {}

