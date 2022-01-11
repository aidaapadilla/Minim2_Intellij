package edu.upc.dsa.models;
import javax.ws.rs.core.Link;
import java.util.LinkedList;
import java.util.List;

public class User {
    private String name;
    private int followers;
    private int following;
    private List<Repositorios> repositorios;

    public User(){}
    public User(String name, int followers, int following, List<Repositorios> repositorios){
        this();
        setName(name);
        setFollowers(followers);
        setFollowing(following);
        setRepositorios(repositorios);
    }

    public String getName() {
        return name;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public List<Repositorios> getRepositorios() {
        return repositorios;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRepositorios(List<Repositorios> repositorios) {
        this.repositorios = repositorios;
    }
}
