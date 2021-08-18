package com.example.notes.controller;

import com.example.notes.dto.NoteDto;
import com.example.notes.dto.NoteDtoList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/note")
@RequiredArgsConstructor
public class NoteController {

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public NoteDtoList getAllNotes() {
        return new NoteDtoList(
                List.of(new NoteDto("First note"),
                        new NoteDto("Second note")
                ));
    }

}
