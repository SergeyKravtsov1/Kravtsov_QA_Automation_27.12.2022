package homework9;

public class Main {
    public static void main(String[] args) {

        int [] team1 = new int [25];

        for (int i = 0; i < team1.length; i ++) {
            team1[i] = (int) (Math.random() * 45);

            }
                for (int i = 0; i < team1.length; i++) {
                    if (team1.length - 1 == i) {
                        System.out.print(team1[i]);
                    } else {
                        System.out.print(team1[i] + ", ");
                    }

                }

        }

}
