public class Fish {
    private String Name;
    private String color;
    private int age;
    private int weight;
    private String live;

   public Fish(String name,String color,int age,int weight,String live){
       this.Name=name;
       this.age=age;
       this.color=color;
       this.weight =weight;
       this.live=live;

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

    public void setLive(String live) {
        this.live = live;
    }
    public Fish() {

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

    public String getLive() {
        return live;
    }
}
