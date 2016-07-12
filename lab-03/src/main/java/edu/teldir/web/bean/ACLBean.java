package edu.teldir.web.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class ACLBean {
    private SecurityIdentityType securityIdentityType;
    private String username;
    private String role;
    private Collection<String> permissions;
}
