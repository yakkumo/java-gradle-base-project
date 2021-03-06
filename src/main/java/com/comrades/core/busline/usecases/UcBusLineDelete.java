package com.comrades.core.busline.usecases;

import com.comrades.core.bases.UseCase;
import com.comrades.persistence.repositories.IBusLineRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

@Getter
@Setter
public class UcBusLineDelete extends UseCase<Void> {

    @Autowired
    private IBusLineRepository _busLineRepository;

    private int id;

    public UcBusLineDelete(int busLineId) {
        super();
        id = busLineId;
    }

    @Override
    protected Mono<Void> execute() throws Exception {
        var result = _busLineRepository.findById(id)
                .flatMap(_busLineRepository::delete);

        return result;
    }
}
