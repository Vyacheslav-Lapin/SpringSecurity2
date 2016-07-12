package edu.teldir.security.service.impl;

import edu.teldir.domain.entity.DomainEntity;
import edu.teldir.security.dao.SecurityObjectDao;
import edu.teldir.security.objects.PermissionObject;
import edu.teldir.security.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;

@Service
public class SecurityServiceImpl implements SecurityService {

    @Autowired
    private SecurityObjectDao securityObjectDao;

    @Transactional
    public void grantPermissions(DomainEntity entity, PermissionObject po) {
        //todo - To be implemented ...
    }

    @Transactional
    public void removeACL(DomainEntity entity) {
        //todo - To be implemented ...
    }

    @Transactional
    public Collection<PermissionObject> getPermissions(DomainEntity entity) {
        //todo - To be implemented ...
        return Collections.emptyList();
    }

    @Transactional
    public Collection<String> getRoles() {
        return securityObjectDao.getRoles();
    }

    @Transactional
    public Collection<String> getUsernames() {
        return securityObjectDao.getUsernames();
    }

    @Transactional
    public void initDefaultACL(DomainEntity entity) {
        //todo - To be implemented ...
    }
}