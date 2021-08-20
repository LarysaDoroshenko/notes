package com.example.notes.config;

import com.example.notes.entity.NoteEntity;
import com.example.notes.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DataSetupConfig {

    private final NoteRepository noteRepository;

    @Transactional
    @PostConstruct
    public void setupData() {
        NoteEntity noteEntity1 = new NoteEntity();
        noteEntity1.setId(UUID.randomUUID().toString());
        noteEntity1.setContent("First note");
        noteEntity1.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        NoteEntity noteEntity2 = new NoteEntity();
        noteEntity2.setId(UUID.randomUUID().toString());
        noteEntity2.setContent("Second note");
        noteEntity2.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        NoteEntity noteEntity3 = new NoteEntity();
        noteEntity3.setId(UUID.randomUUID().toString());
        noteEntity3.setContent("Third note");
        noteEntity3.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));

        noteRepository.save(noteEntity1);
        noteRepository.save(noteEntity2);
        noteRepository.save(noteEntity3);
    }

}
