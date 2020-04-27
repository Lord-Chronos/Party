/**
 * ProfileMain.java
 * Class to test the Profile.java class
 *
 * @author Joshua Murray
 * @version 1.0
 */
public class ProfileMain {
    public static void main(String[] args) {
        Profile Josh = new Profile("Murray", "Joshua", 9, 3, 2001
                , "j.murray567@gmail.com", new String[]{"Stuff"}, new String[]{"Swimming"});
        System.out.println(Josh.toString());
    }
}
