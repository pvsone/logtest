package com.example;

import java.util.Date;

public class LogMessagePayload {

    private String messageText;
    private Date messageTimestamp;
    private String methodName;
    private String stackTrace;
    private String applicationData;

    public LogMessagePayload() {
    }

    public LogMessagePayload(String messageText, Date messageTimestamp, String methodName, String stackTrace, String applicationData) {
        this.messageText = messageText;
        this.messageTimestamp = messageTimestamp;
        this.methodName = methodName;
        this.stackTrace = stackTrace;
        this.applicationData = applicationData;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Date getMessageTimestamp() {
        return messageTimestamp;
    }

    public void setMessageTimestamp(Date messageTimestamp) {
        this.messageTimestamp = messageTimestamp;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public String getApplicationData() {
        return applicationData;
    }

    public void setApplicationData(String applicationData) {
        this.applicationData = applicationData;
    }
}
