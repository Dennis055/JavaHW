import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

public class Problem1 {
		/*1.
		 * 考點：Tree
		 * PostOrder：先由左至右遍歷子結點，再visit
		 * 因此會由最下面開始visit。
		 * 思考方式：從左子樹開始：從最底層由左至右移動，接著做右子樹：從最底層由左至右移動
		 * 順序：30 -> 16 -> 8 ->25 ->50
		 * InOrder ：優先遍歷左子結點，visit，接著遍歷右子樹
		 * 因此會先拜訪最下面的左子結點，再回到上一個，然後才是右邊的最上面
		 * ->左下->左上 ->父 ->右上 -> 右下 :呈 ^ 字型，
		 * 思考方式：先走到最左下，接著只要看到^形狀，都走一次
		 * 順序：8 -> 16 ->25 -> 30 -> 50
		 * PreOrder:先visit , 再由左至右遍歷子節點
		 * 因此會由最上面開始visit
		 *  思考方式：照著圖重複「左下右上」即可。
		 * 順序：8 -> 25 -> 16 -> 50 -> 30
		 */
	    	
}
