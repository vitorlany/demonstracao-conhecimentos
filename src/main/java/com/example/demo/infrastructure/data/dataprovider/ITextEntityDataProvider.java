package com.example.demo.infrastructure.data.dataprovider;

import java.util.List;

public interface ITextEntityDataProvider {
    List<String> getAllTexts();
    void addText(final String text);
}
