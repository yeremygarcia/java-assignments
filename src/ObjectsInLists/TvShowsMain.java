package ObjectsInLists;
import java.util.ArrayList;
import java.util.Scanner;
    public class TvShowsMain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<TvShows> enterTvShows = new ArrayList<>();

            while(true) {
                System.out.println("Name of the show: ");
                String showName = scanner.nextLine();

                if(showName.isEmpty()) {
                    break;
                }

                System.out.println("How many episodes? ");

                int numberOfEpisodes = Integer.valueOf(scanner.nextLine());

                System.out.println("What is the genre? ");
                String genre = scanner.nextLine();

                enterTvShows.add(new TvShows(showName, numberOfEpisodes, genre));

            }

            for(TvShows omg : enterTvShows) {
                System.out.println(omg);
            }

        }
    }
