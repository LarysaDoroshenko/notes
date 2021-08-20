package com.example.notes.controller;

import com.example.notes.dto.NoteDto;
import com.example.notes.dto.NoteDtoList;
import com.example.notes.input.CreateNoteInput;
import com.example.notes.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/note")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @GetMapping("/list")
    @ResponseStatus(HttpStatus.OK)
    NoteDtoList getAllNotes() {
        return noteService.getAllNotes();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    NoteDto create(@RequestBody CreateNoteInput input) {
        return noteService.create(input);
    }

}
