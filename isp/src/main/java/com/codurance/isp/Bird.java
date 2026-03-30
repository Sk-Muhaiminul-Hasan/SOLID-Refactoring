package com.codurance.isp;

public class Bird implements RunningAnimal, FlyingAnimal {
    public void bark() { }
    public void run() {
        System.out.print("Bird is running");
    }
    public void fly() {
        System.out.print("Bird is flying");
    }
}