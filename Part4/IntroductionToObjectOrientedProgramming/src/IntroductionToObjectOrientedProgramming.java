public class IntroductionToObjectOrientedProgramming {
    public static void main(String[] args) {
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        System.out.println(matti.getName() + ", body mass index is " + matti.bmi());
        System.out.println(juhana.getName() + ", body mass index is " + juhana.bmi());
    }
}
