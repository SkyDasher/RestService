package model;


/**
 * Created by KevinPC on 25/03/2017.
 */
public class Panel {
    private int id;
    private String name;
    private int cost;
    private int date;
    public Panel(){}


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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Panel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", date=" + date +
                '}';
    }
}
