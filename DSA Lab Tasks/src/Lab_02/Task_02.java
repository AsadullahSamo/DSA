package Lab_02;
import java.util.Arrays;
import java.util.Scanner;

class FireAir{

    Scanner sc = new Scanner(System.in);
    public void displayChoices(){
        System.out.println("0. Exit");
        System.out.println("1. Display songs");
        System.out.println("2. Search songs");
        System.out.println("3. Add songs");
        System.out.println("4. Update songs");
        System.out.println("5. Delete songs\n");
    }

    public void displaySongs(String [] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]\n");
    }      // end of displaySongs() method

    public void searchSong(String [] arr){
        System.out.print("Enter song to search: ");
        String song = sc.nextLine();
        for(int i=0; i<arr.length; i++){
            if(arr[i].equalsIgnoreCase(song)){
                System.out.println(song+" found at index " + i);
                return;
            }
        }
        System.out.println(song+" is not present in Playlist");
    }      // end of searchSong() method

    public void updateSong(String [] arr){
        System.out.print("Enter index to update: ");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new song: ");
        String newSong = sc.nextLine();
        arr[index] = newSong;
    }      // end of updateContact() method

    public String[] addSong(String [] arr){
        System.out.print("Add new song to playlist: ");
        String song = sc.nextLine();
        String [] newArray = new String[arr.length+1];
        for (int i=0; i< newArray.length-1; i++){
            newArray[i] = arr[i];
        }
        newArray[newArray.length-1] = song;
        return newArray;
    }        // end of addSong() method

    public String[] deleteSong(String [] arr){
        System.out.print("Enter index of song to delete: ");
        int index = sc.nextInt();
        int size = arr.length;
        String [] newArray = new String[arr.length-1];
        if(size-1==index){
            for (int i=0; i< newArray.length; i++){
                newArray[i] = arr[i];
            }
        } else {
            for (int i = 0, k = 0; i < newArray.length; i++) {
                if (i == index) {
                    continue;
                }
                newArray[k++] = arr[i];
            }     // end of for loop
            newArray[newArray.length - 1] = arr[arr.length - 1];
        }
        return newArray;
    }      // end of deleteSong()

}     // end of class FireAir

public class Task_02 {

    public static void main(String[] args) {

        String [] songs = {"Applause", "Tennis Court", "Days Go by", "Neon Indian", "With Every Heartbeat"};
        FireAir fa = new FireAir();

        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            fa.displayChoices();
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 0-> System.exit(0);
                case 1 -> fa.displaySongs(songs);
                case 2 -> fa.searchSong(songs);
                case 3 -> songs = fa.addSong(songs);
                case 4 -> fa.updateSong(songs);
                case 5 -> songs = fa.deleteSong(songs);
                default -> System.out.println("Invalid, please select correct option");
            }
        } while (choice!=0);


//        // Add Song
//        songs = fa.addSong(songs, "Vizima Trade Quarters");
//        songs = fa.addSong(songs, "Arcade");
//        songs = fa.addSong(songs, "Outskirts of Vizima");
//        fa.displaySongs(songs);
//
//        // Delete Song
//        songs = fa.deleteSong(songs, 7);
//        songs = fa.deleteSong(songs, 0);
//        fa.displaySongs(songs);
//
//        // Search song
//        fa.searchSong(songs, "Me and u");
//        fa.searchSong(songs, "Days Go by");
//
//        // Update Song
//        fa.updateSong(songs, 2, "The Game");
//        fa.displaySongs(songs);

    }
}
