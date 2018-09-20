package com.application.springbootapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Father father;
    private List<Child> children;

    public Family() {
        children = new ArrayList<>();
    }

    public Family(Father father, List<Child> children) {
        this.father = father;
        this.children = children;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", father=" + father +
                ", children=" + children +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
