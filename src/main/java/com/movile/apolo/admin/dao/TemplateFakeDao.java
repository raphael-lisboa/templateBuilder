package com.movile.apolo.admin.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.movile.apolo.admin.model.Template;
import com.movile.apolo.admin.model.TemplateItem;

@Repository
public class TemplateFakeDao implements TemplateDAO {

    @Override
    public List<Template> listAll() {
        List<Template> list = new ArrayList<>();

        list.add(buildTemplate("template 1"));
        list.add(buildTemplate("template 2"));
        list.add(buildTemplate("template 3"));

        return list;
    }

    private Template buildTemplate(String name) {
        Template template = new Template(name);
        template.add(new TemplateItem("item 1"));
        template.add(new TemplateItem("item 2"));
        
        return template;
    }

}
