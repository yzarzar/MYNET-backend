package com.example.myNetBackend.model.entitiy;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class WatchLater {
    
    private int watchLaterId;
    private LocalDateTime localDateTime;
}
