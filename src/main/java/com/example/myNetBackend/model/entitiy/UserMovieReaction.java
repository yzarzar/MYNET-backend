package com.example.myNetBackend.model.entitiy;

import com.example.myNetBackend.model.constants.ReactionType;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class UserMovieReaction {
    
    private int userMovieReactionId;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @Enumerated(EnumType.STRING)
    private ReactionType reactionType;
}
