package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "portfolioId")
    private Portfolio portfolio;

    protected Security() {

    }

    public Security(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Portfolio getClient() { return portfolio; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
