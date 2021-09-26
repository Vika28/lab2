public class Movie {
    private String name;
    private int year;
    private double rate;

    Movie(String name, int year) {
        this.name = name;
        this.year = year;
        System.out.printf("Movie %s was released in %d\n\n", name, year);

    }
    Movie(String name, int year, double rate) {
        this(name, year);
        this.rate = rate;
        System.out.printf("Movie %s was released in %d with rate: %s\n\n", name, year, rate);
    }

    Movie() {
        this.name = "No name";
        System.out.printf("Movie %s\n\n", name);
    }



    void setName(String movieName) {
        name = movieName;
    }
    void setYear (int movieYear) {
        year = movieYear;
    }
    void setRate(double movieRate) {
        rate = movieRate;
    }
    String getName() {
        return name;
    }
    int getYear() {
        return year;
    }
    double getRate() {
        return rate;
    }
}
