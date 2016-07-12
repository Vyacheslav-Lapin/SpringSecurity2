package edu.teldir.web.bean;

import edu.teldir.security.objects.SecurityIdentType;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
public class PermissionObjectBean {
    private long domainEntityId;
    private SecurityIdentType securityIdentType;
    private String username;
    private String role;
    private Collection<String> permissions;
}
