public class Box <T,V>{
    private T name ;
    private V age;
    private T  color;

    public Box(T name, V age, T color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Box() {
    }

    public static <T> T genericMethod(Box box){
        T box1 =(T) box;
        return box1;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    public T getColor() {
        return color;
    }

    public void setColor(T color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                ", age=" + age +
                ", color=" + color +
                '}';
    }
}
