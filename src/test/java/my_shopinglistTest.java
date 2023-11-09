

import static org.junit.Assert.*;

import org.junit.Test;

public class my_shopinglistTest {
    @Test
    public void testAddItem() {
        my_shopinglist shoppingList = new my_shopinglist();
        shoppingList.addItem("Latte");
        assertTrue(shoppingList.viewItems().contains("Latte"));
    }

    @Test
    public void testRemoveItem() {
        my_shopinglist shoppingList = new my_shopinglist();
        shoppingList.addItem("Uova");
        shoppingList.removeItem("Uova");
        assertFalse(shoppingList.viewItems().contains("Uova"));
    }
}

