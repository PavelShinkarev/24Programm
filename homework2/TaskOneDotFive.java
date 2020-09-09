package homework2;

public class TaskOneDotFive {
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++ ){
            for(int j = 2; j < 6; j++) {
                System.out.printf("%d * %d = %d\t\t", j, i, j * i );
                if(j == 5 ) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        for(int i = 1; i < 11; i++ ){
            for(int j = 6; j < 10; j++) {
                System.out.printf("%d * %d = %d\t\t", j, i, j * i );
                if(j == 9) {
                    System.out.println();
                }
            }
        }
    }
}

