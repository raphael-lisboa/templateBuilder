package com.movile.apolo.admin.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import com.movile.apolo.admin.dao.TemplateDAO;
import com.movile.apolo.admin.model.Template;

import static org.mockito.Mockito.*;

public class TemplateControllerTest {

    @Test
    public void temQueRetornarUmaListaDeTemplate() {
        TemplateDAO dao = mock(TemplateDAO.class);       
        
        TemplateController controller = new TemplateController(dao);
        
        when(dao.listAll()).thenReturn(buildTemplateList());
        
        ModelMap model = new ModelMap();
        
        
        
        
        assertNotNull(controller.listJson(model));
        
    }

    private List<Template> buildTemplateList() {
       
        return new ArrayList<Template>();
    }

}
