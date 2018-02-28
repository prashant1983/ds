package ds.stack;

/**
 * @author prashant
 *
 */
public interface StackIF<AnyType> {

	/**
	 * 
	 * @param data
	 */
	void push(AnyType data);

	/**
	 * 
	 * @return
	 */
	AnyType pop();

	/**
	 * @return
	 */
	int size();

}
