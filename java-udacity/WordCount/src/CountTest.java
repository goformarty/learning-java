public class CountTest {
    static int count;
    int localCount;

    CountTest() {
        count++;
        localCount++;
    }

    public static void main(String[] args) {
        CountTest person1 = new CountTest();

        System.out.println("first object count " + person1.count);
        System.out.println("first object local count " + person1.localCount);
        System.out.println("class count " + CountTest.count);

        CountTest person2 = new CountTest();
        System.out.println("second object count " + person2.count);
        System.out.println("second object local count " + person2.localCount);
        System.out.println("class count " + CountTest.count);

    }
}
