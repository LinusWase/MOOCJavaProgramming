public class ObjectsAndReferences {
    public static void main(String[] args) {
        Counting counting = new Counting();

        counting.increase();
        counting.increase();

        System.out.println(counting);

        Counting clone  = counting.clone();

        System.out.println(counting);
        System.out.println(clone);

        counting.increase();
        counting.increase();
        counting.increase();
        counting.increase();

        System.out.println(counting);
        System.out.println(clone);

        clone.increase();

        System.out.println(counting);
        System.out.println(clone);

    }
}
