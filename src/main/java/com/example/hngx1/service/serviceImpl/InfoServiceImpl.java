package com.example.hngx1.service.serviceImpl;

import com.example.hngx1.service.InfoService;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Map;

import static java.time.DayOfWeek.*;

@Service
public class InfoServiceImpl implements InfoService {
    @Override
    public Map<String, Object> getInfo(String slackName, String track) {

        Map<String, Object> response = new HashMap<>();

        // Construct GitHub URLs
        String githubFileUrl = "https://github.com/omnizzy/hngx-stage1/blob/main/src/main/java/com/example/hngx1/Hngx1Application.java";
        String githubRepoUrl = "https://github.com/omnizzy/hngx-stage1";

        // Get current day of the week
        DayOfWeek currentDay = LocalDateTime.now().getDayOfWeek();
        String currentDayOfWeek = currentDay.getDisplayName(
                TextStyle.FULL,
                java.util.Locale.ENGLISH
        );

        // Get current UTC time.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String currentUtcTime = LocalDateTime.now().format(formatter);


        response.put("slack_name", slackName);
        response.put("current_day", currentDayOfWeek);
        response.put("utc_time", currentUtcTime);
        response.put("track", track);
        response.put("github_file_url", githubFileUrl);
        response.put("github_repo_url", githubRepoUrl);
        response.put("status_code", 200);

        return response;
    }
}
