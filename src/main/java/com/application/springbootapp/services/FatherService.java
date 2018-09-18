package com.application.springbootapp.services;

import com.application.springbootapp.dao.FatherDao;
import com.application.springbootapp.dao.FatherDaoImpl;
import com.application.springbootapp.model.Father;
import org.springframework.stereotype.Service;

@Service
public class FatherService {

    private FatherDao fatherDao = new FatherDaoImpl();

    public Father readFather(int familyId){
        return fatherDao.getFather(familyId);
    }
}
