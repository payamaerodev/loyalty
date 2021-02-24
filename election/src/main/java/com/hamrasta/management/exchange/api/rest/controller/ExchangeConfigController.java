package com.hamrasta.management.exchange.api.rest.controller;

import com.hamrasta.management.common.constants.TokenKind;
import com.hamrasta.management.exchange.action.BrowseExchangeConfigAction;
import com.hamrasta.management.exchange.payload.BrowseExchangeConfigRequest;
import com.hamrasta.management.exchange.payload.BrowseExchangeConfigResponse;
import com.hamrasta.trellis.ui.web.controller.IController;
import com.hamrasta.trellis.validator.Range;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/exchange-management/exchanges/configs")
public class ExchangeConfigController  implements IController {

    @GetMapping("/test")
    public ResponseEntity<Page<BrowseExchangeConfigResponse>> browse(@RequestParam(defaultValue = "0") @Range(name = "page", min = 0) Integer page,
                                 @RequestParam(defaultValue = "20") @Range(name = "size", min = 1, max = 20) Integer size,
                                 @RequestParam TokenKind src,
                                 @RequestParam TokenKind dest) throws Throwable {
        return ResponseEntity.ok(call(BrowseExchangeConfigAction.class, new BrowseExchangeConfigRequest(),page,size));
    }
}
