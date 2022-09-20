package FunctionalProgram.com.bridgelab;

public class SumOfThreeInteger {
    public static void main(String[] args) {
        int givenArray[] = {1, 2, 3, -3, -1, 5, };

        for (int i = 0; i < givenArray.length; i++) {
            for (int j = i + 1; j < givenArray.length; j++) {
                for (int k = j + 1; k < givenArray.length; k++) {
                    if (givenArray[i] + givenArray[j] + givenArray[k] == 0) {
                        System.out.println("Numbers found : " + givenArray[i] + "," + givenArray[j] + " and " + givenArray[k]);
                    }
                }
            }
        }
    }
}
