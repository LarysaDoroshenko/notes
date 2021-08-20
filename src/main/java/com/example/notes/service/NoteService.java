package com.example.notes.service;

import com.example.notes.dto.NoteDto;
import com.example.notes.dto.NoteDtoList;
import com.example.notes.entity.NoteEntity;
import com.example.notes.input.CreateNoteInput;
import com.example.notes.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteDtoList getAllNotes() {
        List<NoteEntity> notes = noteRepository.findAll();
        List<NoteDto> noteDtos = notes.stream()
                .map(this::mapEntityToDto)
                .collect(Collectors.toList());
        return new NoteDtoList(noteDtos);
    }

    public NoteDto create(CreateNoteInput input) {
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setId(UUID.randomUUID().toString());
        noteEntity.setContent(input.getContent());
        noteEntity.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        noteEntity = noteRepository.save(noteEntity);
        return mapEntityToDto(noteEntity);
    }

    private NoteDto mapEntityToDto(NoteEntity noteEntity) {
        return NoteDto.builder()
                .content(noteEntity.getContent())
                .createdAt(noteEntity.getCreatedAt())
                .build();
    }

}
