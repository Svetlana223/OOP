package org.example.sem3.homework;



public class HotDrinks1 extends Product1 {
    private Integer temperature;
    public HotDrinks1(String name, Double volume) {
        super(name, volume);
    }
    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public HotDrinks1(String name, Double volume, Integer temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotDrinks1)) {
            return false;
        }

        HotDrinks1 that = (HotDrinks1) o;

        return super.getName().equals(that.getName())
                && super.getVolume() == that.getVolume()
                && getTemperature() == that.getTemperature();
    }


}
