package com.staticdemo;

import java.util.Scanner;

class Ticket

{
	private int ticketid;
	private int price;
	static int availableTickets;

	public int getTicketid() {
		return ticketid;

	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;

	}

	public int getPrice() {

		return price;

	}

	public void setPrice(int price) {
		this.price = price;

	}

	public static int getAvailableTickets() {
		return availableTickets;

	}

	public static void setAvailableTickets(int availableTicket) {

		if (availableTickets > 0) {
			Ticket.availableTickets = availableTickets;

		}
	}

	public int calculateTicket(int nooftickets) {
		if (nooftickets < availableTickets) {

			availableTickets -= nooftickets;
			return price * nooftickets;
		}

		else {

			return -1;

		}

	}

}

public class TicketCalculation {

	public static void main(String[] args) {
		Ticket t = new Ticket();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Bookings ");
		int booking = sc.nextInt();

		System.out.println("Enter the available tickets");
		int availableTicket = sc.nextInt();

		t.setAvailableTickets(availableTicket);

		System.out.println("Enter the ticketId");
		int ticketid = sc.nextInt();

		t.setTicketid(ticketid);
		System.out.println("Enter the price");
		int price = sc.nextInt();

		System.out.println("Enter the no of tickets");
		int nooftickets = sc.nextInt();
		
		System.out.println("Available Tickets "+t.getAvailableTickets());
		System.out.println("Totalamount "+t.calculateTicket(nooftickets));
		System.out.println("availableTickets after Booking "+t.availableTickets);
		
		

	}

	
}
