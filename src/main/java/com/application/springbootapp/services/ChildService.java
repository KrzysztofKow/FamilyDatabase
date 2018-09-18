package com.application.springbootapp.services;

import com.application.springbootapp.dao.ChildDao;
import com.application.springbootapp.dao.ChildDaoImpl;
import com.application.springbootapp.model.Child;
import org.springframework.stereotype.Service;

@Service
public class ChildService {

    private ChildDao childDao = new ChildDaoImpl();

    public Child readChild(){
        return null;//TODO
    }

    public Child searchChild(Child child){
        return null;//TODO
    }
}
