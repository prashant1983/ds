package ds.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author prashant
 *
 * @param <AnyType>
 */
public class StackImpl<AnyType> implements StackIF<AnyType> {

	private List<AnyType> arrayList = new ArrayList<AnyType>();
	private int size;

	@Override
	public void push(AnyType data) {
		arrayList.add(data);
		size++;

	}

	@Override
	public AnyType pop() {
		// get element and delete from list
		AnyType anyType2 = null;
		for (int i = arrayList.size() - 1; i >= 0;) {
			anyType2 = arrayList.get(i);
			arrayList.remove(i);
			break;

		}
		size--;
		return anyType2;
	}

	@Override
	public int size() {
		return size;
	}

}
