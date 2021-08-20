package com.example.notes.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
public class NoteDto {

    private String content;
    private Timestamp createdAt;

}
