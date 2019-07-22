package com.example.skyscanner.Model;

public class Currency {
    private String code;
    private String symbol;
    private String thousandsSeparator;
    private String decimalSeparator;
    private Boolean symbolOnLeft;
    private Boolean spaceBetweenAmountAndSymbol;
    private Integer roundingCoefficient;
    private Integer decimalDigits;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getSymbol() {
        return symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public String getThousandsSeparator() {
        return thousandsSeparator;
    }
    public void setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }
    public String getDecimalSeparator() {
        return decimalSeparator;
    }
    public void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }
    public Boolean getSymbolOnLeft() {
        return symbolOnLeft;
    }
    public void setSymbolOnLeft(Boolean symbolOnLeft) {
        this.symbolOnLeft = symbolOnLeft;
    }
    public Boolean getSpaceBetweenAmountAndSymbol() {
        return spaceBetweenAmountAndSymbol;
    }
    public void setSpaceBetweenAmountAndSymbol(Boolean spaceBetweenAmountAndSymbol) {
        this.spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol;
    }
    public Integer getRoundingCoefficient() {
        return roundingCoefficient;
    }
    public void setRoundingCoefficient(Integer roundingCoefficient) {
        this.roundingCoefficient = roundingCoefficient;
    }
    public Integer getDecimalDigits() {
        return decimalDigits;
    }
    public void setDecimalDigits(Integer decimalDigits) {
        this.decimalDigits = decimalDigits;
    }
}