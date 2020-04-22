import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Profile {
    private String lastName;
    private String firstName;
    private int day;
    private int month;
    private int year;
    private String email;
    private String[] interests;
    private String[] activitiesGroups;
    private ArrayList<Profile> friends;

    public Profile(String lastName, String firstName, int day, int month, int year, String email, String[] interests, String[] activitiesGroups) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.interests = interests;
        this.activitiesGroups = activitiesGroups;

    }

    /**
     * Sets last name as users input
     *
     * @param lastName Last name of profile
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets first name as users input
     *
     * @param firstName First name of profile
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets day of birth as input
     *
     * @param day Day of birth of profile
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Sets month of birth as input
     *
     * @param month Month of birth of profile
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Sets year of birth as input
     *
     * @param year Year of birth of profile
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets email as users input
     *
     * @param email Email linked to profile
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets interests as users input
     *
     * @param interests Interests of the profile
     */
    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    /**
     * Sets activitiesGroups as users input
     *
     * @param activitiesGroups Activities and groups that the profile takes part in
     */
    public void setActivitiesGroups(String[] activitiesGroups) {
        this.activitiesGroups = activitiesGroups;
    }

    /**
     * Gets the last name of profile
     *
     * @return lastName from profile
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the first name of profile
     *
     * @return firstName from profile
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the day of birth of profile
     *
     * @return day of birth from profile
     */
    public int getDay() {
        return day;
    }

    /**
     * Gets the month of birth of profile
     *
     * @return month of birth from profile
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets the year of birth of profile
     *
     * @return year of birth from profile
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the full date of birth of profile
     *
     * @return Date of birth in "dd/mm/yyyy" format
     */
    public String getDateOfBirth() {
        return (day + "/" + month + "/" + year);
    }

    /**
     * Gets the email of the profile
     *
     * @return email linked to profile
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets interests of profile
     *
     * @return Array of profiles interests
     */
    public String[] getInterests() {
        return interests;
    }

    /**
     * Gets activities and groups that the profile takes part in
     *
     * @return Array of activities and groups
     */
    public String[] getActivitiesGroups() {
        return activitiesGroups;
    }

    /**
     * Adds the inputed friend to profiles friend list
     *
     * @param p Profile of the friend to be added
     */
    public void addFriend(Profile p) {
        friends.add(p);
    }

    /**
     * Returns friend from profile at specified index
     *
     * @param i index location to get friend from
     * @return Friends profile at input position
     */
    public Profile getFriend(int i) {
        return friends.get(i);
    }

    /**
     * Gets number of friends associated to this profile
     *
     * @return size of friends list
     */
    public int numOfFriends() {
        return friends.size();
    }

    /**
     * Converts profile to string, for debug only
     *
     * @return Profile info as string
     */
    public String toString() {
        String debug = "First Name: " + firstName + "\n";
        debug += "Last Name: " + lastName + "\n";
        debug += "Day: " + day + "\n";
        debug += "Month: " + month + "\n";
        debug += "Year: " + year + "\n";
        debug += "Email: " + email + "\n";
        debug += "interests: " + Arrays.toString(interests) + "\n";
        debug += "Activities: " + Arrays.toString(activitiesGroups) + "\n";
        return debug;
    }
}
