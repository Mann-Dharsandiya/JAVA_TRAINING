package Day13.QueueInterface;

public class Patient implements Comparable<Patient> {
    private int Id;
    private String Name;
    private int age;
    private String disease;

    public Patient(int id, String name, int age, String disease) {
        Id = id;
        Name = name;
        this.age = age;
        this.disease = disease;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    @Override
    public String toString() {
        return "Patient [Id=" + Id + ", Name=" + Name + ", age=" + age + ", disease=" + disease + "]";
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public int compareTo(Patient o) {
        return this.getId() - o.getId();
    }

}
