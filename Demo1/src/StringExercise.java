
public class StringExercise {

	public static void main(String[] args) {
		String exercise="The quick brown fox jumps over the lazy dog";
		
		System.out.println("Character at 12th index:"+exercise.charAt(12));
		System.out.println("String contains 'is':"+exercise.contains("is"));
		System.out.println(exercise.concat(" and killed it"));
		System.out.println(exercise);
		System.out.println("String ends with 'dogs':"+exercise.endsWith("dogs"));
		System.out.println("Length of the string:"+exercise.length());
		String s1="The quick brown Fox jumps over the lazy Dog";
		String s2="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		System.out.println("Match"+exercise.matches("The quick brown fox jumps over the lazy dog"));
		System.out.println("String content equals case 1:"+exercise.contentEquals(s1));
		System.out.println("String equals case 2:"+exercise.equals(s2));
		System.out.println("Animal 1:"+exercise.substring(16,19));
		System.out.println("Animal 2:"+exercise.substring(40,43));
		System.out.println(exercise.toUpperCase());
		System.out.println(exercise.toLowerCase());
		System.out.println("index of 'a'"+exercise.indexOf("a"));
		System.out.println("last index of 'e'"+exercise.lastIndexOf("e"));
		String []sp=exercise.split("jumps");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		System.out.println(exercise.replace("The", "A"));
	}
}
