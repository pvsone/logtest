package com.example;

import java.util.Date;

public class LogMessage {

    private Date createdDate;
    private String createdUser;
    private String applicationName;
    private String logLevel;
    private String host;
    private String logTitle;
    private String visidId;
    private String logRequestId;
    private LogMessagePayload payload;

    public LogMessage() {
    }

    public LogMessage(Date createdDate, String createdUser, String applicationName, String logLevel, String host, String logTitle, String visidId, String logRequestId, LogMessagePayload payload) {
        this.createdDate = createdDate;
        this.createdUser = createdUser;
        this.applicationName = applicationName;
        this.logLevel = logLevel;
        this.host = host;
        this.logTitle = logTitle;
        this.visidId = visidId;
        this.logRequestId = logRequestId;
        this.payload = payload;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getLogTitle() {
        return logTitle;
    }

    public void setLogTitle(String logTitle) {
        this.logTitle = logTitle;
    }

    public String getVisidId() {
        return visidId;
    }

    public void setVisidId(String visidId) {
        this.visidId = visidId;
    }

    public String getLogRequestId() {
        return logRequestId;
    }

    public void setLogRequestId(String logRequestId) {
        this.logRequestId = logRequestId;
    }

    public LogMessagePayload getPayload() {
        return payload;
    }

    public void setPayload(LogMessagePayload payload) {
        this.payload = payload;
    }

}
