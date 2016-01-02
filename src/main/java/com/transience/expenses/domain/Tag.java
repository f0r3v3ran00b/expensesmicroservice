package com.transience.expenses.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

/**
 * Created by sanju on 2/01/2016.
 */
@Entity
@Table(name = "tag", schema = "expenses")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tagSeqGen")
    @SequenceGenerator(name = "tagSeqGen", sequenceName = "expenses.tag_id_seq")
    private Long id;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "tag_description")
    private String tagDescription;

    public Tag() {
    }

    public Tag(Long id, String tagName, String tagDescription) {
        this.id = id;
        this.tagName = tagName;
        this.tagDescription = tagDescription;
    }








    // ===================== BORING, BOILERPLATE STUFF FOLLOWS...

    public Long getId() {
        return id;
    }

    public Tag setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTagName() {
        return tagName;
    }

    public Tag setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public String getTagDescription() {
        return tagDescription;
    }

    public Tag setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Tag tag = (Tag) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(id, tag.id)
                .append(tagName, tag.tagName)
                .append(tagDescription, tag.tagDescription)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(id)
                .append(tagName)
                .append(tagDescription)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("tagName", tagName)
                .append("tagDescription", tagDescription)
                .toString();
    }
}
