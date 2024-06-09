package com.web.tadak.util.mapper;

public interface EntityMapper<D,E> {
    D toDTO(E entity);
    E toEntity(D dto);
}
