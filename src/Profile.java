import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Profile {
    String lastName;
    String firstName;
    int day;
    int month;
    int year;
    String email;
    String[] interests;
    String[] activitiesGroups;
    ArrayList<Profile> friends;

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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public void setActivitiesGroups(String[] activitiesGroups) {
        this.activitiesGroups = activitiesGroups;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDateOfBirth() {
        return (day + "/" + month + "/" + year);
    }

    public String getEmail() {
        return email;
    }

    public String[] getInterests() {
        return interests;
    }

    public String[] getActivitiesGroups() {
        return activitiesGroups;
    }


    public void addFriend(Profile p){
        friends.add(p);
    }

    public Profile getFriend(int i){
        return friends.get(i);
    }

    public int numOfFriends(){
        return friends.size();
    }

    public String toString(){
        String debug = "First Name: " + firstName + "\n";
        debug += "Last Name: " + lastName + "\n";
        debug += "Day: " + day + "\n";
        debug += "Month: " + month + "\n";
        debug += "Year: " + year + "\n";
        debug += "Email: " + email + "\n";
        debug += "interests: " + Arrays.toString(interests) + "\n";
        debug += "Activities: " + Arrays.toString(activitiesGroups) + "\n" ;
        return debug;
    }
}
