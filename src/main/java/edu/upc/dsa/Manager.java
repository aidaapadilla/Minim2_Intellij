package edu.upc.dsa;
import edu.upc.dsa.models.Insignias;
import edu.upc.dsa.models.User;

import java.util.LinkedList;
public interface Manager {
    public LinkedList<Insignias> getInsignias();
    public User getUser(String user);
}
