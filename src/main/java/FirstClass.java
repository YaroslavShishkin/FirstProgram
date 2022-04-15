import FirstPackage.SecondClass;

public class FirstClass {

    static SecondClass secondClass;

    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        secondClass = new SecondClass();
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                secondClass.setFirstNumber(i);
                secondClass.setSecondNumber(j);
                System.out.println(secondClass.numberMultiplication());
            }
            System.out.println();
        }
    }
}
