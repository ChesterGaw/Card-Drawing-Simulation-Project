

import java.util.ArrayList;

public class Probabilities {
	public void pick2WithoutReplacement() {
		ArrayList<Integer> deck = new ArrayList<Integer>();
		ArrayList<Integer> sumIs = new ArrayList<Integer>();
		int sum;
		int updatedJVal;
		
		for(int i = 1; i <= 52; i++) { 
			deck.add(i);
		}
		
		for(int i = 2; i <= 26; i++)
			sumIs.add(0);
		
		sum = 0;
		updatedJVal = 0;
		for(int i = 0; i < 52; i++) {
			for(int j = updatedJVal; j < 52; j++) {
				sum = 0;
				if(i != j) {
					
					if(deck.get(i) % 13 == 0 && deck.get(j) % 13 == 0)
						sum = 26;
					else if(deck.get(i) % 13 == 0) 
						sum = 13 + (deck.get(j) % 13);
					else if(deck.get(j) % 13 == 0)
						sum = (deck.get(i) % 13) + 13; 
					else
						sum = (deck.get(i) % 13) + (deck.get(j) % 13);
					
					
					switch(sum) {
						case 2: sumIs.set(0, sumIs.get(0) + 1);break;
						case 3: sumIs.set(1, sumIs.get(1) + 1);break;
						case 4: sumIs.set(2, sumIs.get(2) + 1);break;
						case 5: sumIs.set(3, sumIs.get(3) + 1);break;
						case 6: sumIs.set(4, sumIs.get(4) + 1);break;
						case 7: sumIs.set(5, sumIs.get(5) + 1);break;
						case 8: sumIs.set(6, sumIs.get(6) + 1);break;
						case 9: sumIs.set(7, sumIs.get(7) + 1);break;
						case 10: sumIs.set(8, sumIs.get(8) + 1);break;
						case 11: sumIs.set(9, sumIs.get(9) + 1);break;
						case 12: sumIs.set(10, sumIs.get(10) + 1);break;
						case 13: sumIs.set(11, sumIs.get(11) + 1);break;
						case 14: sumIs.set(12, sumIs.get(12) + 1);break;
						case 15: sumIs.set(13, sumIs.get(13) + 1);break;
						case 16: sumIs.set(14, sumIs.get(14) + 1);break;
						case 17: sumIs.set(15, sumIs.get(15) + 1);break;
						case 18: sumIs.set(16, sumIs.get(16) + 1);break;
						case 19: sumIs.set(17, sumIs.get(17) + 1);break;
						case 20: sumIs.set(18, sumIs.get(18) + 1);break;
						case 21: sumIs.set(19, sumIs.get(19) + 1);break;
						case 22: sumIs.set(20, sumIs.get(20) + 1);break;
						case 23: sumIs.set(21, sumIs.get(21) + 1);break;
						case 24: sumIs.set(22, sumIs.get(22) + 1);break;
						case 25: sumIs.set(23, sumIs.get(23) + 1);break;
						case 26: sumIs.set(24, sumIs.get(24) + 1);break;
					}
				}
			}
			updatedJVal++;
		}
		int temp = 0;
		System.out.println("Pick 2 Cards Without Replacement");
		for(int i = 0; i < sumIs.size(); i++) {
			temp = i + 2;
			System.out.println("Number of sum = " + temp + ": " + sumIs.get(i));
			sum += sumIs.get(i);
		}
		
		System.out.println(sum);
	}
}
