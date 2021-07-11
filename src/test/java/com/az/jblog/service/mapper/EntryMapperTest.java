package com.az.jblog.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EntryMapperTest {

    private EntryMapper entryMapper;

    @BeforeEach
    public void setUp() {
        entryMapper = new EntryMapperImpl();
    }
}
