package algorithms.implementation.cavitymap;

import java.util.Scanner;

/**
 * Created by buyan on 03/01/16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        byte mapSize = stdin.nextByte();
        String map[] = new String[mapSize];

        for (int i = 0; i < mapSize; i++)
            map[i] = stdin.next();

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++){
                if ((i != 0 && i != mapSize -1 && j != 0 && j != mapSize-1)
                    && (map[i].charAt(j) > map[i-1].charAt(j) && map[i].charAt(j) > map[i+1].charAt(j)
                    && map[i].charAt(j) > map[i].charAt(j-1) && map[i].charAt(j) > map[i].charAt(j+1)))
                    System.out.print("X");
                else
                    System.out.print(map[i].charAt(j));
            }
            System.out.println();
        }
        stdin.close();
    }
}
