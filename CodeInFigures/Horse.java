public class Horse {
    private String name, colour;
    private int birthYear;

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String horseColour) {
        colour = horseColour;
    }

    public void setName(String horseName) {
        name = horseName;
    }

    public void setBirthYear(int horseBirthYear) {
        birthYear = horseBirthYear;
    }
}
