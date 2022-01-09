package edu.upc.dsa.models;
import javax.ws.rs.core.Link;
import java.util.LinkedList;

public class User {
    private String name;
    private String nickname;
    private String avatar;
    private LinkedList<Insignias> insignias;

    public User(){}
    public User(String name, String nickname, String avatar, LinkedList<Insignias> insignias){
        this();
        setName(name);
        setNickname(nickname);
        setAvatar(avatar);
        setInsignias(insignias);
    }

    public void setName(String name){this.name = name;}
    public void setNickname(String nickname){this.nickname = nickname;}
    public void setAvatar(String avatar) {this.avatar = avatar;}
    public void setInsignias(LinkedList<Insignias> lista){this.insignias = lista;}

    public String getName(){return name;}
    public String getNickname(){return nickname;}
    public String getAvatar() {return avatar;}
    public LinkedList<Insignias> getInsignias() {return insignias;}
}
