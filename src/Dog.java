public class Dog {
    private String Name ;
    private String color;
    private int age;
    private int weight;
    private int length;
    public Dog(String name,String color,int age,int weight,int length){
        this.Name=name;
        this.age=age;
        this.color=color;
        this.weight =weight;
        this.length=length;

    }

    public void setName(String name) {
        Name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Dog() {

    }

    public String getName() {
        return Name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }
}
