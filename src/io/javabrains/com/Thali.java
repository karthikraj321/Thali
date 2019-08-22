package io.javabrains.com;

abstract class Thali implements Thaliinterface
{
    public abstract void addSabji();
    public abstract void addDal();
    public abstract void addRice();
    public abstract void addRoti();

    public void makeThali() {
        System.out.println("Veg Thali will be ready in 30 minutes.");
    }
}