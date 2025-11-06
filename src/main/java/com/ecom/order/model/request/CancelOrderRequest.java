package com.ecom.order.model.request;

import jakarta.validation.constraints.NotBlank;

/**
 * Request DTO for cancelling an order
 */
public record CancelOrderRequest(
    @NotBlank(message = "Cancellation reason is required")
    String reason
) {}

