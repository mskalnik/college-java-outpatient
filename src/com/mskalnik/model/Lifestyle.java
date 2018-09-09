/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mskalnik.model;

/**
 *
 * @author mskalnik
 */
public class Lifestyle {
    private Boolean vegeterian;
    private Boolean smoker;
    private int averageCigarettes;
    private Boolean alcohol;
    private int averageDrinks;
    private String stimulans;
    private int coffeTeaDay;
    private int softDrinksDay;
    private Boolean regularMeals;
    private Boolean eatHomeFood;

    public Lifestyle() {}

    public Lifestyle(Boolean vegeterian, Boolean smoker, int averageCigarettes, Boolean alcohol, int averageDrinks, String stimulans, int coffeTeaDay, int softDrinksDay, Boolean regularMeals, Boolean eatHomeFood) {
        this.vegeterian = vegeterian;
        this.smoker = smoker;
        this.averageCigarettes = averageCigarettes;
        this.alcohol = alcohol;
        this.averageDrinks = averageDrinks;
        this.stimulans = stimulans;
        this.coffeTeaDay = coffeTeaDay;
        this.softDrinksDay = softDrinksDay;
        this.regularMeals = regularMeals;
        this.eatHomeFood = eatHomeFood;
    }

    public Boolean getVegeterian() {
        return vegeterian;
    }

    public Boolean getSmoker() {
        return smoker;
    }

    public int getAverageCigarettes() {
        return averageCigarettes;
    }

    public Boolean getAlcohol() {
        return alcohol;
    }

    public int getAverageDrinks() {
        return averageDrinks;
    }

    public String getStimulans() {
        return stimulans;
    }

    public int getCoffeTeaDay() {
        return coffeTeaDay;
    }

    public int getSoftDrinksDay() {
        return softDrinksDay;
    }

    public Boolean getRegularMeals() {
        return regularMeals;
    }

    public Boolean getEatHomeFood() {
        return eatHomeFood;
    }

    public void setVegeterian(Boolean vegeterian) {
        this.vegeterian = vegeterian;
    }

    public void setSmoker(Boolean smoker) {
        this.smoker = smoker;
    }

    public void setAverageCigarettes(int averageCigarettes) {
        this.averageCigarettes = averageCigarettes;
    }

    public void setAlcohol(Boolean alcohol) {
        this.alcohol = alcohol;
    }

    public void setAverageDrinks(int averageDrinks) {
        this.averageDrinks = averageDrinks;
    }

    public void setStimulans(String stimulans) {
        this.stimulans = stimulans;
    }

    public void setCoffeTeaDay(int coffeTeaDay) {
        this.coffeTeaDay = coffeTeaDay;
    }

    public void setSoftDrinksDay(int softDrinksDay) {
        this.softDrinksDay = softDrinksDay;
    }

    public void setRegularMeals(Boolean regularMeals) {
        this.regularMeals = regularMeals;
    }

    public void setEatHomeFood(Boolean eatHomeFood) {
        this.eatHomeFood = eatHomeFood;
    }

    @Override
    public String toString() {
        return "Lifestyle{" + "vegeterian=" + vegeterian + ", smoker=" + smoker + ", averageCigarettes=" + averageCigarettes + ", alcohol=" + alcohol + ", averageDrinks=" + averageDrinks + ", stimulans=" + stimulans + ", coffeTeaDay=" + coffeTeaDay + ", softDrinksDay=" + softDrinksDay + ", regularMeals=" + regularMeals + ", eatHomeFood=" + eatHomeFood + '}';
    } 
}
