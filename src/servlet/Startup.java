package servlet;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import dao.ProductDaoImpl;
import util.SaxParserDataStore;

@WebServlet("/Startup")

/*  
startup servlet Intializes HashMap in SaxParserDataStore
*/

public class Startup extends HttpServlet
{

	public void init() throws ServletException
   {
		System.out.println("System is booting");
		SaxParserDataStore.addHashmap();
		new ProductDaoImpl().addAllProductsFromXML(new ArrayList<>(SaxParserDataStore.products.values()));
   }
}