package Task3;

public class Line {
	static final int MAX_COL = 10;
	String lineName;
	String[] arr;

	Line(String lineName){
		this.lineName = lineName;
		arr = new String[MAX_COL];
		for (int i = 0; i < MAX_COL; i++)
			arr[i] = "__";
	}

	void show()
	{
		System.out.print(this.lineName + ">> ");
		for (int i = 0; i < MAX_COL; i++)
			System.out.print(arr[i] + " ");
		System.out.print("\n");
	}

	int reserve(int col, String newName)
	{
		if (col < 0 || col > MAX_COL)
			return (2);
		else if (arr[col].equals("__"))
			arr[col] = newName;
		else
			return (5);
		return (0);
	}

	int cancel(String tagetName)
	{
		for (int i = 0; i < MAX_COL; i++) {
			if (arr[i].equals(tagetName)) {
				arr[i] = "__";
				return (0);
			}
		}
		return (4);
	}
}
