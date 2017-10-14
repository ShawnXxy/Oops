package car;

public class BuilderA implements IBuilder {
    
    private Production production = new Production();

    @Override
    public void buildPart1() {
        // TODO Auto-generated method stub
        System.out.println("构造兰博基尼的第一部分。");
        production.setPart1("This is part1 of Lamborghini");
    }

    @Override
    public void buildPart2() {
        // TODO Auto-generated method stub
        System.out.println("构造兰博基尼的第二部分。");
        production.setPart2("This is part2 of Lamborghini");
    }

    @Override
    public Production build() {
        // TODO Auto-generated method stub
        System.out.println("咔擦！兰博基尼已造好！");
        return production;
    }

}
