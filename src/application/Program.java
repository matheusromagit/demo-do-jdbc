package application;

import java.util.Date;

import model.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1,"Books");
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), null, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
		
	}

}
