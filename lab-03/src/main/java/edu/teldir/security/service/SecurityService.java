package edu.teldir.security.service;

import edu.teldir.domain.entity.DomainEntity;
import edu.teldir.security.objects.PermissionObject;

import java.util.Collection;

public interface SecurityService {
    void grantPermissions(DomainEntity entity, PermissionObject po);
    void removeACL(DomainEntity entity);
    Collection<PermissionObject> getPermissions(DomainEntity entity);
    Collection<String> getRoles();
    Collection<String> getUsernames();
    void initDefaultACL(DomainEntity entity);
}
