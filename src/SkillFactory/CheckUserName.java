package SkillFactory;

public class CheckUserName {
    public static void checkUserName(String a, String b) {
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя. Ваше имя имеет длину " + b.length() + " символов. А ваше имя без пробелов" +
                    " имеет длину " + (b.replaceAll(" ", "")).length() + " символов");
        }
    }

    public static void main(String[] args) {
        String a = "Вован Иванов";
        String b = "иван петров";
        checkUserName(a, b);
    }
}
