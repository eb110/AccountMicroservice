package com.figura.loans.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "loans")
public record ProdParametersData(String message, Map<String, String> customParameter, List<String> anotherProperty) {
}
