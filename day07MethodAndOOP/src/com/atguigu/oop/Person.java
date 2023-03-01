package com.atguigu.oop;

import java.util.Objects;

public class Person implements Creature {

    int id;
    String race;//种族，可用枚举类代替
    String name;
    String occupation;//职业，可用枚举类代替
    int attack;
    int blood;
    int armor;//防御
    String weapon;


    @Override
    public void show() {
        System.out.println("我是一个人类 ");
    }

    @Override
    public void eat() {
        System.out.println("Person吃肉 ");
    }

    public Person() {
    }

    public Person(int id, String race, String name, String occupation, int attack, int blood, int armor, String weapon) {
        this.id = id;
        this.race = race;
        this.name = name;
        this.occupation = occupation;
        this.attack = attack;
        this.blood = blood;
        this.armor = armor;
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", race='" + race + '\'' +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", attack=" + attack +
                ", blood=" + blood +
                ", armor=" + armor +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && attack == person.attack && blood == person.blood && armor == person.armor && Objects.equals(race, person.race) && Objects.equals(name, person.name) && Objects.equals(occupation, person.occupation) && Objects.equals(weapon, person.weapon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, race, name, occupation, attack, blood, armor, weapon);
    }

}


