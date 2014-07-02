package com.movile.apolo.admin.model;

import java.util.ArrayList;
import java.util.List;


public class Template {

    private long id;

    private String name;

    private List<TemplateItem> itens;

    public Template(String name) {
        this.name = name;
    }

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

    public List<TemplateItem> getItens() {
        return itens;
    }

    public void setItens(List<TemplateItem> itens) {
        this.itens = itens;
    }


    public void add(TemplateItem templateItem) {
        if(itens==null){
            itens = new ArrayList<TemplateItem>();
        }
        
        itens.add(templateItem);
    }

    @Override
    public String toString() {
        return String.format("Template [id=%s, name=%s]", id, name);
    }
}
