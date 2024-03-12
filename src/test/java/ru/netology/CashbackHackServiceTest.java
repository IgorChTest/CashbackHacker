package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    void shouldAmountLessBoundary() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHack.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    void shouldAmountMoreBoundary() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int amount = 1100;

        int actual = cashbackHack.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    void shouldAmountEqualsBoundary() {
        CashbackHackService cashbackHack = new CashbackHackService();

        int amount = 1000;

        int actual = cashbackHack.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}