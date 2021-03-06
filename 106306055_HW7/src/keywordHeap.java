import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class keywordHeap {
	private PriorityQueue<Keyword> heap;
	
	
	public keywordHeap() {
		KeywordComparator comp = new KeywordComparator();
		this.heap = new PriorityQueue<>(10, new KeywordComparator());
	}
	
	public void add(Keyword k) {
		heap.offer(k);
		System.out.println("Done");
	}
	public void peek() {
		if(heap.peek()==null) {
			System.out.println("InvalidOperation");
			return;
		}
		Keyword k = heap.peek();
		System.out.println(k.toString());
	}
	
	public void removeMin() {
		Keyword k = heap.poll();
		System.out.println(k.toString());
	}
	
	public void output() {
		//TODO: print and remove all
		// Use poll() ，目前改成
		ArrayList<Keyword>result = new ArrayList<>();
		int times = heap.size();
		for(int i = 0 ; i<times;i++) {
			Keyword k = heap.poll();
			result.add(k);
			System.out.print(k);
		}
	}
	public void outPut() {
		ArrayList<Keyword>result = new ArrayList<>();
		int times = heap.size();
		for(int i = 0 ; i<times ;i++) {
			Keyword k = heap.poll();
			result.add(k);
		}
		for(int i =times - 1;i >=0 ;i--) {
			Keyword keyword = result.get(i);
			System.out.println(keyword);
		}
	}
}
