public class StringMethods {

    public static void main(String[] args) {
        //String = a reference data type that can store one or more characters
        //         reference data types have access to useful methods.

        String name = "Zoly"; //Initialize String 'name' to Zoly
        String spacedName = "      Zoly   "; //Initialize String 'spaceName' to Zoly with spaces on either side

        //Checks to see if a String is EXACTLY just like the original String
        boolean resultEqualStringsCase = name.equals("zoly");
        System.out.println(resultEqualStringsCase);

        //Checks to see if a String is just like the original String but not case-sensitive (S = s)
        boolean resultEqualStrings = name.equalsIgnoreCase("zoly");
        System.out.println(resultEqualStrings);

        //Returns the length of the 'name'
        int lengthName = name.length();
        System.out.println(lengthName);

        //Returns a character at a certain spot specified by the user (remember zero-based indexing)
        char singleCharacter = name.charAt(3);
        System.out.println(singleCharacter);

        //Finds the position of a character and returns its index (in zero-based indexing)
        int positionCharacter = name.indexOf("o");
        System.out.println(positionCharacter);

        //Checks to see if there is nothing in the String or not
        boolean emptySpace = name.isEmpty();
        System.out.println(emptySpace);

        //Turns the String 'name' to completely UPPERCASE
        String upperCase = name.toUpperCase();
        System.out.println(upperCase);

        //Turns the String 'name' to completely lowercase
        String lowerCase = name.toLowerCase();
        System.out.println(lowerCase);

        //Trims the empty spaces in String spacedName
        String trimName = spacedName.trim();
        System.out.println(trimName);

        //Replaces an initial character with a new character from the String 'name'
        String replaceCharacter = name.replace('o', 'a');
        System.out.println(replaceCharacter);

        //Writes a String from the parameters given by the user. Second number is not included and is where the String ENDS!
        String substituteString = name.substring(1,4);
        System.out.println(substituteString);
    }
}
