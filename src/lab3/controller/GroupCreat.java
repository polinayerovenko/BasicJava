package lab3.controller;

import lab3.model.Group;

public class GroupCreat {
    public Group createGroup(String name){
        return new Group(name);
    }
}
