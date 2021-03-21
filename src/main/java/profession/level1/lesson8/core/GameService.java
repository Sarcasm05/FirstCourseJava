package main.java.profession.level1.lesson8.core;

import main.java.profession.level1.lesson8.core.domain.MatrixCoordinate;
import main.java.profession.level1.lesson8.enums.DotType;

public interface GameService {

    MatrixCoordinate aiTurn();

    void humanTurn(int rowIndex, int columnIndex);

    boolean checkWin(DotType dotType);

    boolean isMapFull();

}
