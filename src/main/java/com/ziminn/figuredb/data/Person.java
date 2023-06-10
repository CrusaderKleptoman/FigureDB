package com.ziminn.figuredb.data;

import java.util.HashMap;

public class Person {
    private String firstName;
    private String lastName;
    private String nickname;
    private String phone;
    private HashMap<String, FigureCollection> collection = new HashMap<>();
    private String tradeOption;
    private String deliveryOption;

    public Person(){}

    public Person(String firstName, String lastName, String nickname, String phone, HashMap<String, FigureCollection> collection, String tradeOption, String deliveryOption) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.phone = phone;
        this.collection = collection;
        this.tradeOption = tradeOption;
        this.deliveryOption = deliveryOption;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public HashMap<String, FigureCollection> getCollection() {
        return collection;
    }

    public void setCollection(String name, FigureCollection collection) {
        this.collection.put(name, collection);
    }

    public String getTradeOption() {
        return tradeOption;
    }

    public void setTradeOption(String tradeOption) {
        this.tradeOption = tradeOption;
    }

    public String getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }
}
