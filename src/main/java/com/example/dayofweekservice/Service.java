package com.example.dayofweekservice;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

import static java.lang.Thread.sleep;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final DayOfWeekConfig dayOfWeekConfig;
    private int countRequests = 0;
    public String getDayOfWeek() throws ServiceError {
        this.countRequests++;
        try {
            if (countRequests == dayOfWeekConfig.getNumberRequestsError()) {
                this.countRequests = 0;
                throw new InterruptedException();
            }
                sleep(dayOfWeekConfig.getSleep());
            } catch (InterruptedException e) {
                throw new ServiceError("dayOfWeek-service");
            }
        LocalDate localDate = LocalDate.now();
        return localDate.getDayOfWeek().name();
    }
}
