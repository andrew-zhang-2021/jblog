package com.az.jblog.service.mapper;

import com.az.jblog.domain.*;
import com.az.jblog.service.dto.EntryDTO;
import java.util.Set;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Entry} and its DTO {@link EntryDTO}.
 */
@Mapper(componentModel = "spring", uses = { BlogMapper.class, TagMapper.class })
public interface EntryMapper extends EntityMapper<EntryDTO, Entry> {
    @Mapping(target = "blog", source = "blog", qualifiedByName = "name")
    @Mapping(target = "tags", source = "tags", qualifiedByName = "nameSet")
    EntryDTO toDto(Entry s);

    @Mapping(target = "removeTag", ignore = true)
    Entry toEntity(EntryDTO entryDTO);
}
