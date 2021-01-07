package com.webapptest;

public class OpenBankModel {
    private Long id;
    private Long this_accountId;
    private Long other_accountNumber;
    private String other_accountHolderName;
    private String other_accountMetadataImage_URL;
    private int detailsValueAmount;
    private int detailsValueCurrency;
    private int details_Value_Amount;
    private int details_Value_Currency;
    private String detailsType;
    private String detailsDescription;


    public OpenBankModel(Long id, Long this_accountId, Long other_accountNumber, String other_accountHolderName, String other_accountMetadataImage_URL, int detailsValueAmount, int detailsValueCurrency, int details_Value_Amount, int details_Value_Currency, String detailsType, String detailsDescription) {
        this.id = id;
        this.this_accountId = this_accountId;
        this.other_accountNumber = other_accountNumber;
        this.other_accountHolderName = other_accountHolderName;
        this.other_accountMetadataImage_URL = other_accountMetadataImage_URL;
        this.detailsValueAmount = detailsValueAmount;
        this.detailsValueCurrency = detailsValueCurrency;
        this.details_Value_Amount = details_Value_Amount;
        this.details_Value_Currency = details_Value_Currency;
        this.detailsType = detailsType;
        this.detailsDescription = detailsDescription;
    }

    public OpenBankModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getThis_accountId() {
        return this_accountId;
    }

    public void setThis_accountId(Long this_accountId) {
        this.this_accountId = this_accountId;
    }

    public Long getOther_accountNumber() {
        return other_accountNumber;
    }

    public void setOther_accountNumber(Long other_accountNumber) {
        this.other_accountNumber = other_accountNumber;
    }

    public String getOther_accountHolderName() {
        return other_accountHolderName;
    }

    public void setOther_accountHolderName(String other_accountHolderName) {
        this.other_accountHolderName = other_accountHolderName;
    }

    public String getOther_accountMetadataImage_URL() {
        return other_accountMetadataImage_URL;
    }

    public void setOther_accountMetadataImage_URL(String other_accountMetadataImage_URL) {
        this.other_accountMetadataImage_URL = other_accountMetadataImage_URL;
    }

    public int getDetailsValueAmount() {
        return detailsValueAmount;
    }

    public void setDetailsValueAmount(int detailsValueAmount) {
        this.detailsValueAmount = detailsValueAmount;
    }

    public int getDetailsValueCurrency() {
        return detailsValueCurrency;
    }

    public void setDetailsValueCurrency(int detailsValueCurrency) {
        this.detailsValueCurrency = detailsValueCurrency;
    }

    public int getDetails_Value_Amount() {
        return details_Value_Amount;
    }

    public void setDetails_Value_Amount(int details_Value_Amount) {
        this.details_Value_Amount = details_Value_Amount;
    }

    public int getDetails_Value_Currency() {
        return details_Value_Currency;
    }

    public void setDetails_Value_Currency(int details_Value_Currency) {
        this.details_Value_Currency = details_Value_Currency;
    }

    public String getDetailsType() {
        return detailsType;
    }

    public void setDetailsType(String detailsType) {
        this.detailsType = detailsType;
    }

    public String getDetailsDescription() {
        return detailsDescription;
    }

    public void setDetailsDescription(String detailsDescription) {
        this.detailsDescription = detailsDescription;
    }
}
