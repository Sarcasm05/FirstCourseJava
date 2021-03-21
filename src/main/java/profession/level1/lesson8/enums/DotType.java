package main.java.profession.level1.lesson8.enums;

public enum DotType {
    X, O, EMPTY;

    public static DotType getEnemyType(DotType playerType) {
        if (playerType == DotType.X) {
            return DotType.O;
        } else {
            return DotType.X;
        }
    }

}
