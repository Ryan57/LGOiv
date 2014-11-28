import java.util.Random;

/**
 * Created by Ryan on 10/30/2014.
 */

public class TeamManager {

    private Team[] teams = null;
    int total;

    private Team createTeam(Olympian[] olympians, int wins, int losses) {
        boolean shouldReturnMale = true;
        Olympian olympian1 = null, olympian2 = null;

        while (olympian1 == null || olympian2 == null) {
            for (int i = 0; i < total; i++) {
                if (shouldReturnMale) {
                    if (olympians[i].getSex() == Sex.MALE) {

                        shouldReturnMale = !shouldReturnMale;
                        if (olympian1 == null) {
                            olympian1 = olympians[i];
                            removeElt(olympians, i);
                            total--;
                            i = 0;
                        } else if (olympian2 == null) {
                            olympian2 = olympians[i];
                            removeElt(olympians, i);
                            total--;
                            i = 0;
                        }

                    }
                } else {
                    if (olympians[i].getSex() == Sex.FEMALE) {
                        shouldReturnMale = !shouldReturnMale;
                        if (olympian1 == null) {
                            olympian1 = olympians[i];
                            removeElt(olympians, i);
                            total--;
                            i = 0;
                        } else if (olympian2 == null) {
                            olympian2 = olympians[i];
                            removeElt(olympians, i);
                            total--;
                            i = 0;
                        }
                    }
                }
            }
            shouldReturnMale = !shouldReturnMale;
        }

        return new Team(olympian1, olympian2, wins, losses);
    }

    private void removeElt(Olympian[] arr, int remIndex) {
        for (int i = remIndex; i < arr.length - 1; i++) {
            arr[i] = arr[ i + 1];
        }
    }

    private void shuffleArray(Olympian[] array) {
        int index;
        Olympian temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public TeamManager(Olympian[] olympians) {
        int teamLength = olympians.length / 2;
        total = olympians.length;
        teams = new Team[teamLength];

        shuffleArray(olympians);

        for (int i = 0; i < teamLength; i++) {
            teams[i] = createTeam(olympians, new Random().nextInt(20), new Random().nextInt(20));
        }
    }

    public Team[] getTeams() {
        return teams;
    }

}