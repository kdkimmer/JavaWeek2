

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kim on 6/26/2015.
 * Use the names.txt file, a 46K text file containing over five-thousand first names found in the resources directory.
 *Part 1:Begin by sorting the list into alphabetical order. Save this new file as p4aNames.txt in the answers directory.
 *Part 2: Using p4aNames.txt, take the alphabetical value for each name, and multiply this value by its alphabetical
 * position in the list to obtain a name score. For example, when the list is sorted into alphabetical
 * order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would
 * obtain a score of 938 × 53 = 49714. Save the list of all name scores as p4bNames.txt.
 *Part 3:What is the total of all the name scores in the file?
 */

public class NameScore {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            new NameScore().sortingList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortingList() throws IOException {
        FileReader fb = new FileReader("c://Users/kim/Desktop/names.txt");
        BufferedReader bf = new BufferedReader(fb);
        String input = bf.readLine();
        String newInput = "";
        //this takes out the first quote in the file otherwise the first name would not be sorted properly
        input = input.substring(input.indexOf("\""));
        //this is taking out all the quotes inbetween the names, looking at it a character at time
        for (int a = 0; a < input.length(); a++) {
            if (input.charAt(a) != '"') {
                newInput += input.charAt(a);
            }
        }
            String[] sortName = newInput.split(",");
            Arrays.sort(sortName);

            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("c://Users/kim/Desktop/p4aNames.txt")));

            for (int i = 0; i < sortName.length; i++) {

                pw.println(sortName[i]);
                System.out.println(sortName[i]);// print to console just to see output
            }
            bf.close();
            fb.close();
            pw.close();


            int totalScore = 0;
            int score = 0;
            PrintWriter scorewriter = new PrintWriter(new BufferedWriter(new FileWriter("c://Users/kim/Desktop/p4bNames.txt")));

        for (int i = 0; i < sortName.length; i++) {
                String name  = sortName[i];
                for (int j = 0; j < name.length(); j++) {
                    score += (int)name.charAt(j) - 64;

                }
                score *=(i+1);
                totalScore += score;


                scorewriter.println("Name: " + name + " Score: ");
                scorewriter.println(score);

                System.out.print("Name: " + name + " Score: ");
                System.out.println(score);
                score = 0;
            }
            System.out.println("The total Score is... " + totalScore);
            bf.close();
            fb.close();
            scorewriter.close();
        }

    }

