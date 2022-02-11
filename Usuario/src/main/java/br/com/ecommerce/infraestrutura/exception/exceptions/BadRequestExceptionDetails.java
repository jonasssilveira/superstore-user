package br.com.ecommerce.infraestrutura.exception.exceptions;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BadRequestExceptionDetails {
    private LocalDateTime timestamp;
    private Integer status;
    private String title;
    private String details;
    private String message;
}
