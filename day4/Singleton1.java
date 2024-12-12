package com.day4;
class BookTickets
{
	
	static private BookTickets tickets = null;
	static int ticket;
	BookTickets()
	{
		ticket = 50;
	}
	public static BookTickets getBookTickets()
	{
		if (tickets == null)
		{
			tickets = new BookTickets();
		}else
		{
			tickets = null;
		}
		return tickets;	
	}
	
	public void display()
	{
		System.out.println("Available Tickets :"+" "+ticket);
	}
	
}

public class Singleton1 {

	public static void main(String[] args) {
		BookTickets tickets = BookTickets.getBookTickets();
		tickets.display();
	}

}
