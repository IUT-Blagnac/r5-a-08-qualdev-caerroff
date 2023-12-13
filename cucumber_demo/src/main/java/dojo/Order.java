package dojo;

import java.util.ArrayList;

public class Order {
    private String name;

    private String owner;

    private ArrayList<String> content;

    public Order() {
        this.name = "";
        this.content = new ArrayList<String>();
    }

    public Order(String name) {
        this.name = name;
        this.content = new ArrayList<String>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getContent() {
        return this.content;
    }

    public void declareOwner(String name) {
        this.owner = name;
    }

    public String getOwner() {
        return this.owner;
    }

    public void addCocktail(String name) {
        this.content.add(name);
    }
}
