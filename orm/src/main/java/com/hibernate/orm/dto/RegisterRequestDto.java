package com.hibernate.orm.dto;

public record RegisterRequestDto(
    String name,
    String email,
    String password
) {
    
}
