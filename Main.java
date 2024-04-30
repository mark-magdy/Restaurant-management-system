 /* System Requirements:
        - The restaurant will have different branches.
        - Each branch will have a menu with different menu sections containing various menu items.
        - Waiters should be able to create orders for tables and add meals for each seat.
        - Each meal can have multiple meal items, corresponding to menu items.
        - The system should track available tables for walk-in customers and support table reservations.
        - Receptionists can search for available tables by date/time and reserve them.
        - Customers should be able to cancel reservations.
        - The system should send notifications for approaching reservation times.
        - Customers can pay their bills using credit cards, checks, or cash.
        - Each branch can have multiple seating arrangements.

        2. **Use Case Diagram**:
        - Actors:
        - **Receptionist**: Responsible for managing tables, layouts, and reservations.
        - **Waiter**: Takes/updates orders.
        - **Manager**: Adds workers and modifies the menu.
        - **Chef**: Views and works on orders.
        - **Cashier**: Generates checks and processes payments.
        - **System**: Sends notifications about reservations, cancellations, etc.

        3. **Class Diagram**:
        - Key classes:
        - `RestaurantBranch`: Represents a restaurant branch.
        - `Menu.Menu`: Contains menu sections and menu items.
        - `Table`: Represents a table with attributes like capacity and availability.
        - `Order`: Contains meals for a table.
        - `Meal`: Comprises multiple meal items.
        - `Menu.MenuItem`: Represents a menu item.
        - `Reservation`: Stores reservation details.
        - `NotificationService`: Handles notifications.
        - Other classes for actors (Receptionist, Waiter, Manager, Chef, Cashier).

*/
public class Main {
    static void main (String[] args){
        Restaurant firstBranch = new Restaurant();
    }
}
