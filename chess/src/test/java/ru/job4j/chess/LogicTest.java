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
/*
1. По объекту типа Cell source в массиве figures найти объект типа Figure.
Для этого используется метод findBy. Он возвращает индекс ячейки или выкидывает исключение.
2. Если объект найден, то нужно получить его ходы до клетки Cell dest.
Это нужно сделать через метод way объекта Figure.
3. Дальше нужно проверить, что массив клеток от метода way не заполнен другими объектами
класса Figure. Если он не заполнен, то нужно в массив figures в позицию, полученную в пункте 1,
записать новый объект, полученный из метода figure.copy.

Для каждого случая работы метода Logic.move нужно написать тест-методы.
 */