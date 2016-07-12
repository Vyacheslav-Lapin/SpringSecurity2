package edu.teldir.security.dao;

import java.util.Collection;

/**
 * @author Anton German &lt;AGerman@epam.com&gt;
 * @version 1.0 15.04.12
 */
public interface SecurityObjectDao {
    Collection<String> getRoles();
    Collection<String> getUsernames();
}
