package com.example;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;

@RestController
public class LogtestController {

    @GetMapping("/")
    public LogMessage message(@RequestParam(defaultValue = "  this is a test message") String text, @RequestParam(defaultValue = "10") int repeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(text);
            sb.append(i);
        }

        LogMessagePayload payload = new LogMessagePayload();
        payload.setApplicationData("");
        payload.setMessageText(sb.toString());
        payload.setMessageTimestamp(new Date());
        payload.setMethodName("");
        payload.setStackTrace("");

        LogMessage message = new LogMessage();
        message.setCreatedDate(new Date());
        message.setCreatedUser("TBD");
        message.setApplicationName("PCF_LOG_MESSAGE_TEST");
        message.setLogLevel("INFO");
        message.setHost("");
        message.setLogTitle("PCF_Test");
        message.setVisidId("1234_Test");
        message.setLogRequestId("");
        message.setPayload(payload);

        ObjectMapper mapper = new ObjectMapper();
        try {
            String value = mapper.writeValueAsString(message);
            System.out.println("************************** LENGTH: " + value.length());
            System.out.println("************************** VALUE: " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

}
