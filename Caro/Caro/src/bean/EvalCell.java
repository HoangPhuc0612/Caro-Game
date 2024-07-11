package bean;

public class EvalCell{ // đại diện cho một ô trên bàn cờ và giá trị của ô đó sau khi được đánh giá
	private Cell cell;
	private int value; // giá trị của ô sau khi được đánh giá
	
	public EvalCell() {
		cell = new Cell();
		value = 0;
	}
	
	public EvalCell(Cell cell, int value) {
		this.cell = cell;
		this.value = value;
	}
	
	public EvalCell(int x, int y, int value) {
		this.cell = new Cell(x, y);
		this.value = value;
	}
	
	public Cell getCell() {
		return this.cell;
	}
	
	public int getX() {
		return this.cell.getX();
	}
	
	public int getY() {
		return this.cell.getY();
	}
	
	public int getValue() {
		return this.value;
	}

}
