package peaksoft;

public class Horse implements Animal {
    private String breed;
    private String color;
    private double weight;

    @Override
    public void animalPlus() {
        System.out.println("Horse");
    }

    @Override
    public void animalMinus() {
        System.out.println("minus");

    }
}
