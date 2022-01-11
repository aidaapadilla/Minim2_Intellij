package edu.upc.dsa.models;

import java.util.LinkedList;

public class Repositorios {
    private String repositoryName;
    private String language;

    public Repositorios(){};
    public Repositorios(String name, String language){
        this();
        setLanguage(language);
        setRepositoryName(name);
    }
    public String getLanguage() {
        return language;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }
}
