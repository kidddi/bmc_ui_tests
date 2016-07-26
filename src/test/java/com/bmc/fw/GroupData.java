package com.bmc.fw;

/**
 * Created by energetic on 22.06.2016.
 */
public class GroupData {

    private String id;
    private String name;
    private String header;
    private String footer;

    public GroupData(String id, String name, String header, String footer) {

        this.setId(id);
        this.setName(name);
        this.setHeader(header);
        this.setFooter(footer);
    }

    public GroupData() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupData groupData = (GroupData) o;

        //if (id != null && !id.equals(groupData.id) && groupData.id != null) return false;
        return !(getName() != null ? !getName().equals(groupData.getName()) : groupData.getName() != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        //return result;
        return 0;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }

    public GroupData setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupData setName(String name) {
        this.name = name;
        return this;
    }

    public GroupData setHeader(String header) {
        this.header = header;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
