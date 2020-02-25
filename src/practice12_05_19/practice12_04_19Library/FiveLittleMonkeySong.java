package practice12_05_19.practice12_04_19Library;

public class FiveLittleMonkeySong {
    public static void main(String[] args) {

        int countOfMonkey=5;

        while(countOfMonkey>0) {
            //
            if (countOfMonkey == 1) {  // only 1 boy monkey
                System.out.println(countOfMonkey + " little monkey jumping on the bed"
                        + "\nOne fell off and bumped his head"
                        + "\nMama called the doctor"
                        + "\nAnd the doctor said "
                        + "\nNo more monkeys jumping on the bed");
                System.out.println();

            } else if (countOfMonkey % 2 == 1) { // monkey is boy
                System.out.println(countOfMonkey + " little monkeys jumping on the bed"
                        + "\nOne fell off and bumped his head"
                        + "\nMama called the doctor"
                        + "\nAnd the doctor said "
                        + "\nNo more monkeys jumping on the bed");
                System.out.println();
            } else if (countOfMonkey % 2 == 0) { // monkey is girl
                System.out.println(countOfMonkey + " little monkeys jumping on the bed"
                        + "\nOne fell off and bumped her head"
                        + "\nMama called the doctor"
                        + "\nAnd the doctor said "
                        + "\nNo more monkeys jumping on the bed");
                System.out.println();
            }
            countOfMonkey--;
        }
        }
    }

