package com.company;

public class Main {
    public static void main(String[] args) {

        //write your code here

        solarSystem inception= new solarSystem();

        inception.Sun=1;
        inception.Moon=4;
        inception.Planets=2;

        System.out.println("The basic structure is ready");

        // developing the feature sun

        SUN omaro=new SUN();
        omaro.temperature="123346575j";
        omaro.name="ferrro";
        omaro.radius=12334444;
        omaro.color="pink";


        // planet 2
        Planet2 superwomen= new Planet2();
        superwomen.size="786386838km";
        superwomen.name="plea";
        superwomen.color="green";

        // developing planet 1

        Planet1 superplanet= new Planet1();
        superplanet.color="magenta";
        superplanet.name="hash";
        superplanet.size="54433455km";
        

    }
}