package com.webapptest;

public class Backbase {
    private Long id;
    private Long accountId;
    private Long counterPartyAccount;
    private String counterPartyName;
    private String counterPartyLogoPath;
    private int instructedAmount;
    private int instructedCurrency;
    private int transactionAmount;
    private int transactionCurrency;
    private String transactionType;
    private String description;

    public Backbase(Long id, Long accountId, Long counterPartyAccount, String counterPartyName, String counterPartyLogoPath, int instructedAmount, int instructedCurrency, int transactionAmount, int transactionCurrency, String transactionType, String description) {
        this.id = id;
        this.accountId = accountId;
        this.counterPartyAccount = counterPartyAccount;
        this.counterPartyName = counterPartyName;
        this.counterPartyLogoPath = counterPartyLogoPath;
        this.instructedAmount = instructedAmount;
        this.instructedCurrency = instructedCurrency;
        this.transactionAmount = transactionAmount;
        this.transactionCurrency = transactionCurrency;
        this.transactionType = transactionType;
        this.description = description;
    }

    public Backbase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCounterPartyAccount() {
        return counterPartyAccount;
    }

    public void setCounterPartyAccount(Long counterPartyAccount) {
        this.counterPartyAccount = counterPartyAccount;
    }

    public String getCounterPartyName() {
        return counterPartyName;
    }

    public void setCounterPartyName(String counterPartyName) {
        this.counterPartyName = counterPartyName;
    }

    public String getCounterPartyLogoPath() {
        return counterPartyLogoPath;
    }

    public void setCounterPartyLogoPath(String counterPartyLogoPath) {
        this.counterPartyLogoPath = counterPartyLogoPath;
    }

    public int getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(int instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public int getInstructedCurrency() {
        return instructedCurrency;
    }

    public void setInstructedCurrency(int instructedCurrency) {
        this.instructedCurrency = instructedCurrency;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public int getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(int transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
