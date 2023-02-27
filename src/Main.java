import java.util.Arrays;

public class Main {
    public static void changeValue (int value) {
        value = 22;
        System.out.println("value = " + value);
    }
    public static void changeValue2 (Integer value2) {
        value2 = 22;
        System.out.println("value2 = " + value2);
    }
    public static void changeValue3 (Integer [] value3) {
        value3 = new Integer[]{1, 2};
        System.out.println(Arrays.toString(value3));
    }
    public static void changeValue4 (Integer [] value4) {
        value4 [0] = 99;
        System.out.println(Arrays.toString(value4));
    }
    public static void main (String[] args) {
        int value = 33;
        System.out.println("value = " + value);
        changeValue(value);
        System.out.println("value = " + value);

        Integer value2 = 33;
        System.out.println("value2 = " + value2);
        changeValue2 (value2);
        System.out.println("value2 = " + value2);

        Integer [] value3 = {3,4};
        System.out.println(Arrays.toString(value3));
        changeValue3 (value3);
        System.out.println(Arrays.toString(value3));

        Integer [] value4 = {3,4};
        System.out.println(Arrays.toString(value4));
        changeValue4 (value4);
        System.out.println(Arrays.toString(value4));

        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println(person.toString());
        //changePerson (person);
        //System.out.println(person.toString());
        changePerson2 (person);
        System.out.println(person.toString());

    }
    public static void changePerson2 (Person person) {
        Person person1 = new Person("Ilya","Lagutenko");
    }
    public static void changePerson (Person person) {
        person.setName("Ilya");
        person.setSurname("Lagutenko");
    }
}

