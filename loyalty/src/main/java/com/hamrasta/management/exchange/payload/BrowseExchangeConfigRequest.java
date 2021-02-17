package com.hamrasta.management.exchange.payload;

import com.hamrasta.management.common.constants.TokenKind;
import com.hamrasta.trellis.core.payload.RequestMessage;

public class BrowseExchangeConfigRequest extends RequestMessage {
    private TokenKind src;
    private TokenKind dest;

    public TokenKind getSrc() {
        return src;
    }

    public void setSrc(TokenKind src) {
        this.src = src;
    }

    public TokenKind getDest() {
        return dest;
    }

    public void setDest(TokenKind dest) {
        this.dest = dest;
    }

    public BrowseExchangeConfigRequest(TokenKind src, TokenKind dest) {
        setSrc(src);
        setDest(dest);
    }

    @Override
    public String toString() {
        return "BrowseExchangeRequest{" +
                "src=" + src +
                ", dest=" + dest +
                '}';
    }
}
