package com.bmc.fw;

/**
 * Created by energetic on 22.06.2016.
 */
public class GroupData {

    public String id;
    public String name;
    public String header;
    public String footer;

    public GroupData(String id, String name, String header, String footer) {

        this.id = id;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupData groupData = (GroupData) o;

        //if (id != null && !id.equals(groupData.id) && groupData.id != null) return false;
        return !(name != null ? !name.equals(groupData.name) : groupData.name != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        //return result;
        return 0;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
