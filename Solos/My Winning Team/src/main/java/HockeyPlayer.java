public class HockeyPlayer extends Person {

    private String position;

    private int salary;

    public HockeyPlayer (String name, int age, String position, int salary) {
        super(name, age);

        this.position = position;
        this.salary = salary;


    }

    public void setPosition (String position) {

        this.position = position;

    }

    public void setSalary (int salary) {

        this.salary = salary;

    }

    public String getPosition () {

        return position;

    }

    public int getSalary () {

        return salary;

    }

    @Override

    public String toString () {

        return "Player: " + super.getName() + "\n" + "Position: " + position + "\n" + "Salary: " + salary;

    }

}
