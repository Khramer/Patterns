package Patterns.Creational.Build2;

public class TransformerMini2 {

    private boolean aircraft = false;

    public boolean isAircraft() {
        return aircraft;
    }

    private TransformerMini2(Builder builder){
        this.aircraft = builder.aircraft;
    }

    //--------------------Билдер-------------------------
    public static class Builder {

        private boolean aircraft = false;

        public Builder(){
        }

        public Builder setAircraft(){
            this.aircraft = true;
            return this;
        }

        public TransformerMini2 build() {
            return new TransformerMini2(this);
        }
    }
    //------------------------------------------------------
}
