package edu.teldir.security.objects;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.acls.model.Permission;

@Getter
@Setter
public class PermissionObject {
    private long domainEntityId;
    private SecurityIdentType securityIdentType;
    private String securityIdentName;
    private Permission permission;
}
