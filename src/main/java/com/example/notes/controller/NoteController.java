package com.example.notes.controller;

import com.example.notes.dto.NoteDtoList;
import com.example.notes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/note")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    public NoteDtoList getAllNotes() {
        return noteService.getAllNotes();
    }

}
