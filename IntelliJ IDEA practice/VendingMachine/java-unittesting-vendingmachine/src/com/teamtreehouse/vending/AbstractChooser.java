package com.teamtreehouse.vending;

public abstract class AbstractChooser {
    private final int maxRows;
    private final int maxColumns;

    public class Location {
        private final int row;
        private final int column;

        protected Location(int row, int column) throws InvalidLocationException {
            if (row > maxRows || column > maxColumns) {
                throw new InvalidLocationException("Invalid Location");
            }
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }
    }

    public AbstractChooser(int maxRows, int maxColumns) {
        this.maxRows = maxRows;
        this.maxColumns = maxColumns;
    }

    public abstract Location locationFromInput(String input) throws InvalidLocationException;
}

90 t1 wood
90 t1 rock
90 t2 plank
90 t2 stone  ----->  repair station

90 t1 wood
10 t1 rock
300 t3 stone stone ----> sadle

120 t1 logs
12 t1 rocks
180 t4 stone --->  house

25 t1 wood
3 t1 rock
150 t2 stone ---> weaver

