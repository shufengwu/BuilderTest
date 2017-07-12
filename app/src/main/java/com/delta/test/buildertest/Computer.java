package com.delta.test.buildertest;

/**
 * Created by Shufeng.Wu on 2017/7/12.
 */

public class Computer {
    private String mBoard;
    private String mDisplay;
    private String mOS;

    private Computer(Builder builder){
        this.mBoard = builder.mBoard;
        this.mDisplay = builder.mDisplay;
        this.mOS = builder.mOS;
    }

    static class Builder{
        private String mBoard;
        private String mDisplay;
        private String mOS;
        public Builder builder(){
            return new Builder();
        }

        public Builder buildBoard(String mBoard){
            this.mBoard = mBoard;
            return this;
        }

        public Builder buildmDisplay(String mDisplay){
            this.mDisplay = mDisplay;
            return this;
        }

        public Builder buildOS(String mOS){
            this.mOS = mOS;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }


    }

    @Override
    public String toString() {
        return "Builder{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }

}
