package net.runelite.client.game;

import net.runelite.api.coords.LocalPoint;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemStackTest {


    @Test
    public void whenCreatingItemStack_thenItemStackCreated() {
        ItemStack sut = new ItemStack(1, 10, LocalPoint.fromScene(500, 500));
        Assert.assertNotNull(sut);
    }

    @Test
    public void givenQuantity10_whenCreatingItemStack_thenGetQuantityReturns10() {
        ItemStack sut = new ItemStack(1, 10, LocalPoint.fromScene(500, 500));
        assertEquals(sut.getQuantity(), 10);
    }

    @Test
    public void givenLocation_whenCreatingItemStack_thenGetLocationReturnsLocation() {
        ItemStack sut = new ItemStack(1, 10, LocalPoint.fromScene(500, 500));
        assertEquals(sut.getLocation(), LocalPoint.fromScene(500, 500));
    }

    @Test
    public void givenUnequalItemStacks_whenCreatingItemStack_thenEqualsReturnsFalse() {
        ItemStack sut = new ItemStack(1, 10, LocalPoint.fromScene(500, 500));
        ItemStack sut2 = new ItemStack(15, 10, LocalPoint.fromScene(500, 500));
        Assert.assertNotEquals(sut, sut2);
    }


}