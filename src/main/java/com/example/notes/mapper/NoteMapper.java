package com.example.notes.mapper;

import com.example.notes.dto.NoteDto;
import com.example.notes.entity.NoteEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class NoteMapper {

    public List<NoteDto> mapEntityToDto(List<NoteEntity> noteEntityList) {
        return noteEntityList.stream()
                .map(noteEntity -> new NoteDto(
                        noteEntity.getContent(),
                        noteEntity.getCreatedAt()))
                .collect(Collectors.toList());
    }

}
