package com.tahauddin.syed.runner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tahauddin.syed.dto.CountryList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class DatesRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        CountryList countryList = CountryList.builder()
                .id("1")
                .indianDate(new Date())
                .qatarDate(new Date())
                .londonDate(new Date())
                .dubaiDate(new Date())
                .usDate(new Date())
                .sydneyDate(new Date())
                .germanyTime(new Date())
                .build();

        ObjectMapper objectMapper = new ObjectMapper();
        String countryListJson = objectMapper.writeValueAsString(countryList);
        log.info("Country List is :: {}", countryListJson);

    }
}
