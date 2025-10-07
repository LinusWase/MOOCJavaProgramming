public class IntroductionToObjectOrientedProgramming {
    public static void main(String[] args) {
        Person2 matti = new Person2("Matti");
        Person2 juhana = new Person2("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
    }
}
