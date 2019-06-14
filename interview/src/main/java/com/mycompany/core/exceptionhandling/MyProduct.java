package com.mycompany.core.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyProduct {

	private String productName;
	private String productDescription;

	MyProduct(String productName, String prodDesc) {

		this.productName = productName;
		this.productDescription = prodDesc;
	}

	public void checkProduct() throws ProductException {

		if (!getProductName().equals("P")) {

			throw new ProductException("Invalid Product");

		}

	}

	public static void main(String[] args) {

		MyProduct myProduct = new MyProduct("M", "Mobile Products");

		try {

			myProduct.checkProduct();

		} catch (ProductException productException) {
			System.out.println("Exception catched here");
			productException.printStackTrace();

		} finally {

			System.out.println("Finally executed ");
		}
		//in case of try with resource option no need to close the resource in finally block.

		try (FileInputStream inputStream = new FileInputStream(new File("/home/prashant/Notes.txt"));) {
			System.out.println("read file");
			inputStream.read();

		} catch (FileNotFoundException exception) {

			exception.printStackTrace();
		} catch (IOException exception) {

			exception.printStackTrace();
		}

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
