package com.example.skyscanner.Model;

public class Quote {
    private Integer quoteId;
    private Integer minPrice;
    private Boolean direct;
    private OutboundLeg outboundLeg;
    private String quoteDateTime;
    public Integer getQuoteId() {
        return quoteId;
    }
    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }
    public Integer getMinPrice() {
        return minPrice;
    }
    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }
    public Boolean getDirect() {
        return direct;
    }
    public void setDirect(Boolean direct) {
        this.direct = direct;
    }
    public OutboundLeg getOutboundLeg() {
        return outboundLeg;
    }
    public void setOutboundLeg(OutboundLeg outboundLeg) {
        this.outboundLeg = outboundLeg;
    }
    public String getQuoteDateTime() {
        return quoteDateTime;
    }
    public void setQuoteDateTime(String quoteDateTime) {
        this.quoteDateTime = quoteDateTime;
    }
}
