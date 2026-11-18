package org.example;

import org.example.company.Car;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.accelerate());
    }
}