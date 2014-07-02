package com.movile.apolo.admin.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void temQueAdicionarItensNaLista() {
        
        Template template = new Template("teste");
        
        template.add(new TemplateItem("1"));
        
        
        assertNotNull( template.getItens());
        assertEquals("1", template.getItens().get(0).getName());
    }

}
