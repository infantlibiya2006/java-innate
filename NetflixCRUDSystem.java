import java.util.ArrayList;
import java.util.Scanner;

public class NetflixCRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<>();

        while (true) {
            System.out.println("\n===== NETFLIX MOVIE MENU =====");
            System.out.println("1. Add Movie (Create)");
            System.out.println("2. View Movies (Read)");
            System.out.println("3. Update Movie");
            System.out.println("4. Delete Movie");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                // CREATE
                case 1:
                    System.out.print("Enter movie name to add: ");
                    String movie = sc.nextLine();
                    movies.add(movie);
                    System.out.println("Movie added successfully!");
                    break;

                // READ
                case 2:
                    System.out.println("Netflix Movie List:");
                    if (movies.isEmpty()) {
                        System.out.println("No movies available");
                    } else {
                        for (int i = 0; i < movies.size(); i++) {
                            System.out.println(i + " -> " + movies.get(i));
                        }
                    }
                    break;

                // UPDATE
                case 3:
                    System.out.print("Enter index to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();

                    if (updateIndex >= 0 && updateIndex < movies.size()) {
                        System.out.print("Enter new movie name: ");
                        String newMovie = sc.nextLine();
                        movies.set(updateIndex, newMovie);
                        System.out.println("Movie updated successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                // DELETE
                case 4:
                    System.out.print("Enter index to delete: ");
                    int deleteIndex = sc.nextInt();

                    if (deleteIndex >= 0 && deleteIndex < movies.size()) {
                        movies.remove(deleteIndex);
                        System.out.println("Movie deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                // EXIT
                case 5:
                    System.out.println("Exiting Netflix system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
