package com.application.springbootapp.dao;

import com.application.springbootapp.model.Child;

import java.util.List;

public interface ChildDao {

    List<Child> getChildren(Child child);
}
