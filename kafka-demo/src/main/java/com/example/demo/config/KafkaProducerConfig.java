package com.example.demo.config;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.ToString;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author niqikai
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "spring.kafka", ignoreInvalidFields = true)
public class KafkaProducerConfig {
    private Map<String, String> producer;
}
