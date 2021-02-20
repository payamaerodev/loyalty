package com.hamrasta.management.exchange.action;

import com.hamrasta.management.exchange.payload.BrowseTransferResponse;
import com.hamrasta.management.exchange.task.BrowseTransferTask;
import com.hamrasta.trellis.context.action.Action2;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class BrowseTransferAction extends Action2<Page<BrowseTransferResponse>, Integer,Integer> {

    @Override
    public Page<BrowseTransferResponse> execute(Integer page, Integer size) throws Throwable {
        return call(BrowseTransferTask.class,page,size);
    }
}
