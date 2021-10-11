package peaksoft;

public class Monkey implements Animal {

    private String breed;
    private String color;
    private double weight;

    @Override
    public void animalPlus() {
        System.out.println("Monkey");
    }

    @Override
    public void animalMinus() {
        System.out.println("minus");

    }
}
