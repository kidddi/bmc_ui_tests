package com.bmc.fw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Groups {

    private Set<GroupData> groups;

    public Groups(Set<GroupData> groups) {
        this.groups = new HashSet<GroupData>(groups);
    }

    public Groups withAdded(GroupData group){
        Groups newObj = new Groups(groups);
        newObj.groups.add(group);
        return newObj;
    }

    public Groups groupPrinter(){
        System.out.println("Printing GROUPS");

        for (GroupData group : groups) {
            System.out.println(group.id);
        }
        //for (int i = 0; i < groups.size(); i++){
//            String s = groups.iterator().next().id;
//            System.out.println(s);

        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Groups groups1 = (Groups) o;

        return !(groups != null ? !groups.equals(groups1.groups) : groups1.groups != null);
    }

    @Override
    public int hashCode() {
        //return groups != null ? groups.hashCode() : 0;
        return 0;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "groups=" + groups +
                '}';
    }
}
