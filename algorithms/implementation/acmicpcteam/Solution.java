package algorithms.implementation.acmicpcteam;

import java.util.Scanner;

/**
 * Created by buyan on 06/01/16.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int people = stdin.nextInt();
        int topics = stdin.nextInt();
        String know[] = new String[people];
        for(int i=0; i < people; i++)
            know[i] = stdin.next();

        int teamNumber = 0;
        int maxTopics = 0;
        for (int i = 0; i < people-1; i++) {
            for (int j = i+1; j < people; j++) {
                int topicCount = 0;
                for (int k = 0; k < topics; k++)
                    if (know[i].charAt(k) == '1' || know[j].charAt(k) == '1')
                        topicCount++;
                if (maxTopics < topicCount) {
                    maxTopics = topicCount;
                    teamNumber = 1;
                }
                else if (maxTopics == topicCount)
                    teamNumber++;
                //System.out.println(know[i] + " " + know[j] + " = " + topicCount);
            }
        }
        System.out.println(maxTopics);
        System.out.println(teamNumber);

        stdin.close();
    }
}
