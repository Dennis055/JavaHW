import java.awt.RenderingHints.Key;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.security.auth.kerberos.KerberosKey;

public class KeywordList {
			private ArrayList<Keyword>list;
			
			
		public KeywordList() {
				// TODO Auto-generated constructor stub
				this.list = new ArrayList<Keyword>();
			}
			
			public void add(Keyword keyword) {
				this.list.add(keyword);
				System.out.println("Done!");
			}
			
			public void sort() {
				this.list = doQuickSort(this.list);
				System.out.println("Done!");
			}
			
			private ArrayList<Keyword>doQuickSort(ArrayList<Keyword>li){
				if(li.size()<2) return li;
				ArrayList<Keyword>result = new ArrayList<>();
				int pivotIndex = li.size()/2;
				Keyword pivotKeyword = li.get(pivotIndex);
				
				ArrayList<Keyword>lessList = new ArrayList<>();
				ArrayList<Keyword>equalList = new ArrayList<>();
				ArrayList<Keyword>greatList = new ArrayList<>();
				
				for(int i =0 ; i <li.size();i++) {
					Keyword keyword = li.get(i);
					
					if(keyword.count > pivotKeyword.count) {
						greatList.add(keyword);
					}else if (keyword.count<pivotKeyword.count) {
						lessList.add(keyword);
					}else {
						equalList.add(keyword);
					}
				}
				result.addAll(doQuickSort(lessList));
				result.addAll(equalList);
				result.addAll(doQuickSort(greatList));
	
				return result;	
			}
			public void output() {
				StringBuilder sBuffer = new StringBuilder();
				for(int i = 0 ; i<this.list.size() ; i++) {
					Keyword keyword = this.list.get(i);
					if(i>0) {
						sBuffer.append(" ");
					}
					sBuffer.append(keyword.toString());
				}
				System.out.println(sBuffer.toString());
			}
		}
