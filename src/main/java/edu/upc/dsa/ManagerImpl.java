package edu.upc.dsa;

import edu.upc.dsa.models.Repositorios;
import edu.upc.dsa.models.User;

import java.util.*;

public class ManagerImpl implements Manager {
    private static ManagerImpl manager;
    public ManagerImpl(){}
    public static ManagerImpl getInstance(){
        if(manager==null){
            manager = new ManagerImpl();
        }
        return manager;
    }
    List<Repositorios> repositorios= new LinkedList<Repositorios>();
    List<User> users = new LinkedList<User>();
    public void LlenarListas(){
        if(repositorios.size()==0){
            List<Repositorios> repoUser1 = new LinkedList<Repositorios>();
            Repositorios repo = new Repositorios("repo1","c");
            Repositorios repo2 = new Repositorios("repo2","c#");
            Repositorios repo3 = new Repositorios("repo3","c++");
            Repositorios repo4 = new Repositorios("repo4","python");
            repoUser1.add(repo);
            repoUser1.add(repo2);
            User user1 = new User("Pepe",5,4,repoUser1);
            users.add(user1);

            List<Repositorios> repoUser2 = new LinkedList<Repositorios>();
            repoUser2.add(repo3);
            repoUser2.add(repo4);
            User user2 = new User("Paca",200000,2,repoUser2);
            users.add(user2);
        }
        else{
            //Do nothing
        }
    }

    @Override
    public List<Repositorios> getRepositorios(String user) {
        LlenarListas();
        int i=0;
        int res=0;
        while (i<users.size()){
            if(users.get(i).getName().equals(user))
                res=i;
            i=i+1;
        }
        return users.get(res).getRepositorios();
    }

    @Override
    public User getUser(String user) {
        LlenarListas();
        int i=0;
        int res=0;
        while (i<users.size()){
            if(users.get(i).getName().equals(user))
                res=i;
            i=i+1;
        }
        return users.get(res);
    }
}
