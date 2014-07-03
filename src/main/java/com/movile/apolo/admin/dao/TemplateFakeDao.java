package com.movile.apolo.admin.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.movile.apolo.admin.model.Template;
import com.movile.apolo.admin.model.TemplateItem;

@Repository
public class TemplateFakeDao implements TemplateDAO {

    private List<Template> list;

    public TemplateFakeDao() {
        list = new ArrayList<>();

        list.add(buildTemplate("template 1", 1));
        list.add(buildTemplate("template 2", 2));
        list.add(buildTemplate("template 3", 3));

    }

    @Override
    public List<Template> listAll() {
        return list;
    }

    private Template buildTemplate(String name, long id) {
        Template template = new Template(name);
        template.setId(id);
        template.add(new TemplateItem("item 1"));
        template.add(new TemplateItem("item 2"));

        return template;
    }

    @Override
    public Template find(Long id) {
        for (Template template : list) {
            if (template.getId().equals(id)) {
                return template;
            }
        }
        return null;
    }

}
