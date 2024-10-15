import java.util.*;
class Seasonal_ticket{
    int total_tickets;
    void calculate_concession(int total_tickets,int ticket_price ){

    }

}
class Group_concession extends Seasonal_ticket{
    int min_no_of_tickets,concession_percent;int
        total_tickets=super.total_tickets;
    Group_concession(int ntickets,int conc_per){
        min_no_of_tickets=ntickets;
        concession_percent=conc_per;
        }
    {

    if(min_no_of_tickets>total_tickets){
        calculate_concession(total_tickets, concession_percent);
    }
    }
}
class Child_ticket_Concession extends Seasonal_ticket{
    Child_ticket_Concession(int n){

    }
}
