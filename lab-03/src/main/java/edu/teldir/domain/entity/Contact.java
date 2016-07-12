package edu.teldir.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TD_CONTACT")
@AttributeOverride(name = "id", column = @Column(name = "CONTACT_ID", nullable = false))
@Getter
@Setter
public class Contact extends DomainEntity {
    @Column(name = "CONTACT_NAME", length = 50)
    private String name;

    @Column(name = "CONTACT_TELNUMBER", length = 20)
    private String telephoneNumber;
}
