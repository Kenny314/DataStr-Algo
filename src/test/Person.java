package test;

import java.util.Objects;

public class Person implements Cloneable{
    private int id ;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        if(p.id == this.id && p.name.equals(this.name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
