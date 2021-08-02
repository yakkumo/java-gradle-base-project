package com.comrades.application.services.airplane.queries;

import com.comrades.domain.models.Airplane;
import com.comrades.persistence.repositories.AirplaneRepository;
import io.netty.util.internal.StringUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AirplaneQuery {

    private final AirplaneRepository AirplaneRepository;

    public Flux<Airplane> findAll() {
        return AirplaneRepository.findAll();
    }

    public Mono<Airplane> findById(int id) {
        return AirplaneRepository.findById(id)
            .switchIfEmpty(monoResponseStatusNotFoundException());
    }

    public <T> Mono<T> monoResponseStatusNotFoundException() {
        return Mono.error(new ResponseStatusException(HttpStatus.NOT_FOUND, "Airplane not found"));
    }

}