import java.util.*;

public class test {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("a", 1);
		map.put("b", 2);

		func(map);
	}

	static <T> void func(HashMap<String, T> map) {
		return map.get("a");
	}
}