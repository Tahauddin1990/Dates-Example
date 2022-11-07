package com.tahauddin.syed.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryList {

    private String id;

    @JsonProperty("IndianTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Asia/Kolkata")
    private Date indianDate;

    @JsonProperty("DubaiTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Asia/Dubai")
    private Date dubaiDate;

    @JsonProperty("QatarTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Asia/Qatar")
    private Date qatarDate;

    @JsonProperty("LondonTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Europe/London")
    private Date londonDate;

    @JsonProperty("UsTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "America/New_York")
    private Date usDate;

    @JsonProperty("SydneyTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Australia/Sydney")
    private Date sydneyDate;

    @JsonProperty(value = "GermanyTime", defaultValue = "0")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss a", timezone = "Europe/Berlin")
    private Date germanyTime;


}
