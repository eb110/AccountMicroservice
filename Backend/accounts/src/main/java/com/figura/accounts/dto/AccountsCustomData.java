package com.figura.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
public record AccountsCustomData(String message, Map<String, String> customParameter, List<String> anotherProperty) {
}
