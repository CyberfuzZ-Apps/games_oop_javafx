package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static ru.job4j.chess.firuges.Cell.*;

public class BishopBlackTest {

    @Test
    public void positionC3() {
        BishopBlack bishopBlack = new BishopBlack(C3);
        Assert.assertEquals(C3, bishopBlack.position());
    }

    @Test
    public void positionA1() {
        BishopBlack bishopBlack = new BishopBlack(A1);
        Assert.assertEquals(A1, bishopBlack.position());
    }

    @Test
    public void copyC1ToD2() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        Figure rsl = bishopBlack.copy(D2);
        Assert.assertEquals(D2, rsl.position());
    }

    @Test
    public void copyF1ToC4() {
        BishopBlack bishopBlack = new BishopBlack(F1);
        Figure rsl = bishopBlack.copy(C4);
        Assert.assertEquals(C4, rsl.position());
    }

    @Test
    public void wayC1ToG5() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        Cell[] rsl = bishopBlack.way(G5);
        Cell[] expected = {D2, E3, F4, G5};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void wayD4ToA1() {
        BishopBlack bishopBlack = new BishopBlack(D4);
        Cell[] rsl = bishopBlack.way(A1);
        Cell[] expected = {C3, B2, A1};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void wayD4ToG1() {
        BishopBlack bishopBlack = new BishopBlack(D4);
        Cell[] rsl = bishopBlack.way(G1);
        Cell[] expected = {E3, F2, G1};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void wayD4ToA7() {
        BishopBlack bishopBlack = new BishopBlack(D4);
        Cell[] rsl = bishopBlack.way(A7);
        Cell[] expected = {C5, B6, A7};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void wayD4ToH8() {
        BishopBlack bishopBlack = new BishopBlack(D4);
        Cell[] rsl = bishopBlack.way(H8);
        Cell[] expected = {E5, F6, G7, H8};
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWrongWay() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        bishopBlack.way(D1);
    }
}