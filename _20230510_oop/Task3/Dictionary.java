public class Dictionary extends pairMap{
	public static void main(String[] args)
	{
		Dictionary dic = new Dictionary(10);
		dic.put("key1", "value1");
		dic.put("key2", "value2");
		dic.put("key2", "value3");
		System.out.println("Value for key2 is " + dic.get("key2"));
		System.out.println("Value for key1 is " + dic.get("key1"));
		dic.delete("key1");
		System.out.println("Value for key1 is " + dic.get("key1"));
	}

	public Dictionary(int size)
	{
		keyArray = new String[size];
		valueArray = new String[size];
	}

	public String get(String key)
	{
		for(int i = 0; i < length(); i++)
			if(keyArray[i].equals(key))
				return (valueArray[i]);
		return ("null");
	}
	
	public void put(String key, String value)
	{
		for(int i = 0; i < length(); i++)
			if(keyArray[i].equals(key))
			{
				valueArray[i] = value;
				return ;
			}
		valueArray[length()] = value;
		keyArray[length()] = key;
	}

	public void delete(String key)
	{
		for(int i = 0; i < length(); i++)
			if(keyArray[i].equals(key))
			{
				keyArray[i] = keyArray[length() - 1];
				valueArray[i] = valueArray[length() - 1];
				keyArray[length() - 1] = null;
				valueArray[length() - 1] = null;
			}
	}

	public int length()
	{
		int i = 0;
		while (i < keyArray.length && keyArray[i] != null)
			i++;
		return (i);
	}
}

abstract class pairMap {
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract void delete(String key);
	abstract int length();
}
