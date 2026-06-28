package com.figura.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "cards")
public record CardsParametersData(String message, Map<String, String> customParameter, List<String> anotherProperty) {
}
