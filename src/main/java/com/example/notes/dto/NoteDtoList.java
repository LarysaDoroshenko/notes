package com.example.notes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class NoteDtoList {

    List<NoteDto> noteDtoList;

}
