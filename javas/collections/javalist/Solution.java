package javas.collections.javalist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		int count = in.nextInt();
		while(count-->0)
			list.add(in.nextInt());
		
		int operationCount = in.nextInt();
		while(operationCount-->0){
			String command = in.next();
			if (command.equals("Insert")){
				int index = in.nextInt();
				int number = in.nextInt();
				list.add(index, number);
			}
			else if (command.equals("Delete")){
				int index = in.nextInt();
				list.remove(index);
			}
		}
		
		list.stream().forEach(x -> System.out.print(x + " "));
		
		in.close();
	}
}
