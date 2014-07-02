package com.movile.apolo.admin.model;

public class Banana {
    
    private long id;
    
    private String name;
    
    private boolean mandatory;

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

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    @Override
    public String toString() {
        return String.format("Banana [id=%s, name=%s, mandatory=%s]", id, name, mandatory);
    }
    
    
    

}
