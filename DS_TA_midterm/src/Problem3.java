
public class Problem3 {
		/*考點：linklist
		 * 先觀察linked list結構，發現這是一個single list
		 * 依照single list特性，property:
		 *  1 point（記憶下一個節點）
		 *  1 value(內容)
		 *  所以我們要根據上面這兩個特性來思考
		 */
	class Node{
		int value;
		Node nextPoint;
	}
	/* Insert
	 * 這就是b跟c中間有個新的節點，所以
	 * 1. 新建 一個 node , value不重要 , point指向 c
	 * 2. b的nextPoint設為這一個新的節點 
	 */
	
	
	/* Remove a 
	 * 1.只要把Node a 的 nextPoint設為null即可
	 */
}
