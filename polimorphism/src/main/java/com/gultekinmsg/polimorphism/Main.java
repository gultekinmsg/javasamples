package com.gultekinmsg.polimorphism;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Audi audi = new Audi(10, "A4");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Lada lada = new Lada(12, "R1");
        System.out.println(lada.startEngine());
        System.out.println(lada.accelerate());
        System.out.println(lada.brake());

        Royce royce = new Royce(6, "RCV");
        System.out.println(royce.startEngine());
        System.out.println(royce.accelerate());
        System.out.println(royce.brake());

        Bmw bmw = new Bmw(4, "K1");
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());
    }
}


class Car {
    private int wheels;
    private boolean engine;
    private int cylinders;
    private String name;

    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car startEngine()";
    }

    public String accelerate() {
        return "Car accelerate()";
    }

    public String brake() {
        return "Car brake()";
    }
}

class Audi extends Car {
    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ " startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ " accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " break()";
    }
}

class Lada extends Car {
    public Lada(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ " startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ " accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " break()";
    }
}

class Royce extends Car {
    public Royce(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ " startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ " accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " break()";
    }
}

class Bmw extends Car {
    public Bmw(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ " startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+ " accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+ " break()";
    }
}
