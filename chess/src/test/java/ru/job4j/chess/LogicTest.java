package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.black.BishopBlack;

import static ru.job4j.chess.firuges.Cell.*;

public class LogicTest {

    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(C1));
        logic.move(C1, H6);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void impossibleMoveException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(C1));
        logic.move(C1, C2);
    }

    @Test(expected = OccupiedCellException.class)
    public void occupiedCellException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(C1));
        logic.add(new BishopBlack(D2));
        logic.move(C1, D2);
    }

    @Test(expected = FigureNotFoundException.class)
    public void figureNotFoundException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(C1));
        logic.move(D2, E3);
    }

    @Test
    public void moveD4ToA1()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(D4));
        logic.move(D4, A1);
    }

    @Test
    public void moveD4ToG1()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(D4));
        logic.move(D4, G1);
    }

    @Test
    public void moveD4ToA7()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(D4));
        logic.move(D4, A7);
    }

    @Test
    public void moveD4ToH8()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(D4));
        logic.move(D4, H8);
    }
}