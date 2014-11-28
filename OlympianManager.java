import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OlympianManager {

    private Olympian[] olympians = null;
    private String file;
    public OlympianManager(String file) {
        this.file = file;
        //  instance all olympians and set the information using the constructor
        int olympianCount = 0;
        BufferedReader in;

        try {

            in = new BufferedReader(new FileReader(file));
            String input = in.readLine();
            if (input.equals("LGOO")) {

                olympians = new Olympian[getTotalOlympians()];
                while (in.ready()) {
                    input = in.readLine();

                    String s[] = input.split(",");
                    String name;
                    Sex sex;
                    int age;

                    name = s[0];

                    if (s[1].equals("Male")) {
                        sex = Sex.MALE;
                    } else {
                        sex = Sex.FEMALE;
                    }

                    age = Integer.parseInt(s[2]);

                    olympians[olympianCount] = new Olympian(name, sex, age);
                    olympianCount++;
                }
            }

            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TeamManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TeamManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Olympian[] getOlympians() {
        return olympians;
    }

    private int getTotalOlympians() {
        LineNumberReader lnr = null;
        int total = 0;
        try {
            lnr = new LineNumberReader(new FileReader(new File(file)));
            lnr.skip(Long.MAX_VALUE);

            total = lnr.getLineNumber();
            lnr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TeamManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TeamManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                lnr.close();
            } catch (IOException ex) {
                Logger.getLogger(TeamManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return total;
    }

}