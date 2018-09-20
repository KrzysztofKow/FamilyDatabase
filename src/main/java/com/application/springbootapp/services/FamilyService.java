package com.application.springbootapp.services;

import com.application.springbootapp.model.Child;
import com.application.springbootapp.model.Family;
import com.application.springbootapp.model.Father;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyService {

    @Autowired
    private FatherService fatherService;
    @Autowired
    private ChildService childService;

    public Family createFamily(){
        return new Family();
    }

    public Family addFatherToFamily(Family family, Father father){
        family.setFather(father);
        return family;
    }

    public Family addChildToFamily(Family family, Child child){
        family.getChildren().add(child);
        return family;
    }

    public Family readFamily(int id){
        //fatherService.readFather(id);
        //childService.readChild();
        return null; //TODO
    }
}
