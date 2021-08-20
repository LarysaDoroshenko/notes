package com.example.notes.config;

import com.example.notes.entity.NoteEntity;
import com.example.notes.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class DataSetupConfig {
    
    private final NoteRepository noteRepository;
    
    @PostConstruct
    public void setupData() {
        NoteEntity noteEntity1 = new NoteEntity();
        noteEntity1.setId(1L);
        noteEntity1.setContent("First note");
        noteEntity1.setCreatedAt(LocalDateTime.now());

        NoteEntity noteEntity2 = new NoteEntity();
        noteEntity2.setId(2L);
        noteEntity2.setContent("Second note");
        noteEntity2.setCreatedAt(LocalDateTime.now());

        NoteEntity noteEntity3 = new NoteEntity();
        noteEntity3.setId(3L);
        noteEntity3.setContent("Third note");
        noteEntity3.setCreatedAt(LocalDateTime.now());
        
        noteRepository.save(noteEntity1);
        noteRepository.save(noteEntity2);
        noteRepository.save(noteEntity3);
    }
    
}
