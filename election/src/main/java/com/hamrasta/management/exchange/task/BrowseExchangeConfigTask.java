package com.hamrasta.management.exchange.task;

import com.hamrasta.management.exchange.data.repository.IExchangeConfigRepository;
import com.hamrasta.management.exchange.payload.BrowseExchangeConfigRequest;
import com.hamrasta.management.exchange.payload.BrowseExchangeConfigResponse;
import com.hamrasta.trellis.data.core.task.RepositoryTask3;
import com.hamrasta.trellis.data.core.util.DefaultPageRequest;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class BrowseExchangeConfigTask extends RepositoryTask3<IExchangeConfigRepository, Page<BrowseExchangeConfigResponse>, BrowseExchangeConfigRequest, Integer, Integer> {

    @Override
    public Page<BrowseExchangeConfigResponse> execute(BrowseExchangeConfigRequest request, Integer page, Integer size) throws Throwable {
        return plainToClass(getRepository().findByFilter(request.getSrc(), request.getDest(), DefaultPageRequest.of(page, size)),
                BrowseExchangeConfigResponse.class);
    }

}
