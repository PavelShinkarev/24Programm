package homework6;

public class Animal {
   private int age;
   private String nick;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNick() {
        return nick;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }

    public Animal(int age, String nick){
        this.age = age;
        this.nick = nick;
    }
}
