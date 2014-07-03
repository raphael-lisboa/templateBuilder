package com.movile.apolo.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.movile.apolo.admin.dao.TemplateDAO;
import com.movile.apolo.admin.model.Template;

@Controller
@RequestMapping("/template")
public class TemplateController {

    private TemplateDAO dao;

    @Autowired
    public TemplateController(TemplateDAO dao) {
        this.dao = dao;

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(ModelMap model) {
        return "template/list";
    }

    @RequestMapping(value = "/listJson", method = RequestMethod.GET)
    public @ResponseBody  List<Template> listJson(ModelMap model) {

        return dao.listAll();

    }
    
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public @ResponseBody Template find(@PathVariable Long id) {

        return dao.find(id);

    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam("templateItem") List<String> itens , @RequestParam("selTemplate") Long templateID,  ModelMap model) {    
        System.out.println(itens +" ---"+ templateID);
       return "result";
    }

}
