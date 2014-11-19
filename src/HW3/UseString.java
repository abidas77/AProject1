package HW3;


public class UseString {

	public static void main(String[] args)
	{
		String test = "Blah test  ";
		System.out.println(test.toString());
		System.out.println("3rd letter of string = " + test.charAt(3));
		System.out.println(test.codePointAt(3));
		System.out.println(test.codePointBefore(3));
		System.out.println(test.codePointCount(3, 5));
		System.out.println("Is it equal to \"test\"? " + test.compareTo("test"));
		System.out.println(test.compareToIgnoreCase("blah"));
		System.out.println("Contains \"bla\"?" + test.contains("bla"));
		System.out.println("Starts with \"Bla\"?" + test.startsWith("Bla"));
		System.out.println("Ends with \"c\"?" + test.endsWith("c"));
		System.out.println(test.indexOf("l"));
		System.out.println(test.toUpperCase());
		System.out.println(test.toLowerCase());
		System.out.println(test.trim());
		System.out.println(test.concat("yay"));
		System.out.println(test.isEmpty());
		System.out.println(test.lastIndexOf("l"));
		System.out.println(test.length());
		System.out.println(test.matches("Blah"));
		System.out.println(test.hashCode());
		System.out.println(test.replace('l', 'h'));
		System.out.println(test.replaceAll(" ", "a"));
		System.out.println(test.replaceFirst(" ", "a"));
		System.out.println(test.split("\n")[0]);
		System.out.println(test.equals(test));
		byte[] out = test.getBytes();
		System.out.println(out[0]);
		System.out.println(test.intern());
		System.out.println(test.subSequence(0, 5));
		System.out.println(test.substring(5));
		System.out.println(test.toCharArray()[0]);
	}
}
