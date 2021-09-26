public class Main {
    public static void main(String[] args) {
        Movie Movie1 = new Movie("Titanic", 2000, 7.5);
        Movie Movie2 = new Movie("The Earth", 2021);
        Movie Movie3 = new Movie();
        Movie1.setName("Shrek");
        Movie1.setYear(2001);
        Movie1.setRate(8.1);
        System.out.printf("Movie1: name: %s,  year: %d, rate: %.1f\n\n", Movie1.getName(), Movie1.getYear(), Movie1.getRate());
        Movie2.setName("After");
        Movie2.setYear(2019);
        System.out.printf("Movie2:  name: %s,  year: %d\n\n", Movie2.getName(), Movie2.getYear());
        Movie3.setName("Zero chill");
        System.out.printf("Movie3: name: %s\n\n", Movie3.getName());

        movieInfo("Titanic", 2000);
        movieInfo("The Earth", 2000, 326);
        writeMovieName("The Help");
        writeMovieBudget("The Help", 60000);
    };

    public static void writeMovieName(String name) {
        System.out.printf("Movie - %s\n", name);
    }

    public static void writeMovieBudget(String name, int budget) {
        writeMovieName(name);
        System.out.printf("Budget - %d$\n", budget);
    }

    public static void movieInfo(String name, int year) {
        String resultInfo = String.format("Movie: %s, year: %d\n", name, year);
        System.out.print(resultInfo);
    }

    public static void movieInfo(String name, int year, int amountOfActors) {
        String resultInfo = String.format("Movie: %s, year: %d, amount Of Actors: %d\n", name, year, amountOfActors);
        System.out.print(resultInfo);
    }
}
