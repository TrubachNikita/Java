package org.example;

class Moon implements Orbitable,Explorable{
    private String name;
    private double orbitTime;
    private Planet planet;

    public Moon(String name,double orbitTime, Planet planet){
        this.name=name;
        this.orbitTime=orbitTime;
        this.planet=planet;
    }

    @Override
    public void orbit() {
        System.out.println("Спутник "+ name+"Период "+orbitTime);
    }

    @Override
    public double getOrbitTime() {
        return orbitTime;
    }

    @Override
    public void explore() {
        System.out.println("Высадка "+name);
    }

    @Override
    public String getResources() {
        return "Лед";
    }
}
