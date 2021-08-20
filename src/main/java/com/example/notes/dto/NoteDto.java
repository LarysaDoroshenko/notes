package com.example.notes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class NoteDto {

    private String content;
    private LocalDateTime createdAt;

}
