package com.hamrasta.management.exchange.task;

import com.hamrasta.management.exchange.data.repository.IBrowseTransferRepository;
import com.hamrasta.management.exchange.payload.BrowseTransferResponse;
import com.hamrasta.trellis.data.core.task.RepositoryTask2;
import com.hamrasta.trellis.data.core.util.DefaultPageRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class BrowseTransferTask extends RepositoryTask2<IBrowseTransferRepository, Page<BrowseTransferResponse>, Integer, Integer> {

    @Override
    public Page<BrowseTransferResponse> execute(Integer page, Integer size) throws Throwable {
        return plainToClass(getRepository().getTransfer(DefaultPageRequest.of(page, size)), BrowseTransferResponse.class);
    }
}
