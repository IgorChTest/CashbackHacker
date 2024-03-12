package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAmountLessBoundary() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = cashbackHack.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountMoreBoundary() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int amount = 1100;

        int expected = 900;
        int actual = cashbackHack.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountEqualsBoundary() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = cashbackHack.remain(amount);


        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountZero() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = cashbackHack.remain(amount);


        assertEquals(expected, actual);
    }

}