package com.example.notes.service;

import com.example.notes.dto.NoteDtoList;
import com.example.notes.entity.NoteEntity;
import com.example.notes.mapper.NoteMapper;
import com.example.notes.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {
    
    private final NoteRepository noteRepository;
    private final NoteMapper noteMapper;
    
    public NoteDtoList getAllNotes() {
        List<NoteEntity> notes = noteRepository.findAll();
        return new NoteDtoList(noteMapper.mapEntityToDto(notes));
    }
    
}
