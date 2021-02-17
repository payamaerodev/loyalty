package com.hamrasta.management.exchange.action;

import com.hamrasta.management.exchange.payload.BrowseExchangeConfigRequest;
import com.hamrasta.management.exchange.payload.BrowseExchangeConfigResponse;
import com.hamrasta.management.exchange.task.BrowseExchangeConfigTask;
import com.hamrasta.trellis.context.action.Action3;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class BrowseExchangeConfigAction extends Action3<Page<BrowseExchangeConfigResponse>, BrowseExchangeConfigRequest,Integer,Integer> {

    @Override
    public Page<BrowseExchangeConfigResponse> execute(BrowseExchangeConfigRequest request,Integer page,Integer size) throws Throwable {
        return call(BrowseExchangeConfigTask.class,request,page,size);
    }

}
