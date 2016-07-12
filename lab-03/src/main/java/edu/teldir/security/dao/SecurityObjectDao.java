package edu.teldir.security.dao;

import java.util.Collection;

public interface SecurityObjectDao {
    Collection<String> getRoles();
    Collection<String> getUsernames();
}
