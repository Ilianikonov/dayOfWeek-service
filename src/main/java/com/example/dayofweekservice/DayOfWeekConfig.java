package com.example.dayofweekservice;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class DayOfWeekConfig {
        @Value("${dayOfWeek.service.sleep}")
        private int sleep;
        @Value("${dayOfWeek.service.numberRequestsError}")
        private int numberRequestsError;
}
