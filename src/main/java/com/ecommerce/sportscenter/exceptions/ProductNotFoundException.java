package com.ecommerce.sportscenter.exceptions;

public class ProductNotFoundException extends RuntimeException {
    
    private final String errorCode;

    public ProductNotFoundException(String message) {
        super(message);
        this.errorCode = "PRODUCT_NOT_FOUND";
    }

    public ProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = "PRODUCT_NOT_FOUND";
    }

    public String getErrorCode() {
        return errorCode;
    }
}
