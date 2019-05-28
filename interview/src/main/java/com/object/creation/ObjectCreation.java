package com.object.creation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectCreation implements Cloneable, Serializable {

	private String objectName;

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	@Override
	public String toString() {
		return "ObjectCreation [objectName=" + objectName + "]";
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			ClassNotFoundException, CloneNotSupportedException, IOException {

		// using Class.forName().newInstance()s;
		ObjectCreation newInstance = (ObjectCreation) Class.forName("com.object.creation.ObjectCreation").newInstance();
		System.out.println(newInstance);
		ObjectCreation creation = new ObjectCreation();

		// by cloning
		ObjectCreation clone = (ObjectCreation) newInstance.clone();
		System.out.println(clone);
		clone.setObjectName("ObjectCreation");

		// serialization/Deserialization
		FileOutputStream fileInputStream = new FileOutputStream(new File("/home/prashant/Notes/Data.txt"));
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileInputStream);
		objectOutputStream.writeObject(clone);

		FileInputStream stream = new FileInputStream(new File("/home/prashant/Notes/Data.txt"));
		ObjectInputStream inputtream = new ObjectInputStream(stream);
		ObjectCreation readObject = (ObjectCreation) inputtream.readObject();
		System.out.println(readObject);

	}

}
