package org.example.sem1.Homework.model;

public class HotDrinks extends Product{
    private Integer temperature;
    public HotDrinks(Integer name, Integer volume) {
        super(name, volume);
    }
    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public HotDrinks(Integer name, Integer volume, Integer temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrinks)) {
            return false;
        }

        HotDrinks that = (HotDrinks) o;

        return super.getName().equals(that.getName())
                && super.getVolume() == that.getVolume()
                && getTemperature() == that.getTemperature();
    }


}
