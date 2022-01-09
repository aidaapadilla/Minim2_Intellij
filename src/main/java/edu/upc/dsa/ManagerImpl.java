package edu.upc.dsa;

import edu.upc.dsa.models.Insignias;
import edu.upc.dsa.models.User;

import java.util.LinkedList;

public class ManagerImpl implements Manager {
    private static ManagerImpl manager;
    public ManagerImpl(){}
    public static ManagerImpl getInstance(){
        if(manager==null){
            manager = new ManagerImpl();
        }
        return manager;
    }
    LinkedList<Insignias> insignias = new LinkedList<Insignias>();
    LinkedList<User> users = new LinkedList<User>();

    Insignias jugon = new Insignias("El más jugón","http://localhost:8080/public/jugon.png");
    Insignias lento = new Insignias("El más lento","http://localhost:8080/public/lento.png");
    Insignias epico = new Insignias("El más épico","http://localhost:8080/public/epico.png");
    Insignias sostenible = new Insignias("El más sostenible","http://localhost:8080/public/sostenible.png");
    Insignias legendario = new Insignias("El más legendario","http://localhost:8080/public/legendario.png");
    Insignias meteorico = new Insignias("El más meteórico","http://localhost:8080/public/meteorico.png");
    @Override
    public LinkedList<Insignias> getInsignias() {
        insignias.add(jugon);
        insignias.add(lento);
        insignias.add(epico);
        insignias.add(sostenible);
        insignias.add(legendario);
        insignias.add(meteorico);
        return insignias;
    }

    @Override
    public User getUser(String user) {
        LinkedList<Insignias> insigniasUser1 = new LinkedList<Insignias>();
        insigniasUser1.add(sostenible);
        insigniasUser1.add(legendario);
        User user1 = new User("Pepe","papichulo","null",insigniasUser1);
        users.add(user1);

        LinkedList<Insignias> insigniasUser2 = new LinkedList<Insignias>();
        insigniasUser2.add(jugon);
        insigniasUser2.add(lento);
        User user2 = new User("Paca","lamasguapa","null",insigniasUser2);
        users.add(user2);
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
