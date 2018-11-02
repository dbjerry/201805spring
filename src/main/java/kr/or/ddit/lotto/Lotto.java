package kr.or.ddit.lotto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lotto {
	
	private int maxNum;		//	로또 숫자 최대 범위
	private int ballNum;	//	공의 개수
	
	/* getter & setter */
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	public int getBallNum() {
		return ballNum;
	}
	public void setBallNum(int ballNum) {
		this.ballNum = ballNum;
	}
	
	public int[] execute() {
		Set<Integer> set = new HashSet<Integer>();
		int[] execute = new int[ballNum];

		while(set.size() < ballNum) {
			set.add((int)(Math.random()*maxNum+1));
		}
		
		Iterator<Integer> itr = set.iterator();
		
		int i = 0;
		while(itr.hasNext()) {
			
			execute[i] = itr.next();
			
			i++;
		}
		
		return execute;
	}
	
}

