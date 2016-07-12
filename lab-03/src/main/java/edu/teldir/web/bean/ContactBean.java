package edu.teldir.web.bean;

import edu.teldir.domain.entity.Contact;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ContactBean implements Comparable<ContactBean> {
    private long id;
    private String name;
    private String telephoneNumber;

    public ContactBean(Contact contact) {
        id = contact.getId();
        name = contact.getName();
        telephoneNumber = contact.getTelephoneNumber();
    }

    public int compareTo(ContactBean o) {
        int result = getName().compareTo(o.getName());
        if (result == 0)
            result = getTelephoneNumber().compareTo(o.getTelephoneNumber());
        return result;
    }
}
