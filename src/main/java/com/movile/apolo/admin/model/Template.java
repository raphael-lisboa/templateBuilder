package com.movile.apolo.admin.model;

import java.util.List;

public class Template {
    
    
    
    private long id;
    
    private String name;
    
    private List<Banana> itens;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Banana> getItens() {
        return itens;
    }

    public void setItens(List<Banana> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return String.format("Template [id=%s, name=%s]", id, name);
    }
    
    

}
