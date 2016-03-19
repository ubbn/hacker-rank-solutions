package javas.collections.javacomparator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * Created by bbn on 3/19/16.
 */
class Player
{
    String name;
    int score;
}

class Checker {
    Comparator<Player> desc = new Comparator<Player>() {
        @Override
        public int compare(Player playerA, Player playerB) {
            if (playerA.score == playerB.score)
                return playerB.name.compareTo(playerA.name);
            else
                return playerB.score - playerA.score;
        }
    };
}

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine().trim());
        String s;
        StringTokenizer st;
        Player Player[]=new Player[N];
        Checker check=new Checker();
        for(int i=0;i<N;i++)
        {
            s=br.readLine().trim();
            st=new StringTokenizer(s);
            Player[i]=new Player();
            Player[i].name=st.nextToken();
            Player[i].score=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Player,check.desc);
        for(int i=0;i<Player.length;i++)
        {
            System.out.printf("%s %s\n",Player[i].name,Player[i].score);
        }

        br.close();
    }
}


