package model;




import javax.persistence.*;




@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int yearModel;
    private String make;
    private int speed;
    @ManyToOne(cascade= CascadeType.PERSIST)
    private Owner owner;

    public Car(int yearModel, String make, int speed, Owner owner) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
        this.owner = owner;
    }

    public Car() {
    }



    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", yearModel=" + yearModel +
                ", make='" + make + '\'' +
                ", speed=" + speed +
                ", owner=" + owner +
                '}';
    }
}
