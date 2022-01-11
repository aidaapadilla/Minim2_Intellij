package edu.upc.dsa;
import edu.upc.dsa.models.Repositorios;
import edu.upc.dsa.models.User;

import java.util.LinkedList;
import java.util.List;

public interface Manager {
    public List<Repositorios> getRepositorios(String User);
    public User getUser(String user);
}
