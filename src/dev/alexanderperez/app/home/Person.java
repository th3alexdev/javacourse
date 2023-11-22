package dev.alexanderperez.app.home;

public class Person {
    private String nickname;

    public Person(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Person -> {" + '\n' +
                "\t nickname='" + nickname + '\'' + '\n' +
                "}";
    }

}
