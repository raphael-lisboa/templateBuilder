package com.movile.apolo.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.movile.apolo.admin.dao.TemplateDAO;

@Controller
@RequestMapping("/template")
public class TemplateController {
    
    private TemplateDAO dao;

    @Autowired
    public TemplateController(TemplateDAO dao){
        this.dao = dao;
        
    }
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(ModelMap model) {

        model.put("templates", dao.listAll());

        return "template/list";

    }
    
    

}
