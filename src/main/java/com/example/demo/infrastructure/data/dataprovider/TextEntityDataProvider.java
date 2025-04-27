package com.example.demo.infrastructure.data.dataprovider;

import com.example.demo.infrastructure.data.entity.TextEntity;
import com.example.demo.infrastructure.data.repository.TextEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TextEntityDataProvider {

    private final TextEntityRepository textEntityRepository;

    public List<String> getAllTexts() {
        return textEntityRepository.findAll()
                .stream()
                .map(TextEntity::getValue)
                .toList();
    }

    public void addText(final String text) {
        final var entity = new TextEntity(text);
        textEntityRepository.save(entity);
    }
}
