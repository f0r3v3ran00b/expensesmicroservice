package com.transience.expenses.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

/**
 * Created by sanju on 2/01/2016.
 */
@Entity
@Table(name = "currencies", schema = "expenses")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currencySeqGen")
    @SequenceGenerator(name = "currencySeqGen", sequenceName = "expenses.currency_id_seq")
    private Long id;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "currency_description")
    private String currencyDescription;




    // ----------- BORING BOILERPLATE STUFF FOLLOWS

    public Currency() {
    }

    public Currency(String currencyCode, String currencyDescription) {
        this.currencyCode = currencyCode;
        this.currencyDescription = currencyDescription;
    }

    public Long getId() {
        return id;
    }

    public Currency setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public Currency setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public String getCurrencyDescription() {
        return currencyDescription;
    }

    public Currency setCurrencyDescription(String currencyDescription) {
        this.currencyDescription = currencyDescription;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        return new EqualsBuilder()
                .append(id, currency.id)
                .append(currencyCode, currency.currencyCode)
                .append(currencyDescription, currency.currencyDescription)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(currencyCode)
                .append(currencyDescription)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("currencyCode", currencyCode)
                .append("currencyDescription", currencyDescription)
                .toString();
    }
}
