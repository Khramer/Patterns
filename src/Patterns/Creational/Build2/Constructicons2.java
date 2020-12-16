package Patterns.Creational.Build2;

public class Constructicons2 {
    private boolean aircraft = false;
    private boolean tank = false;
    private boolean car = false;
    private boolean spaceship = false;

    public boolean isAircraft() {
        return aircraft;
    }

    public boolean isTank() {
        return tank;
    }

    public boolean isCar() {
        return car;
    }

    public boolean isSpaceship() {
        return spaceship;
    }

    private Constructicons2(Builder builder){
        this.aircraft = builder.aircraft;
        this.tank = builder.tank;
        this.car = builder.car;
        this.spaceship = builder.spaceship;
    }

    public static class Builder {
        private boolean aircraft = false;
        private boolean tank = false;
        private boolean car = false;
        private boolean spaceship = false;

        public Builder(){
        }

        public Builder setAircraft(){
            this.aircraft = true;
            return this;
        }

        public Builder setTank(){
            this.tank = true;
            return this;
        }

        public Builder setCar(){
            this.car = true;
            return this;
        }

        public Builder setSpaceship(){
            this.spaceship = true;
            return this;
        }

        public Constructicons2 build() {
            return new Constructicons2(this);
        }
    }
}
